import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class TestCase2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium-WS\\Jars\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://newtours.demoaut.com/");
		WebElement userName = driver.findElement(By.name("userName"));
		userName.clear();
		userName.sendKeys("amitsrivastava");
		
		WebElement pwd = driver.findElement(By.name("password"));
		pwd.clear();
		pwd.sendKeys("amit123456");
		
		WebElement signIn = driver.findElement(By.name("login"));
		signIn.click();
		
		// For Choosing Radio Button
		List<WebElement> radioList =driver.findElements(By.name("tripType"));
		radioList.get(1).click();
		
		WebElement passCount = driver.findElement(By.name("passCount"));
		Select passCountSelect = new Select(passCount);
		passCountSelect.selectByVisibleText("4");
		
		
		WebElement fromPort = driver.findElement(By.name("fromPort"));
		Select fromPortSelect = new Select(fromPort);
		fromPortSelect.selectByVisibleText("New York");
		
		
		WebElement toPort = driver.findElement(By.name("toPort"));
		Select toPortSelect = new Select(toPort);
		toPortSelect.selectByVisibleText("London");
		
		List<WebElement> serviceRadioList = 
				driver.findElements(By.name("servClass"));
		serviceRadioList.get(1).click();
		
		WebElement continueBt = driver.findElement(By.name("findFlights"));
		continueBt.click();
		
		WebElement xpath = driver
				.findElement(By.
						xpath("/html/body/div/table/tbody/tr/td[2]/table/"
								+ "tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/"
								+ "tr[5]/td/form/table[1]/tbody/tr[1]/td/table/"
								+ "tbody/tr[2]/td[1]/b/font"));
		//if(xpath.getText().equalsIgnoreCase("new york to london")){
		//if(xpath.getText().contains("york")){	
		 Pattern pattern=Pattern.compile("^[0-9]+");
		 Matcher m=pattern.matcher(xpath.getText());
		if(m.find()){
		 //if(xpath.getText().endsWith("London")){
		//if(xpath.getText().startsWith("New")){
		System.out.println("Test is Pass");
		}
		else
		{
			System.out.println("Test is Fail");
		}
		
		//driver.close(); // Close the (Current Instance)Browser
		driver.quit(); // Close all the Instances
		
	}

}
