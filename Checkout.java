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
		
		//find the deal on buy 1 get one free apples
		if(numApple % 2.0 == 0.0){ //even number of apples
			numApple = (numApple / 2.0);
		} else {
			numApple = ((numApple - 1.0)/2.0)+1.0;
		}
		//find the deal on 3 for 2 oranges
		if(numOrange % 3.0 == 0){
			numOrange = (numOrange*(2.0/3.0));
		} else if( numOrange % 3.0 == 2.0){// 5 oranges should return 4
			numOrange = (numOrange-2.0)*(2.0/3.0)+2.0;
		} else if( numOrange % 3.0 == 1.0){ //4 oranges should return 3
			numOrange = ((numOrange-1.0)*(2.0/3.0)+1.0);
		}
		//use BigDeciaml to account for rounding errors
		BigDecimal costApples = new BigDecimal(PRICE_APPLES * numApple);
		BigDecimal costOranges = new BigDecimal(PRICE_ORANGE * numOrange);
		
	return (costApples.add(costOranges)).round(new MathContext(3, RoundingMode.HALF_UP)).doubleValue();		
	}
}
