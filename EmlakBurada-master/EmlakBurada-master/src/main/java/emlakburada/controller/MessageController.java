package emlakburada.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import emlakburada.model.Message;

import emlakburada.service.MesajService;

@RestController
public class MessageController {
	
	@Autowired
	private MesajService mesajService;
	
	@GetMapping(value="/messages")
	public ResponseEntity<List<Message>> getAllMessages(){
		
		
		return new ResponseEntity<>(mesajService.getAllMessages(),HttpStatus.OK);
		
	}
	
	@GetMapping(value="/messages/{id}")
	public ResponseEntity<Message> findByIdMessage(@PathVariable Integer id){
		
		
		return new ResponseEntity<>(mesajService.findByIdMessage(id),HttpStatus.OK);
		
	}
	
	@PostMapping(value="/messages")
	public ResponseEntity<Message> saveMessage(@RequestBody Message message){
		
		
		return new ResponseEntity<>(mesajService.saveMessage(message),HttpStatus.CREATED);
		
	}

}
