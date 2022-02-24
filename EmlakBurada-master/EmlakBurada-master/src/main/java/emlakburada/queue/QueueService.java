package emlakburada.queue;



import emlakburada.service.EmailMessage;


public interface QueueService {
	
	void sendMessage(EmailMessage email);

}
