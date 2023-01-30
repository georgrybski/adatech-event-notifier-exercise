package br.com.ada.georg.eventnotifier;

import java.util.Scanner;

public interface InputHandler {
    default String getInput(Scanner scanner) {
        String input = scanner.nextLine().trim();
        if (input.isEmpty()) {
            return getInput(scanner);
        }
        return input;
    }

    default Integer getInteger(Scanner scanner) {
        try {
            return Integer.parseInt(getInput(scanner).trim());
        } catch (NumberFormatException e) {
            return getInteger(scanner);
        }
    }
}
