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

import uz.pdp.entity.InputProduct;
import uz.pdp.payload.InputProductDto;
import uz.pdp.payload.Result;
import uz.pdp.service.InputProductSercive;

@RestController
@RequestMapping(value = "/inputProduct")
public class InputProductController {

	@Autowired
	InputProductSercive inputProductSercive;
	
	@PostMapping
	public Result addInputProduct(@RequestBody InputProductDto inputProductDto) {
		return inputProductSercive.addInputProduct(inputProductDto);
	}
	@GetMapping
	public List<InputProduct> geInputProducts(){
		return inputProductSercive.getInputProducts();
	}
	@GetMapping(value = "/{id}")
	public Result getInputProduct(@PathVariable Integer id) {
		return inputProductSercive.getInputProduct(id);
	}
	@PutMapping(value = "/{id}")
	public Result editInputProduct(@PathVariable Integer id, @RequestBody InputProductDto inputProductDto) {
		return inputProductSercive.editInputProduct(id, inputProductDto);
	}
	@DeleteMapping("/{id}")
	public Result deletInputProduct(@PathVariable Integer id) {
		return inputProductSercive.deletInputProduct(id);
	}
}
