package indigo.model;

import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnore;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * The model for the user to be stored in the database
 */
@Document(collection = "User")
public class User {

	public static final PasswordEncoder PASSWORD_ENCODER = new BCryptPasswordEncoder();

	@Id // Should be String to avoid duplicate key error.
	private String id;

	/**
	 * First name of the User
	 */
	private String firstName;

	/**
	 * Last name of the User
	 */
	private String lastName;

	private @JsonIgnore String password;
	/**
	 * To know active status and to soft delete the User record from the database.
	 */
	private boolean isActive;

	/**
	 * Email of the person
	 */
	private String email;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	/**
	 * No argument constructor to instantiate the object
	 */
	public User() {
	}

	/**
	 * Constructor for creating the user object
	 *
	 * @param firstName
	 * @param lastName
	 * @param email
	 */
	public User(final String firstName, final String lastName, String password) {
//		this.id = Long.parseLong(UUID.randomUUID().toString());
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = PASSWORD_ENCODER.encode(password);
		this.isActive = true;
	}

	@Override
	public String toString() {
		return String.format("User[id='%s', firstName='%s', lastName='%s']", id, firstName, lastName);
	}
}