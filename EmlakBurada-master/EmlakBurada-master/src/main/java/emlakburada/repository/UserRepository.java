package emlakburada.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import emlakburada.model.Advert;
import emlakburada.model.User;

@Repository
public class UserRepository {
	
	
	private List<User> users=new ArrayList<>();
	
	
	public User saveUser(User user) {
		
		
		users.add(user);
		
		return user;
		
	}
	
	public List<User> findAllUsers(){
	
		return users;
	}
	
	public User findByIdUser(Integer id) {
		
		
		return users.stream().filter(user -> user.getId()== id).findAny().orElse(new User());
		
		
	}

}
