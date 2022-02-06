package uz.pdp.payload;

import lombok.Data;

@Data
public class OutputDto {

	private Integer warehouseId;
	private Integer clientId;
	private Integer currencyId;
	private String factureName;
}
