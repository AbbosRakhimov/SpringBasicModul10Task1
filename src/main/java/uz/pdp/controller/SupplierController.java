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

import uz.pdp.entity.Supplier;
import uz.pdp.payload.Result;
import uz.pdp.payload.SupplierDto;
import uz.pdp.service.SupplierService;

@RestController
@RequestMapping(value = "/supplier")
public class SupplierController {

	@Autowired
	SupplierService supplierService;
	
	@PostMapping
	public Result addSupplier(@RequestBody SupplierDto supplierDto) {
		return supplierService.addSupplier(supplierDto);
	}
	@GetMapping
	public List<Supplier> getResults(){
		return supplierService.getSuppliers();
	}
	@GetMapping(value = "/{id}")
	public Result getSupplier(@PathVariable Integer id) {
		return supplierService.getSupplier(id);
	}
	@PutMapping(value = "/{id}")
	public Result editeSuplier(@PathVariable Integer id, @RequestBody SupplierDto supplierDto) {
		return supplierService.editSupplier(id, supplierDto);
	}
	@DeleteMapping(value = "/{id}")
	public Result deleteSuppleir(@PathVariable Integer id) {
		return supplierService.deleSupplier(id);
	}
}
