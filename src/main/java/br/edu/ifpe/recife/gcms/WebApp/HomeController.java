package br.edu.ifpe.recife.gcms.WebApp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
	//Mais modificações
	//Mais modificações no original
	//Mais modificações no clone da pratica

	@RequestMapping("/")
	publi @ResponseBody String greeting() {
		return "Hello, World";
	}
	
	@RequestMapping("/Julia")
	public @ResponseBody String greetingJulia() {
		return "Hello, Julia";
	}
	
	@RequestMapping("/hotfix")
	public @ResponseBody String greetinghotfix() {
		return "Hello, hotfix";
	}
}
