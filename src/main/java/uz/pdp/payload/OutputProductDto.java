package uz.pdp.payload;

import java.util.Date;

import lombok.Data;

@Data
public class OutputProductDto {

	private Integer productId;
	private Integer outputId;
	private Double amount;
	private Double price;
	private Date expireDate;
}
