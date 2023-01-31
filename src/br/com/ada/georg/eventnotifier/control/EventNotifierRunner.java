package br.com.ada.georg.eventnotifier.control;

import br.com.ada.georg.eventnotifier.model.EventNotifier;
import br.com.ada.georg.eventnotifier.model.Notification;

public class EventNotifierRunner {
    private EventNotifier eventNotifier;

    public EventNotifierRunner() {
        this.eventNotifier = new EventNotifier();
    }

    public void run() {
        Integer numberOfPeople = eventNotifier.getNumberOfPeople() ;
        if (numberOfPeople > 0) {
        Notification notification = eventNotifier.addNotification(numberOfPeople);
        eventNotifier.sendNotifications(notification);
        eventNotifier.showAllNotifications();
        eventNotifier.wipeNotifications();
        run();
        }
    }
}
