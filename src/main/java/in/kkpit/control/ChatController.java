package in.kkpit.control;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import in.kkpit.model.chatMessage;

@Controller
public class ChatController {
	
	@MessageMapping("/sendMessage")
	@SendTo("/topic/messages")
	public chatMessage sendMessage(chatMessage message) {
		return message;
	}
	
	@GetMapping("chat")
	public String chat() {
		return "chat";
	}
}
