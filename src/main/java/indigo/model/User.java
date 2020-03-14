package indigo.model;

import javax.validation.constraints.Size;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * The model for the user to be stored in the database
 */
@Document(collection = "User")
public class User {

	@Id // Should be String to avoid duplicate key error.
	private String id;

	/**
	 * First name of the User
	 */
	@Size(min = 2, max = 30)
	private String firstName;

	/**
	 * Last name of the User
	 */
	@Size(min = 2, max = 30)
	private String lastName;

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
	 * To know active status and to soft delete the User record from the database.
	 */
	private boolean isActive;

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
	public User(final String firstName, final String lastName) {
//		this.id = Long.parseLong(UUID.randomUUID().toString());
		this.firstName = firstName;
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return String.format("User[id='%s', firstName='%s', lastName='%s']", id, firstName, lastName);
	}
}