package com.isuru20.modal;

import java.io.IOException;
import java.util.logging.*;

public class LogWritter {

    public static final Logger logger = Logger.getLogger("tuition-manager");

    static {
        try {
            FileHandler fileHandler = new FileHandler("tuition-manager.log", true);
            fileHandler.setFormatter(new SimpleFormatter());
            logger.addHandler(fileHandler);

        } catch (IOException | SecurityException ex) {
            LogWritter.logger.log(Level.WARNING, "Student Profile City Loading", ex);
        }
    }
}
