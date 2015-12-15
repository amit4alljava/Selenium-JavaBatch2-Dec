import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class TestCase1 {

	public static void main(String[] args) {
		// Step - 1 Connect to the Driver (FirefoxDriver)
		
		//Step -1 Connect to Chrome
		// a) Specify the Location of a Chrome Driver
		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium-WS\\Jars\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		// b) Connect to the Chrome
		WebDriver driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
		// Maximize the Browser
		driver.manage().window().maximize();
		// Step -2 Open the URL
		
		driver.get("http://www.facebook.com");
		WebElement emailTxtBox = driver.findElement(By.id("email"));
		emailTxtBox.clear();
		emailTxtBox.sendKeys("mike@gmail.com");
		
		WebElement pwdTxtBox = driver.findElement(By.id("pass"));
		pwdTxtBox.clear();
		pwdTxtBox.sendKeys("mike1324343545");
		
		WebElement loginBt = driver.findElement(By.id("u_0_v"));
		loginBt.click();
		//By.className(className)
		
		/*WebElement msg = driver.findElement(By.cssSelector("uiHeaderTitle"));
		if(msg.getText().equals("Facebook Login")){
			System.out.println("Test Pass");
		}
		else
		{
			System.out.println("Test Fail");
		}*/
		if(driver.getTitle().equals("Log in to Facebook | Facebook")){
			System.out.println("Test Pass");
		}
		else
		{
			System.out.println("Test Fail");
		}
		
		driver.close();
		
		

	}

}
