package transafe.controller;

import java.util.Date;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("transafe")
public class HelpCheckController {
	
	@RequestMapping(value = "/helpCheck", method = RequestMethod.GET)
	public String test() {
		return "docker-java-app is up and running: " + new Date();
	}

}
