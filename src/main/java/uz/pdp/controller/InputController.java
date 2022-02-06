package uz.pdp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import uz.pdp.entity.Input;
import uz.pdp.payload.InputDto;
import uz.pdp.payload.Result;
import uz.pdp.service.InputService;

@RestController
@RequestMapping(value = "/input")
public class InputController {

	@Autowired
	InputService inputService;
	
	@PostMapping
	public Result addInput(@RequestBody InputDto inputDto) {
		return inputService.addInput(inputDto);
	}
	@GetMapping
	public List<Input> getInputs(){
		return inputService.geInputs();
	}
	@GetMapping(value = "/{id}")
	public Result getInput(@PathVariable Integer id) {
		return inputService.getInput(id);
	}
	@PutMapping("/{id}")
	public Result editsInput(@PathVariable Integer id, @RequestBody InputDto inputDto) {
		return editsInput(id, inputDto);
	}
	@DeleteMapping(value = "/{id}")
	public Result deletInput(@PathVariable Integer id) {
		return inputService.deleteInput(id);
	}
	
}
