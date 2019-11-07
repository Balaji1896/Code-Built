
package mainobject;

		import java.util.ArrayList;
		import java.util.List;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.support.FindBy;
		import org.openqa.selenium.support.FindBys;
		import org.openqa.selenium.support.PageFactory;

		public class dresssizeobject extends BasePage {
			
			@FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[2]/a")
			private WebElement tabDresses;
			
			public dresssizeobject() {
				PageFactory.initElements(driver, this);
			}
			
			public void clickDresses() {
			tabDresses.click();
			}
			
			@FindBy(xpath = ".//*[@id=\"ul_layered_id_attribute_group_1\"]/li[1]/label/a") 
			private WebElement minsize;
			
			public WebElement smallsize() {
			return minsize;
			}
			
			@FindBy(xpath = "//*[@id=\"ul_layered_id_attribute_group_1\"]/li[2]/label/a")
			private WebElement midsize;
				
			public WebElement avgsize() {
			return midsize;
			}
			
			@FindBy(xpath = "//*[@id=\"ul_layered_id_attribute_group_1\"]/li[3]/label/a")
			private WebElement bigsize;
				
			public WebElement largesize() {
			return bigsize;
		}
		}
		