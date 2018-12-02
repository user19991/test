package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Sport {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\CR\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://sportsdirect.com/");
		//navigate to homepage
		
		WebDriverWait wait = new WebDriverWait(driver, 600); 
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"advertPopup\"]/div/div/div[1]/button")));
		driver.findElement(By.xpath("//*[@id=\"advertPopup\"]/div/div/div[1]/button")).click();
		//close pop-up

		driver.findElement(By.xpath("//*[@id=\"topMenu\"]/ul/li[1]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"collapse2_dsk\"]/ul/li[10]/a")).click();
		//navigate to shoes
		
		String PriceMin="30";
		WebElement element_enter_min = driver.findElement(By.xpath("//*[@id=\"PriceFilterTextEntryMin\"]"));
		element_enter_min.sendKeys(PriceMin);
		//min price
		
		String PriceMax="60";
		WebElement element_enter_max = driver.findElement(By.xpath("//*[@id=\"PriceFilterTextEntryMax\"]"));
		element_enter_max.sendKeys(PriceMax);
		//max price
		
		driver.findElement(By.xpath("//*[@id=\"PriceFilterTextEntryApply\"]")).click();
		//GO @ min/max Price
		
		driver.findElement(By.xpath("//*[@id=\"dnn_ctr104099728_ViewTemplate_ctl00_ctl08_lstFilters_productFilterList_1\"]/div[2]/a/span/span[1]")).click();
		//click firetrap
		
		driver.findElement(By.xpath("//*[@id=\"dnn_ctr104099728_ViewTemplate_ctl00_ctl08_lstFilters_productFilterList_1\"]/div[11]/a/span/span[1]")).click();
		//click skechers
		
		List <WebElement> elements = driver.findElements(By.className("s-productscontainer2"));
				for (WebElement e: elements)  
				{           
				      System.out.println(e.getAttribute("innerText"));    
				};
		
				
		//get list of all displayed		

	}}