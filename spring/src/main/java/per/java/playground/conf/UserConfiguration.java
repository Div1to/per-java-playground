package per.java.playground.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import per.java.playground.beans.User;

@Component
public class UserConfiguration {

	@Bean
	public User getUser() {
		return new User("by config",11);
	}
}
