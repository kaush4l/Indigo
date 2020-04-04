package indigo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Controller {

	@RequestMapping("/")
	String home() {
		return "Hello Docker World!";
	}
}
