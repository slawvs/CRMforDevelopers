package pl.slawek.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import pl.slawek.service.UserService;

@Controller
public class SecurityController {
    
	@Autowired
	private UserService userService;
	
	@GetMapping("/login")
    public String login() {
    	return "index";
    }
	
}
