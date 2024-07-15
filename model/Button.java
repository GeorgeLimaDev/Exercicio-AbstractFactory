package model;

import interfaces.iButton;

public class Button implements iButton {
    private String label;

    public Button(String label) {
        this.label = label;
    }

    @Override
    public String getLabel() {
        return this.label;
    }

    @Override
    public void setLabel(String newLabel) {
        this.label = newLabel;
    }

    @Override
    public String toString() {
        return "Label do botão: " + this.label;
    }
}
