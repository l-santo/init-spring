package ec.edu.itsqmet.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ec.edu.itsqmet.service.IClientService;

@RestController
@RequestMapping("/client")
public class ClientController {

	@Autowired
	private IClientService clientService;

	@GetMapping("/saludarGet")
	public String saludarGet() {
		return clientService.saludarGet();
	}

	@PostMapping("/saludarPost")
	public String saludarPost() {
		return clientService.saludarPost();
	}

	@PutMapping("/saludarPut")
	public String saludarPut() {
		return clientService.saludarPut();
	}

	@DeleteMapping("/saludarDelete")
	public String saludarDeletet() {
		return clientService.saludarDelete();
	}
}
