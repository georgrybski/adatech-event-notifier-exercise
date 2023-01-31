package br.com.ada.georg.eventnotifier.repository;

import br.com.ada.georg.eventnotifier.model.Notification;

import java.util.ArrayList;
import java.util.HashMap;

public class InMemoryDatabase {
    private HashMap<Notification, ArrayList<String>> notificationToNames = new HashMap<>();

    public void addNotification(Notification notification, ArrayList<String> names) {
        notificationToNames.put(notification, names);
    }

    public HashMap<Notification, ArrayList<String>> getNotificationToNamesCopy() {
        return new HashMap<>(notificationToNames);
    }

    public ArrayList<String> getRecipients(Notification notification) {
        return notificationToNames.get(notification);
    }

    public void wipeNotifications() {
        notificationToNames.clear();
    }
}
