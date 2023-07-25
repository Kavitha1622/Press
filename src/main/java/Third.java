import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Third 
{

	public static void main(String[] args) throws InterruptedException 
	{
      WebDriver driver=new ChromeDriver();
      driver.manage().window().fullscreen();
      driver.get("https://demo.automationtesting.in/Register.html");
      driver.findElement(By.linkText("SwitchTo")).click();
      driver.findElement(By.linkText("Alerts")).click();
      WebElement element=driver.findElement(By.xpath("//*[@id=\"OKTab\"]/button"));
      element.click();
      Thread.sleep(2000);
      driver.switchTo().alert().accept();
      Thread.sleep(2000);
      driver.findElement(By.linkText("Alert with OK")).click();
      Thread.sleep(2000);
      driver.findElement(By.linkText("Alert with OK & Cancel")).click();
      Thread.sleep(2000);
      driver.findElement(By.xpath("//*[@id=\"CancelTab\"]/button")).click();
      Thread.sleep(2000);
      Alert a=driver.switchTo().alert();
      System.out.println(a.getText());      
      //driver.switchTo().alert().accept();
     // a.dismiss();
      driver.switchTo().alert().accept();
      Thread.sleep(2000);
      driver.findElement(By.linkText("Alert with Textbox")).click();
      Thread.sleep(2000);
      driver.findElement(By.xpath("//*[@id=\"Textbox\"]/button")).click();
      Thread.sleep(2000);
      Alert b=driver.switchTo().alert();
      b.sendKeys("hello");
      b.accept();
      String name=driver.findElement(By.id("demo1")).getText();
      System.out.println(name);
      Thread.sleep(2000);
      driver.close();
      







      
      

	}

}
