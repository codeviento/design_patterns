package memento;

public class Main {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        History history = new History();

        editor.write("Version 1");
        history.saveMemento(editor.save()); // Save state

        editor.write("Version 2");
        history.saveMemento(editor.save()); // Save state

        editor.write("Version 3");
        System.out.println("Current Content: " + editor.getContent()); // Version 3

        // Undo
        editor.restore(history.undo());
        System.out.println("After Undo: " + editor.getContent()); // Version 2

        // Undo again
        editor.restore(history.undo());
        System.out.println("After Another Undo: " + editor.getContent()); // Version 1
    }
}
