package org.example;

/**
 * Общие функции для ботов
 */
public interface Bot {
    /**
     * Запуск бота
     */
    void start();

    /**
     * Отправка сообщения
     * @param message сообщение, которое будет отправлено
     */
    void sendMessage(String message);
}
