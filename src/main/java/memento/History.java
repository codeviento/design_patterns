package memento;

import java.util.Stack;

class History {
    private Stack<Memento> history = new Stack<>();

    public void saveMemento(Memento memento) {
        history.push(memento);
    }

    public Memento undo() {
        return history.isEmpty() ? null : history.pop();
    }
}
