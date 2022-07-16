package Week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		WebElement logout = driver.findElement(By.className("decorativeSubmit"));
		String attribute = logout.getAttribute("value");
		System.out.print(attribute);
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.partialLinkText("Create")).click();		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Wipro");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Surya");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Thambidurai");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("SuryaT");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Automation Testing");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Welcome");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("cutejisha22@gmail.com");		
		WebElement Source = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select select = new Select(Source);
		select.selectByVisibleText("New York");
		driver.findElement(By.name("submitButton")).click();
		System.out.print(driver.getTitle());

	}

}
