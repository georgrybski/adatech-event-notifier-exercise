package br.com.ada.georg.eventnotifier.model;

import br.com.ada.georg.eventnotifier.InputHandlerImp;
import br.com.ada.georg.eventnotifier.repository.InMemoryDatabase;
import br.com.ada.georg.eventnotifier.view.Printer;

public class EventNotifier {
    private InputHandlerImp input = new InputHandlerImp();
    private Printer printer = new Printer();
    private InMemoryDatabase database = new InMemoryDatabase();

    public void showAllNotifications() {
        printer.printAllNotifications(database.getNamesToNotifications());
    }

    public void addNotification() {
        database.addNotification(input.getNotification());
    }

    public void wipeNotifications() {
        database.wipeNotifications();
    }

    public Integer getNumberOfMessages() {
        return input.getNumberOfMessages();
    }
}
