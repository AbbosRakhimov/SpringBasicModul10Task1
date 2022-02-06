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

import uz.pdp.entity.Measurement;
import uz.pdp.payload.Result;
import uz.pdp.service.MesurementService;

@RestController
@RequestMapping("/measurement")
public class MeasurementController {

	@Autowired
	MesurementService mesurementService;
	
	@GetMapping
	public List<Measurement> getMeasurements(){
		return mesurementService.getMeasurements();
	}
	
	@GetMapping("/{id}")
	public Result getMeasurement(@PathVariable Integer id) {
		return mesurementService.getMeaturemint(id);
	}
	
	@PostMapping
	public Result saveMeausrement(@RequestBody Measurement measurement) {
		return mesurementService.saveMesauResult(measurement);
	}
	@PutMapping("/{id}")
	public Result editMeasurement(@PathVariable Integer id, @RequestBody Measurement measurement) {
		return mesurementService.editMeResult(id, measurement);
	}
	@DeleteMapping("/{id}")
	public Result deleteMeasurement(@PathVariable Integer id) {
		return mesurementService.deletMeaResult(id);
	}
}
