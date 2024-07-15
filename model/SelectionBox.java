package model;

import interfaces.iSelectionBox;

public class SelectionBox implements iSelectionBox {
    private String textValue;

    public SelectionBox(String textValue) {
        this.textValue = textValue;
    }

    @Override
    public String getTextValue() {
        return this.textValue;
    }

    @Override
    public void setTextValue(String newTextValue) {
        this.textValue = newTextValue;
    }

    @Override
    public String toString() {
        return "Texto do selectionBox: " + this.textValue;
    }
}
