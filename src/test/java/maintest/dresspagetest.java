package maintest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.testng.Assert;
import org.testng.annotations.Test;
import mainobject.BasePage;
import mainobject.HomePageObjects;
import mainobject.dresssizeobject;

public class dresspagetest {
	
	dresssizeobject dp;	
	public dresspagetest () {
		dp = new dresssizeobject ();
	
	}
		@Test
		public void Verifysize() {
			dp.clickDresses();
		Assert.assertTrue(dp.elementFound(dp.smallsize()));
		Assert.assertTrue(dp.elementFound(dp.avgsize()));
		Assert.assertTrue(dp.elementFound(dp.largesize()));
		}
	}
