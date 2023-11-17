package dev.skha.ismail_shopapimongoDb;

import dev.skha.ismail_shopapimongoDb.model.User;
import dev.skha.ismail_shopapimongoDb.repositories.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class IsmailShopApiMongoDbApplication implements CommandLineRunner {

	private final UserRepository userRepository;

	public IsmailShopApiMongoDbApplication(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(IsmailShopApiMongoDbApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		if(userRepository.findAll().isEmpty()){
			userRepository.save(new User("skha","khadiri"));
			userRepository.save(new User("ismail","belkader"));
		}
		for (User user: userRepository.findAll()){
			System.out.println(user);
		}
	}
}
