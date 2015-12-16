import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class TestCase1 {
	
	//WebDriver driver ;  //Instance Variable
	
	@BeforeClass
	public void postClassLoad(){
		System.out.println("This Will Call Only Once When Class is Loaded..");
	}
	
	@AfterClass
	public void preClassUnLoad(){
		System.out.println("This Will Calll when Class is Going to UnLoad...");
	}
	/*
	@BeforeTest
	@BeforeMethod  // Will Call Before Each TestCase (@Test) Method
	public void start(){
		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium-WS\\Jars\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	@AfterMethod
	public void stop(){
		driver.close();
	}*/
	
	/*//@Test(timeOut=4000,priority=2)
	@Test(enabled=false)
	//@Test(priority=2) // Will Call After Each TestCase Method   
	// This will consider as a Test Case
	public void testFB(){
		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium-WS\\Jars\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.get("http://www.facebook.com");
		WebElement emailTxtBox = driver.findElement(By.id("email"));
		emailTxtBox.clear();
		emailTxtBox.sendKeys("mike@gmail.com");
		
		WebElement pwdTxtBox = driver.findElement(By.id("pass"));
		pwdTxtBox.clear();
		pwdTxtBox.sendKeys("mike1324343545");
		
		WebElement loginBt = driver.findElement(By.id("u_0_v"));
		loginBt.click();
		
		//Assert.assertTrue(driver.
			//	getTitle().equals("Log in to Facebook | Facebook"));
		
		Assert.assertEquals(driver.getTitle(), "Log in to Gmail | Facebook");
		
		if(driver.getTitle().equals("Log in to Facebook | Facebook")){
			System.out.println("Test Pass");
		}
		else
		{
			System.out.println("Test Fail");
		}
		
		//driver.close();
		
	}*/
	
	@Test(threadPoolSize=2,invocationCount=4,timeOut=1000)
	//@Test(priority=1)
	public void testMercuryTours(){
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
		
		WebElement msg = driver.findElement(By.xpath("//tr[3]/td/font"));
		Assert.assertTrue(msg.getText().contains("Use our Flight Finder"));
		
		
		
		driver.close();
	}

}
