package org.example;

import java.util.Scanner;

/**
 * Класс, отвечающий за реализацию телеграм бота
 */
public class TelegramBot implements Bot {

    private final Logic logic;

    public TelegramBot() {
        logic = new Logic();
    }

    @Override
    public void start() {
        System.out.println("Телеграм бот запущен!");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String inputMessage = scanner.nextLine();
            logic.getAndSendMessage(this, inputMessage);
        }
    }

    @Override
    public void sendMessage(String message) {
        System.out.println("TelegramBot: " + message);
    }
}
