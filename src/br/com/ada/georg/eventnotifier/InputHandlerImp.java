package br.com.ada.georg.eventnotifier;

import br.com.ada.georg.eventnotifier.model.Notification;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class InputHandlerImp implements InputHandler {
    private static Scanner scanner = new Scanner(System.in);

    public static final DateTimeFormatter FORMATTER
            = DateTimeFormatter.ofPattern("dd-MM-uuuu HH:mm");
    public Integer getNumberOfPeople(){
        System.out.println("Digite o número de pessoas que irá receber a notificação");
        return getInteger(scanner);
    }

    public Notification getNotification() {
        return new Notification(getMessage(), LocalDateTime.now().format(FORMATTER));
    }

    public String getPersonName() {
        System.out.println("Digite o nome de uma pessoa:");
        return getInput(scanner);
    }

    public String getMessage() {
        System.out.println("Digite a mensagem da notificação:");
        return getInput(scanner);
    }
}
