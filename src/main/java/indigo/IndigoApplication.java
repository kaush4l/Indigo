package indigo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import indigo.dao.UserRepository;
import indigo.model.User;

/**
 * The main class for the SpringBootApplication containing the main method. This
 * is also the template class for the bean's
 */
@ComponentScan
@RestController
@SpringBootApplication
public class IndigoApplication implements CommandLineRunner {

	@Autowired
	private UserRepository repository;

	/**
	 * The main method to run the SpringBootApplication
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(IndigoApplication.class, args);
	}

	@RequestMapping("/")
	String home() {
		return "Hello Docker World!";
	}

	@Override
	public void run(String... args) throws Exception {
		// To start with clean state
		repository.deleteAll();
		repository.save(new User("John", "Doe"));
		repository.save(new User("Jim", "Smith"));
		repository.save(new User("Jon", "Abrarian"));
		repository.save(new User("Nara", "Rohit"));
		repository.save(new User("King", "KK"));
		repository.save(new User("K", "K"));
		for (User user : repository.findAll())
			System.out.println(user);
	}

}
