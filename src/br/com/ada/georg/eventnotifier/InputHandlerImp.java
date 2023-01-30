package br.com.ada.georg.eventnotifier;

import br.com.ada.georg.eventnotifier.model.Notification;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class InputHandlerImp implements InputHandler {
    private static Scanner scanner = new Scanner(System.in);

    public static final DateTimeFormatter FORMATTER
            = DateTimeFormatter.ofPattern("dd-MM-uuuu HH:mm");
    public Integer getNumberOfMessages(){
        System.out.println("Insert the number of notifications you would like to send (0 to quit):");
        return getInteger(scanner);
    }

    public Notification getNotification() {
        return new Notification(getPersonName(), getMessage(), LocalDateTime.now().format(FORMATTER));
    }

    public String getPersonName() {
        System.out.println("Insert the person's name:");
        return getInput(scanner);
    }

    public String getMessage() {
        System.out.println("Insert the notification message:");
        return getInput(scanner);
    }
}
