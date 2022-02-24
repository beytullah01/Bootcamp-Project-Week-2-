package emlakburada.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Service;

import emlakburada.service.EmailService;
@Service
public class ActiveMqConfig {
	
	@Autowired
	private EmailService emailService;
	  
	@JmsListener(destination = "message-queue")
	    public void consume(String message) {
	        System.out.println("Received Message: " + message.toString());
	        emailService.send(message.toString());
	    }
}
