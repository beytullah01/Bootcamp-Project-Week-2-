package emlakburada.queue;

import javax.jms.Queue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

import emlakburada.service.EmailMessage;

@Service
public class ActiveMqService implements QueueService {

		@Autowired
	    JmsTemplate jmsTemplate;

	    @Autowired
	    Queue queue;
	
	@Override
	public void sendMessage(EmailMessage email) {
		 jmsTemplate.convertAndSend(queue,email.toString());
		 
	}

}
