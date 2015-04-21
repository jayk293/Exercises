package mine.java.ms;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.List;

public class Checkout {

	public Double checkOut(List<String> basket){
	
	double numApple = 0.0;
	double numOrange = 0.0;	
	final double PRICE_APPLES = 0.6;
	final double PRICE_ORANGE = 0.25;
	
	for(String fruit: basket){
		if(fruit.equals("apple")){
			numApple++;
		}else if( fruit.equals("orange")){
			numOrange++;
		}
	}	
	//use BigDeciaml to account for rounding errors
	BigDecimal costApples = new BigDecimal(PRICE_APPLES * numApple);
	BigDecimal costOranges = new BigDecimal(PRICE_ORANGE * numOrange);
	
	return (costApples.add(costOranges)).round(new MathContext(3, RoundingMode.HALF_UP)).doubleValue();		
	}
}
