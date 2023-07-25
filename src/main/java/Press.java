import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Press 
{

	public static void main(String[] args) throws InterruptedException 
	{
       WebDriver driver=new ChromeDriver();
       driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C550525805016%7Cb%7Cfac%20ebook%7C&placement=&creative=550525805016&keyword=fac%20ebook&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696221112%26matchtype%3Db%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-1255315168%26loc_physical_ms%3D1007740%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=Cj0KCQjw7PCjBhDwARIsANo7CgmDhpwdyKciasm2dGPILmEeJHaOFx9_vktcWjEcHbw9mJaKQEYoXsAaAl9fEALw_wcB");
       driver.manage().window().maximize();
       driver.findElement(By.name("firstname")).sendKeys("kavitha");
       driver.findElement(By.name("lastname")).sendKeys("Amarjintha");
       driver.findElement(By.name("reg_email__")).sendKeys("kavi123@gmail.com");
       driver.findElement(By.name("reg_email_confirmation__")).sendKeys("kavi123@gmail.com");
       driver.findElement(By.xpath("//*[@id=\"password_step_input\"]")).sendKeys("123456");
       WebElement element= driver.findElement(By.xpath("//*[@id=\"day\"]"));
       Select s=new Select(element);
       s.selectByVisibleText("16");
       WebElement  element1= driver.findElement(By.xpath("//*[@id=\"month\"]"));
       Select s1=new Select(element1);
       s1.selectByVisibleText("Jan");
       WebElement element2= driver.findElement(By.xpath("//*[@id=\"year\"]"));
       Select s2=new Select(element2);
       s2.selectByVisibleText("2000");
       WebElement w=driver.findElement(By.name("sex"));
       w.click();
       driver.findElement(By.name("websubmit")).click();
       Thread.sleep(2000);
       driver.findElement(By.xpath("//*[@id=\"reg_form_box\"]/div[12]/a")).click();
       Thread.sleep(2000);
       driver.findElement(By.partialLinkText("Forgotten account?")).click();
       driver.navigate().back();
       Thread.sleep(2000);
       driver.findElement(By.id("email")).sendKeys("kavi123@gmail.com");
       driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("123456");
       driver.findElement(By.id("loginbutton")).click();







       
      

       


      
	}
}
