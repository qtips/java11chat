package no.ainiq.chatmusicgame;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.AbstractWebSocketMessageBrokerConfigurer;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;

@Configuration
@EnableWebSocketMessageBroker
public class WebSocketConfig extends AbstractWebSocketMessageBrokerConfigurer {
    @Override
    public void configureMessageBroker(MessageBrokerRegistry config) {
        //enable a simple memory-based message broker on destinations prefixed with "/topic"
        config.enableSimpleBroker("/topic");
        // request to resource/controllers are sent to destinations prefixed with "/app"
        config.setApplicationDestinationPrefixes("/app");
    }

    @Override
    public void registerStompEndpoints(StompEndpointRegistry registry) {
        /*
        registers the "/gs-guide-websocket" endpoint, enabling SockJS fallback options so that alternate transports may be used if
        WebSocket is not available. The SockJS client will attempt to connect to "/gs-guide-websocket" and use the best transport available        (websocket, xhr-streaming, xhr-polling, etc).
         */
        registry.addEndpoint("/gs-guide-websocket").setAllowedOrigins("*").withSockJS();
    }
}
