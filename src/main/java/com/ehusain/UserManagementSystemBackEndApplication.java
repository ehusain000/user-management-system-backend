package com.ehusain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ehusain.model.User;
import com.ehusain.repository.UserRepository;

@SpringBootApplication
public class UserManagementSystemBackEndApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(UserManagementSystemBackEndApplication.class, args);
	}
	
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public void run(String...args) throws Exception{
		this.userRepository.save(new User("Eftekher", "Husain", "abcd123@gmail.com"));
		this.userRepository.save(new User("John", "Doe", "abcd1243@gmail.com"));
		this.userRepository.save(new User("Jane", "Doe", "abcd1563@gmail.com"));
		
		
	}
	

}
