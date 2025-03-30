package memento;

class Memento {
    private final String state; // Stores the state of the Originator

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
