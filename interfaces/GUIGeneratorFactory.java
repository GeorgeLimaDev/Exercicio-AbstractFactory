package interfaces;

import model.Button;
import model.SelectionBox;
import model.TextArea;

public interface GUIGeneratorFactory {
    public Button generateButton(String label);

    public TextArea generateTextArea(String textValue);

    public SelectionBox generateSelectionBox(String textValue);

}
