package MyProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test1 {

	@Test
	public void m1test()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		System.out.println(driver.getTitle());
	}
}
