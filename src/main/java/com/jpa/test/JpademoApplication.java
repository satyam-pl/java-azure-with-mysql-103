package com.jpa.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.jpa.test.dao.UserRepository;
import com.jpa.test.entities.User;

@SpringBootApplication
public class JpademoApplication {

	public static void main(String[] args) {
	ApplicationContext context =	SpringApplication.run(JpademoApplication.class, args);
	UserRepository userRepository =context.getBean(UserRepository.class);
	
	User user = new User();
	user.setName("ram");
	user.setStatus("true");
	user.setCity("hiidd");
	
	userRepository.save(user);
//	System.out.print(u);
	}

}
