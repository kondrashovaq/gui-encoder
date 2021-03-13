package org.ekondrashova.gui.window;

import java.awt.*;

public class CustomButton extends Button {
    private static final int DEFAULT_BUTTON_WIDTH = 50;
    private static final int DEFAULT_BUTTON_HEIGHT = 50;

    public CustomButton(String label, int x, int y) {
        super(label);
        setBounds(x, y, DEFAULT_BUTTON_WIDTH, DEFAULT_BUTTON_HEIGHT);
    }
}
