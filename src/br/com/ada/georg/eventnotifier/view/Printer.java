package br.com.ada.georg.eventnotifier.view;

import br.com.ada.georg.eventnotifier.model.Notification;

import java.util.ArrayList;
import java.util.HashMap;

public class Printer {
    public void printAllNotifications(HashMap<String, ArrayList<Notification>> namesToNotifications) {
        namesToNotifications.forEach((name, notifications) -> {
            System.out.println(name + " has " + notifications.size() + " notifications: {");
            printNotifications(notifications);
            System.out.println("}");
        });
    }

    public void printNotifications(ArrayList<Notification> notifications) {
        notifications.forEach(notification -> {
            System.out.println("\t" + notification.toString());
        });
    }
}
