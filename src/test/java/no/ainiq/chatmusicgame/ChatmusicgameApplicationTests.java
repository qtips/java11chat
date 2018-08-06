package no.ainiq.chatmusicgame;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest(classes = ChatmusicgameApplication.class)
@ActiveProfiles("dev")
public class ChatmusicgameApplicationTests {

    @Test
    public void contextLoads() {
        System.out.println("hei");
    }

}

