package io.github.sampathsl.springboot.security.server.springsecurityoauthserver.contoller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/hello")
public class HelloController {

	public String helloRest() {
		return "Hello Spring!";
	}

}
