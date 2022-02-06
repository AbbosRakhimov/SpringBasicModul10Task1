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

import uz.pdp.entity.OutputProduct;

import uz.pdp.payload.OutputProductDto;
import uz.pdp.payload.Result;
import uz.pdp.service.OutputProductService;

@RestController
@RequestMapping(value = "/outputProduct")
public class OutputProductController {

	@Autowired
	OutputProductService outputProductService;
	

	@PostMapping
	public Result addInputProduct(@RequestBody OutputProductDto outputProductDto) {
		return outputProductService.addOutputProduct(outputProductDto);
	}
	@GetMapping
	public List<OutputProduct> geOutputProducts(){
		return outputProductService.getOutputProducts();
	}
	@GetMapping(value = "/{id}")
	public Result getOutputProduct(@PathVariable Integer id) {
		return outputProductService.getOutputProduct(id);
	}
	@PutMapping(value = "/{id}")
	public Result editOutputProduct(@PathVariable Integer id, @RequestBody OutputProductDto outputProductDto) {
		return outputProductService.editOutputProduct(id, outputProductDto);
	}
	@DeleteMapping("/{id}")
	public Result deletOutputProduct(@PathVariable Integer id) {
		return outputProductService.deletOutputProduct(id);
	}
}
