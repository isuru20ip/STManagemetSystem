package com.isuru20.modal;

import java.util.logging.*;

/**
 *
 * @author isuru priyamntha
 */
public class LogWritter {

    public static Logger logger = Logger.getLogger("tuition-manager");

    static {
        try {
            FileHandler fileHandler = new FileHandler("tuition-manager.log", true);
            fileHandler.setFormatter(new SimpleFormatter());
            logger.addHandler(fileHandler);

        } catch (Exception e) {
            logger.log(Level.WARNING, "Erorr", e);
        }
    }
}
