package no.ainiq.chatmusicgame;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.util.HtmlUtils;

@Controller
public class MessageResource {

    @MessageMapping("/chat")  // listen for messages here
    @SendTo("/topic/response") // reply to this topic
    public Greeting message(Message message) {
        return new Greeting("You said "+ HtmlUtils.htmlEscape(message.getMessage()));
    }
}
