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

import uz.pdp.entity.Warehouse;
import uz.pdp.payload.Result;
import uz.pdp.service.WarehouseService;

@RestController
@RequestMapping(value = "/warehouse")
public class WarehouseController {

	@Autowired
	WarehouseService warehouseService;
	
	@PostMapping
	public Result addWarehouse(@RequestBody Warehouse warehouse) {
		return warehouseService.addWarehous(warehouse);
	}
	@GetMapping
	public List<Warehouse> getWarehouses(){
		return warehouseService.getWarehouses();
	}
	@GetMapping(value = "/{id}")
	public Result getWarehous(@PathVariable Integer id) {
		return warehouseService.getWarehi(id);
	}
	@PutMapping(value = "/{id}")
	public Result editWarehouse(@PathVariable Integer id, @RequestBody Warehouse warehouse) {
		return warehouseService.editWarehouse(id, warehouse);
	}
	@DeleteMapping(value = "/{id}")
	public Result deleteWarehiuse(@PathVariable Integer id) {
		return warehouseService.deleteWarehouse(id);
	}
}
