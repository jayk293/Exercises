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
	public void testThreeApplessReturnPrice(){
		List<String> basket = new ArrayList<String>(); 
		basket.add("apple");
		basket.add("apple");
		basket.add("apple");
		
		assertEquals(1.8, checkout.checkOut(basket), 0.00);
	}
	
	@Test
	public void testThreeOrangesReturnPrice(){
		List<String> basket = new ArrayList<String>(); 
		basket.add("orange");
		basket.add("orange");
		basket.add("orange");
		
		assertEquals(0.75, checkout.checkOut(basket), 0.00);
	}
	
	@Test
	public void testThreeOrangesAndThreeAppleReturnPrice(){
		List<String> basket = new ArrayList<String>(); 
		basket.add("orange");
		basket.add("orange");
		basket.add("orange");
		basket.add("apple");
		basket.add("apple");
		basket.add("apple");
		
		assertEquals(2.55, checkout.checkOut(basket), 0.00);
	}
	
	@Test
	public void testFiveOrangesAndTwoAppleReturnPrice(){
		List<String> basket = new ArrayList<String>(); 
		basket.add("orange");
		basket.add("orange");
		basket.add("orange");
		basket.add("orange");
		basket.add("orange");
		basket.add("apple");
		basket.add("apple");
		
		assertEquals(2.45, checkout.checkOut(basket), 0.00);
	}
}
