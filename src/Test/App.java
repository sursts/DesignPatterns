package Test;

import Momento.Editor;

public class App {
    public static void main(String[] args) throws Exception {
        var editor = new Editor();
        editor.setContent("a");
        editor.setContent("b");
        System.out.println(editor.getContent());

    }
}
