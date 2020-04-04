package indigo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import indigo.dao.UserRepository;
import indigo.model.User;

/**
 * The main class for the SpringBootApplication containing the main method. This
 * is also the template class for the bean's
 */
@ComponentScan
@SpringBootApplication
public class IndigoApplication implements CommandLineRunner {

	@Autowired
	private UserRepository repository;

	private static Logger logger = LogManager.getLogger();


	/**
	 * The main method to run the SpringBootApplication
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Current Directory = " + System.getProperty("user.dir"));
		SpringApplication.run(IndigoApplication.class, args);
		logger.debug("This is a debug message");
        logger.info("This is an info message");
        logger.warn("This is a warn message");
        logger.error("This is an error message");
        logger.fatal("This is a fatal message");
	}

	/**
	 * CommandLineRunner method to run commands on startup
	 * 
	 * @param args
	 */
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
