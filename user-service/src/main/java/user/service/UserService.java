package user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class UserService {

	@Autowired
	UserList ul;
	public ResponseEntity<User> getUser(Integer id) {
		
		for(User user : ul.userLocalList)
		{
			if(user.getId() == id)
			{
				return  new ResponseEntity<User>(user,HttpStatus.ACCEPTED);
			}
		}
		return new ResponseEntity<User>(HttpStatus.NOT_FOUND);
	}

}
