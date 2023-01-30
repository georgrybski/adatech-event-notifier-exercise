package br.com.ada.georg.eventnotifier.control;

import br.com.ada.georg.eventnotifier.model.EventNotifier;

public class EventNotifierRunner {
    private EventNotifier eventNotifier;
    private boolean running;

    public EventNotifierRunner() {
        this.eventNotifier = new EventNotifier();
    }

    public void run() {
        Integer messagesRemaining = eventNotifier.getNumberOfMessages();
        boolean stillMessagesLeft = messagesRemaining > 0;
        if (stillMessagesLeft) {
            while (messagesRemaining > 0) {
                eventNotifier.addNotification();
                messagesRemaining--;
            }
            eventNotifier.showAllNotifications();
            eventNotifier.wipeNotifications();
            run();
        }
    }
}
