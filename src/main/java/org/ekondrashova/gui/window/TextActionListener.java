package org.ekondrashova.gui.window;

import org.ekondrashova.application.factory.InputProcessorFactory;
import org.ekondrashova.application.factory.LoggerFactory;
import org.ekondrashova.application.io.InputProcessor;
import org.ekondrashova.application.io.Operation;
import org.ekondrashova.application.logger.Logger;
import org.ekondrashova.gui.common.Labels;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextActionListener implements ActionListener {
    private final static Logger LOGGER = LoggerFactory.getLogger(TextActionListener.class);
    private final TextComponent textComponent;
    private final TextComponent outputTextComponent;
    private final InputProcessor inputProcessor = InputProcessorFactory.getInputProcessorWithMatrixEncoder();

    public TextActionListener(TextComponent textComponent, TextComponent outputTextComponent) {
        this.textComponent = textComponent;
        this.outputTextComponent = outputTextComponent;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String action = e.getActionCommand();
        LOGGER.debug("invoke actionPerformed({})", action);
        String text = textComponent.getText();
        switch (action) {
            case Labels.ENCODE_BUTTON:
                setResult(inputProcessor.processIO(Operation.ENCODE, text));
                break;
            case Labels.DECODE_BUTTON:
                setResult(inputProcessor.processIO(Operation.DECODE, text));
                break;
        }
        LOGGER.debug("result actionPerformed({}) : processed", action);
    }

    private void setResult(String result) {
        outputTextComponent.setText(result);
    }
}
