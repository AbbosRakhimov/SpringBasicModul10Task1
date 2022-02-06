package uz.pdp.payload;

import java.util.Date;

import lombok.Data;
@Data
public class InputProductDto {

	private Integer productId;
	private Integer inputId;
	private Double amount;
	private Double price;
	private Date expireDate;


}
