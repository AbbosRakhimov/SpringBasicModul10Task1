package uz.pdp.entity;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import uz.pdp.template.AbsEntity;


@Data
@Entity
@EqualsAndHashCode(callSuper = true)
public class Measurement extends AbsEntity {
	
	
}
