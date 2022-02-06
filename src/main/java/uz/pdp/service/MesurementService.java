package uz.pdp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import uz.pdp.entity.Measurement;
import uz.pdp.payload.Result;
import uz.pdp.repository.MesurementRepository;

@Service
public class MesurementService {

	@Autowired
	MesurementRepository mesurementRepository;

	public List<Measurement> getMeasurements() {
		return mesurementRepository.findAll();
	}

	public Result getMeaturemint(Integer id) {
		Optional<Measurement> mOptional = mesurementRepository.findById(id);
		if (mOptional.isPresent()) {
			return new Result("Measurement exist", true, mOptional.get());
		}
		return new Result("Measurement not found", false, new Measurement());
	}

	public Result saveMesauResult(Measurement measurement) {
		if (mesurementRepository.existsByName(measurement.getName()))
			return new Result("Measurement already exist", false);
		mesurementRepository.save(measurement);
		return new Result("Measurement seccussfuly saved", true);
	}

	public Result editMeResult(Integer id, Measurement measurement) {
		if (mesurementRepository.existsByName(measurement.getName()))
			return new Result("Measurement exist", false);
		Optional<Measurement> mOptional = mesurementRepository.findById(id);
		if (!mOptional.isPresent())
			return new Result("Measurement nor found", false);
		Measurement measurement2 = mOptional.get();
		measurement2.setName(measurement.getName());
		mesurementRepository.save(measurement2);

		return new Result("Measurement seccussfuly edited", true);
	}
	public Result deletMeaResult(Integer id) {
		Optional<Measurement> mOptional= mesurementRepository.findById(id);
		
		if(mOptional.isPresent()) {
			mesurementRepository.deleteById(id);
			return new Result("Measurement seccussfuly deleted", true);
		}
		return new Result("Measurement not found", true);
 
	}
}
