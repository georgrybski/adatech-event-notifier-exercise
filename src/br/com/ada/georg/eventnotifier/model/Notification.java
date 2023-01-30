package br.com.ada.georg.eventnotifier.model;

import java.time.LocalDateTime;

public class Notification {
    private String name;
    private String message;

    private String dateTime;

    public Notification(String name, String message, String dateTime) {
        this.name = name;
        this.message = message;
        this.dateTime = dateTime;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name + " recieved a message: -> " + message + " - " + dateTime;
    }
}
