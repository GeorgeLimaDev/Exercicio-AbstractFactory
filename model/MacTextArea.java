package model;

import interfaces.iTextArea;

public class MacTextArea implements iTextArea {
    private String textValue;

    public MacTextArea(String textValue) {
        this.textValue = textValue;
    }

    @Override
    public String geTextValue() {
        return this.textValue;
    }

    @Override
    public void setTextValue(String newText) {
        this.textValue = newText;
    }

    @Override
    public String toString() {
        return "Texto do textArea Mac: " + this.textValue;
    }
}
