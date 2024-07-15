package model;

import interfaces.iSelectionBox;

public class WinSelectionBox implements iSelectionBox {
    private String textValue;

    public WinSelectionBox(String textValue) {
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
        return "Texto do selectionBox Windows: " + this.textValue;
    }
}
