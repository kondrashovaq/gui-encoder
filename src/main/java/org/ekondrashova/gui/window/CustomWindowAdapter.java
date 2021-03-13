package org.ekondrashova.gui.window;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class CustomWindowAdapter extends WindowAdapter {
    private final Window window;
    private final int DEFAULT_EXIT_CODE = 0;

    public CustomWindowAdapter(Window window) {
        this.window = window;
    }

    @Override
    public void windowClosing(WindowEvent e) {
        window.dispose();
        System.exit(DEFAULT_EXIT_CODE);
    }
}
