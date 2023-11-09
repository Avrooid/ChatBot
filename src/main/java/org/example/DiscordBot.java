package org.example;

import java.util.Scanner;

/**
 * Класс, отвечающий за реализацию дискорд бота
 */
public class DiscordBot implements Bot{
    private final Logic logic;

    public DiscordBot() {
        logic = new Logic();
    }

    @Override
    public void start() {
        System.out.println("Дискорд бот запущен!");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String inputMessage = scanner.nextLine();
            logic.getAndSendMessage(this, inputMessage);
        }
    }

    @Override
    public void sendMessage(String message) {
        System.out.println("DiscordBot: " + message);
    }
}
