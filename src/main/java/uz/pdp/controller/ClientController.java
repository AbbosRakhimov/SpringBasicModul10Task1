package uz.pdp.controller;

import java.util.List;

import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import uz.pdp.entity.Client;
import uz.pdp.payload.ClientDto;
import uz.pdp.payload.Result;
import uz.pdp.service.ClientService;

@RestController
@RequestMapping(value = "/client")
public class ClientController {

	@Autowired
	ClientService clientService;
	
	@PostMapping
	public Result addClient(@RequestBody ClientDto clientDto) {
		return clientService.addClient(clientDto);
	}
	@GetMapping
	public List<Client> getClients(){
		return clientService.geClients();
	}
	@GetMapping(value = "/{id}")
	public Result getClient(@PathVariable Integer id) {
		return clientService.getCleint(id);
	}
	@PutMapping(value = "/{id}")
	public Result editCleint(@PathVariable Integer id, @RequestBody ClientDto clientDto) {
		return clientService.editClient(id, clientDto);
	}
	@DeleteMapping(value = "/{id}")
	public Result deleteClient(@PathVariable Integer id) {
		return clientService.deleteClient(id);
	}
}
