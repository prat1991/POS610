package Model;

import java.math.BigDecimal;
import java.sql.Date;

public abstract class Animal {
	//TODO this is the parent class of all other animals
	private int UID; //Unique ID for this pet
	private BigDecimal price; //cost of this pet
	private Date dateSold;
	private Date dateStocked;
	
}
