package model;

import interfaces.iTextArea;

public class WinTextArea implements iTextArea {
    private String textValue;

    public WinTextArea(String textValue) {
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
        return "Texto do textArea Windows: " + this.textValue;
    }
}
