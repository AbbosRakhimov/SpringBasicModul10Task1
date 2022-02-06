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

import uz.pdp.entity.Output;
import uz.pdp.payload.OutputDto;
import uz.pdp.payload.Result;
import uz.pdp.service.OutputService;

@RestController
@RequestMapping(value = "/output")
public class OutputController {

	@Autowired
	OutputService outputService;
	
	@PostMapping
	public Result addOutput(@RequestBody OutputDto outputDto) {
		return outputService.addOutput(outputDto);
	}
	@GetMapping
	public List<Output> geOutputs(){
		return outputService.getOutputs();
	}
	@GetMapping(value = "/{id}")
	public Result getOutput(@PathVariable Integer id) {
		return outputService.getOutput(id);
	}
	@PutMapping(value = "/{id}")
	public Result editOutput(@PathVariable Integer id, @RequestBody OutputDto outputDto) {
		return outputService.editOutput(id, outputDto);
	}
	@DeleteMapping(value = "/{id}")
	public Result deleteOutput(@PathVariable Integer id) {
		return outputService.deleteOutput(id);
	}
	
}
