package br.edu.ifpe.recife.gcms.WebApp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
	@RequestMapping("/")
	public @ResponseBody String greeting() {
	return "Hello, World";
	}
	
	@RequestMapping("/")
	public @ResponseBody String greeting() {
	return "Hello, change from 1 copy";
	}
	
	@RequestMapping("/julia")
	public @ResponseBody String greetingFulano() {
	return "Hello, Julia Didra!";
	}
	
	@RequestMapping("/clone")
	public @ResponseBody String greetingclone() {
	return "Hello, clone!";
	}
	
	@RequestMapping("/hotfix")
	public @ResponseBody String greetinghotfix() {
	return "Hello, hotfix!";
	}
	
}