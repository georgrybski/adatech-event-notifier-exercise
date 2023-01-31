package br.com.ada.georg.eventnotifier.model;

public class Notification {
    private String message;

    private String date;

    public Notification(String message, String date) {
        this.message = message;
        this.date = date;
    }

    public String getMessage() {
        return message;
    }

    public String getDate() {
        return date;
    }
}
