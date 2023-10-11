package by.egor.onlinechat.controller;

import by.egor.onlinechat.model.Greeting;
import by.egor.onlinechat.model.HelloMessage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.util.HtmlUtils;

import java.security.Security;

@Controller
public class GreetingController {

    @CrossOrigin(origins = "http://127.0.0.1:5500")
    @MessageMapping("/hello")
    @SendTo("/topic/greetings")
    public Greeting greeting(HelloMessage message) throws Exception {
        Thread.sleep(1000); // simulated delay
        return new Greeting("Hello, " + HtmlUtils.htmlEscape(message.getName()) + "!");
    }


    public Authentication message () {
        return SecurityContextHolder.getContext().getAuthentication();
    }
}
