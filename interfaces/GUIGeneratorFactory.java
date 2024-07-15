package interfaces;

public interface GUIGeneratorFactory {
    public iButton generateButton(String label);

    public iTextArea generateTextArea(String textValue);

    public iSelectionBox generateSelectionBox(String textValue);

}
