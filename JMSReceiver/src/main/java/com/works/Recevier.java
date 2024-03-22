package com.works;

import com.works.models.Email;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class Recevier {

    @JmsListener(destination = "mailDestination", containerFactory = "mailContainerFactory")
    public void recevierEmail(Email email) {
        System.out.println("Send Email:" + email);
    }

}
