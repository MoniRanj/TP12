package Pack1;

import java.time.Duration;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class getdata {

	@Test
	public void ninza() throws InterruptedException
	{
		Random r=new Random();
		int rnum=r.nextInt();
		String mgrname="Jonny Hopps";
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		d.get("http://49.249.28.218:8091/");
		d.findElement(By.id("username")).sendKeys("rmgyantra");
		d.findElement(By.id("inputPassword")).sendKeys("rmgy@9999");
		d.findElement(By.xpath("//button[.='Sign in']")).click();
		d.findElement(By.xpath("//a[.='Projects']")).click();
		d.findElement(By.xpath("//span[.='Create Project']")).click();
		d.findElement(By.name("projectName")).sendKeys("Digital"+rnum);
		d.findElement(By.name("createdBy")).sendKeys(mgrname);
		
		WebElement we=d.findElement(By.xpath("(//select[@name='status'])[2]"));
		Select sel=new Select(we);
		Thread.sleep(1000);
		sel.selectByValue("Created");
		d.findElement(By.xpath("//input[@value='Add Project']")).click();
		
		WebElement we1=d.findElement(By.xpath("(//select[@class='form-control'])[1]"));
		Select sel1=new Select(we1);
		
		sel1.selectByValue("projectName");
		d.findElement(By.xpath("//input[@placeholder='Search by Project Name']")).sendKeys(mgrname);
		
		
	}
}
