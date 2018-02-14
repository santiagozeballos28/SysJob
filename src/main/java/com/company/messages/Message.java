package com.company.messages;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 *
 * @author santiago.mamani
 */
public class Message {

    public static String getMessage(String messagePattern, Object[] args) {
        Locale locale = new Locale("en", "US");
        ResourceBundle resourceBundle = ResourceBundle.getBundle("com/company/properties/BundleMessage", locale);
        MessageFormat messageFormat = new MessageFormat(resourceBundle.getString(messagePattern));
        return messageFormat.format(args);
    }
}
