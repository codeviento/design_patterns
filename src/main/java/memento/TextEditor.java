package memento;

class TextEditor {
    private String content = "";

    public void write(String text) {
        this.content = text;
    }

    public String getContent() {
        return content;
    }

    public Memento save() { // Saves state into a Memento
        return new Memento(content);
    }

    public void restore(Memento memento) { // Restores state from a Memento
        this.content = memento.getState();
    }
}
