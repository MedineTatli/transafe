package transafe.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("transafe")
public class HealthCheckController {
	
	@RequestMapping(value = "/healthCheck", method = RequestMethod.GET)
	public String test() {
		return "transafe is up and running: " + new Date();
	}

}
