package user.service;

import user.service.User;
import user.service.UserList;
import user.service.UserService;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserConfiguration {
	
	@Bean
	public User getUser()
	{
		return new User();
	}
	
	@Bean
	public UserService getUserService()
	{
		return new UserService();
	}

	@Bean
	public UserList getUserList()
	{
		return new UserList();
	}
}

