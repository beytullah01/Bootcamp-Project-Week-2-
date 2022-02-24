package emlakburada.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import emlakburada.model.Message;
import emlakburada.model.User;
import emlakburada.repository.MessageRepository;
import emlakburada.repository.UserRepository;

@Service
public class MesajService {
	
	@Autowired
	private MessageRepository messageRepository;

	public List<Message> getAllMessages() {
	 
		return messageRepository.allMessages();
	}
	
	public Message saveMessage(Message message) {
		
		return messageRepository.saveMessages(message);
		
	}
	
	public Message findByIdMessage(Integer id) {
		
		return messageRepository.findByIdMessage(id);
		
	}

}
