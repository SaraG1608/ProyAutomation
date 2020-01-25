package proyEbay;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class EbayTest {
	
	private WebDriver driver;
	EbayPage  testEbay;

	@Before
	public void setUp() throws Exception {
		
		testEbay = new EbayPage(driver);
		testEbay.ChromeDriverConnection();
		testEbay.visit("https://www.ebay.com/");
		
	}
	
	

	@After
	public void tearDown() throws Exception {
	
	}

	@Test
	public void test() throws InterruptedException {
		testEbay.searchEbay("shoes");
		testEbay.filterEbay();
	}
	
	

}
