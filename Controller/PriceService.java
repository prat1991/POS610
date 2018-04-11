package Controller;

import java.math.BigDecimal;
import java.util.List;

import Model.Animal;

public class PriceService {
	//This service class calculates all the prices
	
	public BigDecimal calculateTotal(List<Animal> items) {
		
		//TODO iterate through all animals, add total, return total.
		return null;
	}
	
	public BigDecimal calculateChange(BigDecimal payment, BigDecimal total) {
		return payment.subtract(total);
	}

}
