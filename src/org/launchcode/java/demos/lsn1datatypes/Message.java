package org.launchcode.java.demos.lsn1datatypes;

public class Message {

    public static String getMessage(String lang) {

        if (lang.equals("sp")) {
            return "Hola Puta";
        } else if (lang.equals("fr")) {
            return "Bonjour, le monde!";
        } else {
            return "WHADDUP BITCH!";
        }
    }
}
