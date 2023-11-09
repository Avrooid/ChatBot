package org.example;

/**
 * Класс, отвечающий за логику бота, обработку сообщений
 */
public class Logic {

    /**
     * Получить и отправить сообщение
     * @param bot Бот, отправляющий сообщение
     * @param message Сообщение, которое надо отправить
     */
    public void getAndSendMessage(Bot bot, String message) {
        String outputMessage = "Ваше сообщение: " + message;
        bot.sendMessage(outputMessage);
    }
}
