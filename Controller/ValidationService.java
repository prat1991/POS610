package Controller;

import java.math.BigDecimal;

public class ValidationService {
	//this class will handle all validations
	
	public boolean validatePaymentAgainstTotal(BigDecimal total, BigDecimal payment) throws Exception {
		if (total.doubleValue() > payment.doubleValue()) {
			BigDecimal shortFunds = total.subtract(payment);
			throw new Exception("Not enough money paid. Please pay: " + shortFunds);
		}
		return true;
		
	}
	
}
