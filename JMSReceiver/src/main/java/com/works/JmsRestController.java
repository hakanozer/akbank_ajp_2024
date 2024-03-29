package com.works;

import com.works.models.Email;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class JmsRestController {

    final JmsSender jmsSender;

    @PostMapping("emailSend")
    public String emailSend(@RequestBody Email email) {
        jmsSender.sender(email);
        return email.getTo() + " Send...";
    }

}
