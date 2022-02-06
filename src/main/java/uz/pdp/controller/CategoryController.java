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

import uz.pdp.entity.Category;
import uz.pdp.payload.CategoryDto;
import uz.pdp.payload.Result;
import uz.pdp.service.CategoryService;

@RestController
@RequestMapping(value = "/category")
public class CategoryController {

	@Autowired
	CategoryService categoryService;
	
	@PostMapping
	public Result saveCategory(@RequestBody CategoryDto categoryDto){
		return categoryService.saveCategory(categoryDto);
	}
	@GetMapping
	public List<Category> geCategories(){
		return categoryService.getCategoryes();
	}
	@GetMapping(value = "/{id}")
	public Result getCategory(@PathVariable Integer id) {
		return categoryService.getCategory(id);
	}
	@PutMapping(value = "/{id}")
	public Result editCategory(@PathVariable Integer id, @RequestBody CategoryDto categoryDto) {
		return categoryService.editCategory(id, categoryDto);
	}
	@DeleteMapping(value = "/{id}")
	public Result deleteCategory(@PathVariable Integer id) {
		return categoryService.delteCategory(id);
	}
}
