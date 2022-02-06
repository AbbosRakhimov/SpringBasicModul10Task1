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

import uz.pdp.entity.Product;
import uz.pdp.payload.ProductDto;
import uz.pdp.payload.Result;
import uz.pdp.service.ProductService;


@RestController
@RequestMapping(value = "/product")
public class ProductController {

	@Autowired
	ProductService productService;
	
	@PostMapping
	public Result addProduct(@RequestBody ProductDto productDto) {
		return productService.addProduct(productDto);
	}
	@GetMapping
	public List<Product> getProducts(){
		return productService.getProducts();
	}
	@GetMapping(value = "/{id}")
	public Result getProduct(@PathVariable Integer id) {
		return productService.getProduct(id);
	}
	@PutMapping(value = "/{id}")
	public Result editProduct(@PathVariable Integer id, @RequestBody ProductDto productDto) {
		return productService.editProduct(id, productDto);
	}
	@DeleteMapping(value = "/{id}")
	public Result deletProduct(@PathVariable Integer id) {
		return productService.deletePrduct(id);
	}
}
