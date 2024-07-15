package model;

import interfaces.iButton;

public class MacButton implements iButton {
    private String label;

    public MacButton(String label) {
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
        return "Label do botão Mac: " + this.label;
    }
}
