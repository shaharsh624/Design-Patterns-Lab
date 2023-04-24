interface Component {
    void showPrice();
    int getPrice();
}

class Leaf implements Component {
    int price;
    String name;
    Leaf(String name, int price){
        this.name = name;
        this.price = price;
    }
    public void showPrice(){
        System.out.println("\t-> " + name + " : " + price);
    }
    public int getPrice() {
        return price;
    }
}
