import java.awt.*;
import java.util.HashMap;
import java.util.Map;
import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    static int Canvas_Size = 500;
    static int Trees_To_Draw = 200000;
    static int Tree_Types = 2;
    public static void main(String[] args) {
        Forest forest = new Forest();
        for(int i = 0; i < Math.floor(Trees_To_Draw / Tree_Types); i ++) {
            forest.plantTree(random(0, Canvas_Size), random(0, Canvas_Size), "Summer Oak", Color.GREEN, "Oak texture stub");
            forest.plantTree(random(0, Canvas_Size), random(0, Canvas_Size), "Autumn Oak", Color.ORANGE, "Autumn Oak texture stub");
        }
        forest.setSize(Canvas_Size, Canvas_Size);
        forest.setVisible(true);

        System.out.println(Trees_To_Draw + " trees drawn");
        System.out.println("--------------------------");
        System.out.println("Memory Usage: ");
        System.out.println("Tree size (8 bytes) * " + Trees_To_Draw);
        System.out.println("+ TreeTypes size (-30 bytes) * " + Tree_Types + " ");
        System.out.println("--------------------------");
        System.out.println("Total: " + ((Trees_To_Draw * 8 + Tree_Types * 30) / 1024 / 1024) + "MB instead of " + ((Trees_To_Draw * 38) / 1024 / 1024) + "MB");
    }

    private static int random(int min, int max) {
        return min + (int) (Math.random() * ((max - min) + 1));
    }
}

class Tree {
    private int x;
    private int y;
    private TreeType type;

    public Tree(int x, int y, TreeType type) {
        this.x = x;
        this.y = y;
        this.type = type;
    }

    public void draw(Graphics g) {
        type.draw(g, x, y);
    }
}

class TreeType {
    private String name;
    private Color color;
    private String otherTreeData;

    public TreeType(String name, Color color, String otherTreeData) {
        this.name = name;
        this.color = color;
        this.otherTreeData = otherTreeData;
    }

    public void draw(Graphics g, int x, int y) {
        g.setColor(Color.BLACK);
        g.fillRect(x - 1, y, 3, 5);
        g.setColor(color);
        g.fillOval(x - 5, y - 10, 10, 10);
    }
}

class TreeFactory {
    static Map<String, TreeType> treeTypes = new HashMap<>();

    public static TreeType getTreeType(String name, Color color, String otherTreeData) {
        TreeType result = treeTypes.get(name);
        if(result == null) {
            result = new TreeType(name, color, otherTreeData);
            treeTypes.put(name, result);
        }
        return result;
    }
}

class Forest extends JFrame {
    private List<Tree> trees = new ArrayList<>();

    public void plantTree(int x, int y, String name, Color color, String otherTreeData) {
        TreeType type = TreeFactory.getTreeType(name, color, otherTreeData);
        Tree tree = new Tree(x, y, type);
        trees.add(tree);
    }

    public void paint(Graphics graphics) {
        for(Tree tree: trees) {
            tree.draw(graphics);
        }
    }
}