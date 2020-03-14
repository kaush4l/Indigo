package indigo.model;

/**
 * Model class for email object
 */
public class Email {

	public String getRecipiant() {
		return recipiant;
	}

	public void setRecipiant(String recipiant) {
		this.recipiant = recipiant;
	}

	public String getMailSubject() {
		return mailSubject;
	}

	public void setMailSubject(String mailSubject) {
		this.mailSubject = mailSubject;
	}

	public String getMailContent() {
		return mailContent;
	}

	public void setMailContent(String mailContent) {
		this.mailContent = mailContent;
	}

	public String getSender() {
		return sender;
	}

	public void setSender(String sender) {
		this.sender = sender;
	}

	/**
	 * The person who is receiving the Email
	 */
	private String recipiant;

	/**
	 * The subject to be displayed on mail
	 */
	private String mailSubject;

	/**
	 * The content to be sent in the mail
	 */
	private String mailContent;

	/**
	 * The sender of the email
	 */
	private String sender;

	/**
	 * No arg constructor
	 */
	public Email() {
	}

	/**
	 * constructor to instantiate the object
	 *
	 * @param reciever
	 * @param mailContent
	 */
	public Email(String reciever, String mailContent) {
		this.recipiant = reciever;
		this.mailContent = mailContent;
		this.sender = "sample.rfp2@gmail.com";
		this.mailSubject = "This is a generated mail from Spring";
	}

}
