package com.slavad.websocket.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
public class Message {
    private String messageContent;

    /*
        In this project I am working only with random id of User.
        But we also cat use sender for showing who was sender and recipient for showing who is recipient

        private String sender;
        private String recipient;
    */
}
