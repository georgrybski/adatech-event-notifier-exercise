package br.com.ada.georg.eventnotifier.view;

import br.com.ada.georg.eventnotifier.model.Notification;

import java.util.ArrayList;
import java.util.HashMap;

public class Printer {
    public void printAllNotificationsInfo(HashMap<Notification, ArrayList<String>> notificationToNames) {
        String[] numberOfPeople = new String[1];
        notificationToNames.entrySet().stream().forEach(entry -> {
            numberOfPeople[0] = entry.getValue().size() == 1 ? " 1 person" : entry.getValue().size() + " people";
            System.out.println("\nAt " + entry.getKey().getDate() + " the message: \"" + entry.getKey().getMessage() + "\" was sent to " + numberOfPeople[0] + ": {");
            entry.getValue().stream().forEach(name -> System.out.println("\t" + name));
            System.out.println("}\n");
        });
    }

    public void printSentMessages(Notification notification, ArrayList<String> names) {
        System.out.println();
        names.forEach(name -> {
            System.out.println(name + " received a message: -> " + notification.getMessage() + " | " + notification.getDate());
        });
    }
}
