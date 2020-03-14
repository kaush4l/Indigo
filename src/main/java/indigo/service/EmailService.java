//package indigo.service;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.mail.SimpleMailMessage;
//import org.springframework.mail.javamail.JavaMailSender;
//import org.springframework.stereotype.Service;
//
//import indigo.model.Email;
//
///**
// * Service class holding the services for email utility services
// */
//@Service
//public class EmailService {
//
//	@Autowired
//	private JavaMailSender mailSender;
//
//	public void sendMessage(Email mailObj) {
//		mailSender.send(injectProperties(mailObj));
//	}
//
//	private SimpleMailMessage injectProperties(Email email) {
//		SimpleMailMessage message = new SimpleMailMessage();
//		message.setTo(email.getRecipiant());
//		message.setText(email.getMailContent());
//		message.setSubject(email.getMailSubject());
//		return message;
//	}
//}