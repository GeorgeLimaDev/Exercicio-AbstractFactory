package interfaces;

import model.MacButton;
import model.MacSelectionBox;
import model.MacTextArea;

public class MacOSGUIFactory implements GUIGeneratorFactory {

    @Override
    public MacButton generateButton(String label) {
        return new MacButton(label);
    }

    @Override
    public MacTextArea generateTextArea(String textValue) {
        return new MacTextArea(textValue);

    }

    @Override
    public MacSelectionBox generateSelectionBox(String textValue) {
        return new MacSelectionBox(textValue);
    }

    public String toString() {
        return "Feito para MacOS";
    }

}
