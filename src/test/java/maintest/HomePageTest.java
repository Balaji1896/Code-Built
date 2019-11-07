package maintest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.testng.Assert;
import org.testng.annotations.Test;
import mainobject.BasePage;
import mainobject.HomePageObjects;

public class HomePageTest {

	HomePageObjects hp;
	
	BasePage bp;
	
	public HomePageTest() {
		hp = new HomePageObjects();
		bp = new BasePage();
	}
	
	@Test
	public void verifyTabNavigation() {
		hp.clickWomen();
		Assert.assertTrue(hp.getTitlte().contains("Women"));
		hp.clickDresses();
		Assert.assertTrue(hp.getTitlte().contains("Dresses"));
		hp.clickTshirts();
		Assert.assertTrue(hp.getTitlte().contains("T-shirts"));
}
	
	@Test
	public void Verifysize() {
		hp.clickDresses();
	Assert.assertTrue(bp.elementFound(hp.smallsize()));
	}
	
	@Test
	public void Verifysize2() {
		hp.clickDresses();
	Assert.assertTrue(bp.elementFound(hp.avgsize()));
	}
		
	@Test
	public void Verifysize3() {
		hp.clickDresses();
	Assert.assertTrue(bp.elementFound(hp.largesize()));
	}
	
}