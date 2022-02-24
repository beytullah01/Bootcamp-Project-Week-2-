package emlakburada.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;



import emlakburada.model.Message;
import emlakburada.model.User;

@Repository
public class MessageRepository {
	
	List<Message> messages=new ArrayList<>();
	
	public Message saveMessages(Message message) {
		
		messages.add(message);
		
		return message;
	}
	
	public  List<Message> allMessages(){
		
		return messages;
	}
	
	public Message findByIdMessage(Integer id) {
		
		
		return  messages.stream().filter(message -> message.getId()== id).findAny().orElse(null);
		
	}

}
