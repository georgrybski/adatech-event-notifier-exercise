package br.com.ada.georg.eventnotifier.model;

import br.com.ada.georg.eventnotifier.InputHandlerImp;
import br.com.ada.georg.eventnotifier.repository.InMemoryDatabase;
import br.com.ada.georg.eventnotifier.view.Printer;

import java.util.ArrayList;

public class EventNotifier {
    private InputHandlerImp input = new InputHandlerImp();
    private Printer printer = new Printer();
    private InMemoryDatabase database = new InMemoryDatabase();


    public Integer getNumberOfPeople() {
        return input.getNumberOfPeople();
    }

    public Notification addNotification(Integer numberOfRecipients) {
        Notification notification = input.getNotification();
        ArrayList<String> recieverList = new ArrayList<>();
        for (int i = 0; i < numberOfRecipients; i++) {
            recieverList.add(input.getPersonName());
        }
        database.addNotification(notification, recieverList);
        return notification;
    }

    public void showAllNotifications() {
        printer.printAllNotificationsInfo(database.getNotificationToNamesCopy());
    }

    public void sendNotifications(Notification notification) {
        printer.printSentMessages(notification, database.getRecipients(notification));
    }

    public void wipeNotifications() {
        database.wipeNotifications();
    }
}
