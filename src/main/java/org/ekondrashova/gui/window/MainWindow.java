package org.ekondrashova.gui.window;

import org.ekondrashova.application.factory.LoggerFactory;
import org.ekondrashova.application.logger.Logger;
import org.ekondrashova.gui.common.CommonParams;
import org.ekondrashova.gui.common.Labels;
import org.ekondrashova.gui.common.Positions;

import java.awt.*;
import java.awt.event.ActionListener;

public class MainWindow extends Frame {
    private final static Logger LOGGER = LoggerFactory.getLogger(MainWindow.class);
    private static final int DEFAULT_WINDOW_WIDTH = 500;
    private static final int DEFAULT_WINDOW_HEIGHT = 300;
    private static final int DEFAULT_H_GAP = 30;
    private static final int DEFAULT_V_GAP = 30;
    private final CustomButton encodeButton = new CustomButton(Labels.ENCODE_BUTTON, Positions.ENCODE_BUTTON_X, Positions.ENCODE_BUTTON_Y);
    private final CustomButton decodeButton = new CustomButton(Labels.DECODE_BUTTON, Positions.DECODE_BUTTON_X, Positions.DECODE_BUTTON_Y);
    private final CustomTextField textField = new CustomTextField(Labels.TEXT_FIELD, CommonParams.TEXT_FIELD_COLUMNS);
    private final CustomTextField outputTextField = new CustomTextField(Labels.EMPTY, CommonParams.TEXT_FIELD_COLUMNS);
    private final Label label = new Label(Labels.RESULT_TEXT);

    public MainWindow() {
        LOGGER.debug("invoke MainWindow() : creating main window");
        setTitle(Labels.APP_TITLE);
        setSize(DEFAULT_WINDOW_WIDTH, DEFAULT_WINDOW_HEIGHT);
        setLayout(new FlowLayout(FlowLayout.CENTER, DEFAULT_H_GAP, DEFAULT_V_GAP));
        setVisible(true);

        addAll(encodeButton, decodeButton);
        add(textField);
        add(label);
        add(outputTextField);

        configureListeners();
        LOGGER.debug("result MainWindow() : main window has been created");
    }

    private void configureListeners() {
        LOGGER.trace("invoke configureListeners()");
        addWindowListener(new CustomWindowAdapter(this));
        ActionListener actionListener = new TextActionListener(textField, outputTextField);
        encodeButton.addActionListener(actionListener);
        decodeButton.addActionListener(actionListener);
        LOGGER.trace("result configureListeners() : configured");
    }

    private void addAll(Component... components) {
        for (Component component : components) {
            add(component);
        }
    }
}