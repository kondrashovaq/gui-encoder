package org.ekondrashova.gui;

import org.ekondrashova.application.factory.LoggerFactory;
import org.ekondrashova.application.logger.LogLevel;
import org.ekondrashova.gui.window.MainWindow;

import org.ekondrashova.application.logger.Logger;

public class Application {
    private final static Logger LOGGER = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        Logger.setLogLevel(LogLevel.TRACE);
        LOGGER.info("START APPLICATION");
        new MainWindow();
    }
}
