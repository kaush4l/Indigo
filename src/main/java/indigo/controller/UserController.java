package indigo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import indigo.dao.UserRepository;
import indigo.model.User;

/**
 * The controller calls related to {@link User} to be stored in database
 */
@RestController
//@RequestMapping("/users")
//@CrossOrigin("*")
public class UserController {

	@Autowired
	UserRepository userRepository;

	/**
	 * The REST mapping for mapping to insert a new {@link User} in the database
	 *
	 * @param firstName
	 * @param lastName
	 * @return {@link User} object that has been saved in the database
	 */
	@RequestMapping("/insert")
	public User insert(@RequestParam(value = "fn", defaultValue = "John") String firstName,
			@RequestParam(value = "ln", defaultValue = "Doe") String lastName) {
		User user = new User(firstName, lastName);
		return userRepository.save(user);
	}
}
