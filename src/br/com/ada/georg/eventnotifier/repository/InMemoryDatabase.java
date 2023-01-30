package br.com.ada.georg.eventnotifier.repository;

import br.com.ada.georg.eventnotifier.model.Notification;

import java.util.ArrayList;
import java.util.HashMap;

public class InMemoryDatabase {
    public HashMap<String, ArrayList<Notification>> namesToNotificationArrayList = new HashMap<>();

    public void addNotification(Notification notification) {
        if (namesToNotificationArrayList.containsKey(notification.getName())) {
            namesToNotificationArrayList.get(notification.getName()).add(notification);
        } else {
            ArrayList<Notification> notifications = new ArrayList<>();
            notifications.add(notification);
            namesToNotificationArrayList.put(notification.getName(), notifications);
        }
    }

    public void wipeNotifications() {
        namesToNotificationArrayList.clear();
    }

    public HashMap<String, ArrayList<Notification>> getNamesToNotifications() {
        return namesToNotificationArrayList;
    }
}
