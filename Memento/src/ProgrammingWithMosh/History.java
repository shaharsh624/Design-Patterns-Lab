package ProgrammingWithMosh;
// Care Taker
import java.util.*;
public class History {
    private List<EditorState> states = new ArrayList<>();
    public void push(EditorState state) {
        states.add(state);
    }
    public EditorState pop () {
        var lastIndex = states.size()-1;
        var lastState = states.get(lastIndex);
        states.remove(lastIndex);
        return lastState;
    }
}
