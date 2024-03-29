package com.works;

import com.works.models.Email;
import lombok.RequiredArgsConstructor;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class JmsSender {

    final JmsTemplate jmsTemplate;

    public void sender(Email email) {
        jmsTemplate.convertAndSend("mailDestination", email);
    }

}
