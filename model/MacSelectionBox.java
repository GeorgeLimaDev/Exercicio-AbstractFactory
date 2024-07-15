package model;

import interfaces.iSelectionBox;

public class MacSelectionBox implements iSelectionBox {
    private String textValue;

    public MacSelectionBox(String textValue) {
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
        return "Texto do selectionBox Mac: " + this.textValue;
    }
}
