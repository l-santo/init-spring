package ec.edu.itsqmet.service.impl;

import org.springframework.stereotype.Service;

import ec.edu.itsqmet.service.IClientService;

@Service
public class ClientService implements IClientService {

	public String saludarGet() {
		return "Soy un Método Get";
	}

	public String saludarPost() {
		return "Soy un Método Post";
	}
	
	public String saludarPut() {
		return "Soy un método Put";
	}
	
	public String saludarDelete() {
		return "Soy un Método Delete";
	}

}
