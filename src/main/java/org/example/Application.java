package org.example;

import java.util.List;

public class Application {

    public static void main(String[] args) {
        Bot discordBot = new DiscordBot();
        Bot telegramBot = new TelegramBot();
        List<Bot> bots = List.of(discordBot, telegramBot);
        bots.forEach(Bot::start);
    }
}
