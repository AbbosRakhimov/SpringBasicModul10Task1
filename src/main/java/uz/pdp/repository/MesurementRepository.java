package uz.pdp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import uz.pdp.entity.Measurement;

public interface MesurementRepository extends JpaRepository<Measurement, Integer>  {

	boolean existsByName(String name);
}
