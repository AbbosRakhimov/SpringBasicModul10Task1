package uz.pdp.payload;

import java.sql.Timestamp;


import lombok.Data;

@Data
public class InputDto {

	private Integer warehouseId;
	private Integer supplierId;
	private Integer currencyId;
	private String factureName;
}
