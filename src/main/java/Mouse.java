import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse
{

	public static void main(String[] args) throws InterruptedException
	{
          WebDriver driver=new ChromeDriver();
          driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

          driver.get("https://demo.automationtesting.in/Register.html");
          driver.manage().window().maximize();
          WebElement element=driver.findElement(By.linkText("SwitchTo"));
          WebElement element1=driver.findElement(By.linkText("Interactions"));
          Actions a=new Actions(driver);
          a.click(element1).build().perform()
;         a.moveToElement(driver.findElement(By.linkText("Drag and Drop"))).click().build().perform();
          a.moveToElement(driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div[2]/ul/li[6]/ul/li[1]/ul/li[1]/a"))).click().build().perform();
          driver.close();


	}

}
