package mine.java.ms;

import static org.junit.Assert.*;
import org.junit.*;

import java.util.ArrayList;
import java.util.List;


public class CheckoutTest {

	Checkout checkout;
	
	@Before
	public void setUp(){
		checkout = new Checkout();
		
	}
	@Test
	public void testTwoApplesandThreeOrangesReturnPriceOfOneAppleAndTwoOrange(){
		List<String> basket = new ArrayList<String>(); 
		basket.add("apple");
		basket.add("apple");
		basket.add("orange");
		basket.add("orange");
		basket.add("orange");
		
		assertEquals(1.10, checkout.checkOut(basket), 0.00);
	}
	
	@Test
	public void testThreeOrangesReturnPriceOfTwo(){
		List<String> basket = new ArrayList<String>(); 
		basket.add("orange");
		basket.add("orange");
		basket.add("orange");
		
		assertEquals(0.5, checkout.checkOut(basket), 0.00);
	}
	
	@Test
	public void testFourOrangesReturnPriceOfThree(){
		List<String> basket = new ArrayList<String>(); 
		basket.add("orange");
		basket.add("orange");
		basket.add("orange");
		basket.add("orange");
		
		assertEquals(0.75, checkout.checkOut(basket), 0.00);
	}
	
	@Test
	public void testFiveOrangesReturnPriceOfFour(){
		List<String> basket = new ArrayList<String>(); 
		basket.add("orange");
		basket.add("orange");
		basket.add("orange");
		basket.add("orange");
		basket.add("orange");
		
		assertEquals(1.0, checkout.checkOut(basket), 0.00);
	}
	
	@Test
	public void testSixOrangesReturnPriceOfFour(){
		List<String> basket = new ArrayList<String>(); 
		basket.add("orange");
		basket.add("orange");
		basket.add("orange");
		basket.add("orange");
		basket.add("orange");
		basket.add("orange");
		
		assertEquals(1, checkout.checkOut(basket), 0.00);
	}
	
	@Test
	public void testTwoApplesReturnPriceOfone(){
		List<String> basket = new ArrayList<String>(); 
		basket.add("apple");
		basket.add("apple");
		
		assertEquals(0.6, checkout.checkOut(basket), 0.00);
	}
	
	@Test
	public void testThreeApplessReturnPriceOfTwo(){
		List<String> basket = new ArrayList<String>(); 
		basket.add("apple");
		basket.add("apple");
		basket.add("apple");
		
		assertEquals(1.2, checkout.checkOut(basket), 0.00);
	}
}
