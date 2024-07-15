package interfaces;

import model.Button;
import model.SelectionBox;
import model.TextArea;

public class WindowsGUIFactory implements GUIGeneratorFactory {

    @Override
    public Button generateButton(String label) {
        return new Button(label);
    }

    @Override
    public TextArea generateTextArea(String textValue) {
        return new TextArea(textValue);

    }

    @Override
    public SelectionBox generateSelectionBox(String textValue) {
        return new SelectionBox(textValue);
    }

    public String toString() {
        return "Feito para Windows";
    }

}
