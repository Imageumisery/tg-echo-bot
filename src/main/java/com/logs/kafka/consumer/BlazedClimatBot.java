package com.logs.kafka.consumer;

import org.springframework.beans.factory.annotation.Value;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.GetFile;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.File;
import org.telegram.telegrambots.meta.api.objects.PhotoSize;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class BlazedClimatBot extends TelegramLongPollingBot {

    String BOT_TOKEN = System.getenv("VARIABLE_NAME");


    @Override
    public void onUpdateReceived(Update update) {
        // We check if the update has a message and the message has text
        if (update.hasMessage() && update.getMessage().hasText()) {
            SendMessage message = new SendMessage(); // Create a SendMessage object with mandatory fields
            message.setChatId(update.getMessage().getChatId().toString());
            message.setText(update.getMessage().getText());

            try {
                execute(message); // Call method to send the message
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }
    }


    @Override
    public String getBotUsername() {
        // TODO
        return "BlazedClimatBot";
    }

    @Override
    public String getBotToken() {
        // TODO
        return "2007016716:AAHFFPQe_4cSwzxQpva8MS-TGpaOnTupElw";
    }

    public void Bot(@Value("${VARIABLE_NAME}") String botToken) {
        String BOT_TOKEN = System.getenv("VARIABLE_NAME");
    }

//    public PhotoSize getPhoto(Update update) {
//        // Check that the update contains a message and the message has a photo
//        if (update.hasMessage() && update.getMessage().hasPhoto()) {
//            // When receiving a photo, you usually get different sizes of it
//            List<PhotoSize> photos = update.getMessage().getPhoto();
//
//            // We fetch the bigger photo
//            return photos.stream()
//                    .max(Comparator.comparing(PhotoSize::getFileSize)).orElse(null);
//        }

        // Return null if not found
//        return null;
//    }
//    public String getFilePath(PhotoSize photo) {
//        Objects.requireNonNull(photo);
//
//        if (photo.hasFilePath()) { // If the file_path is already present, we are done!
//            return photo.getFilePath();
//        } else { // If not, let find it
//            // We create a GetFile method and set the file_id from the photo
//            GetFile getFileMethod = new GetFile();
//            getFileMethod.setFileId(photo.getFileId());
//            try {
//                // We execute the method using AbsSender::execute method.
//                File file = execute(getFileMethod);
//                // We now have the file_path
//                return file.getFilePath();
//            } catch (TelegramApiException e) {
//                e.printStackTrace();
//            }
//        }
//
//        return null; // Just in case
//    }
//    public java.io.File downloadPhotoByFilePath(String filePath) {
//        try {
//            // Download the file calling AbsSender::downloadFile method
//            return downloadFile(filePath);
//        } catch (TelegramApiException e) {
//            e.printStackTrace();
//        }
//
//        return null;
//    }

}
