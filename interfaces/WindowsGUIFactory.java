package interfaces;

import model.WinButton;
import model.WinSelectionBox;
import model.WinTextArea;

public class WindowsGUIFactory implements GUIGeneratorFactory {

    @Override
    public WinButton generateButton(String label) {
        return new WinButton(label);
    }

    @Override
    public WinTextArea generateTextArea(String textValue) {
        return new WinTextArea(textValue);

    }

    @Override
    public WinSelectionBox generateSelectionBox(String textValue) {
        return new WinSelectionBox(textValue);
    }

    public String toString() {
        return "Feito para Windows";
    }

}
