package Model;

import java.math.BigDecimal;
import java.util.List;

public abstract class Receipt {
	//this class serves as the foundation for Receipts
	private int UID; //this will also serve as the receipt number
	private BigDecimal total;
	private List<Animal> items; //all the items purchased

}
