package com.logs.kafka.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;


@SpringBootApplication
public class BotLogsApplication {
    public static void main(String[] args) {
        SpringApplication.run(BotLogsApplication.class, args);
//        MyFirstBots myFirstBots = new MyFirstBots();
//        String botToken = args[0];

        try {
            TelegramBotsApi botsApi = new TelegramBotsApi(DefaultBotSession.class);
            botsApi.registerBot(new BlazedClimatBot());
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }
}


