package user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@Autowired
	UserService service ;
	@RequestMapping(path= "/user/{id}")
	public ResponseEntity<User> getUser(@PathVariable int id)
	{
		System.out.println("Call Reached to controller.");
		return service.getUser(id);
	}
	
}
