package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginTest {

   @Test
    public void signin()
   {
       System.setProperty("Webdriver.chrome.driver","C:\\Users\\PREMANAND RAJA\\Desktop\\Selenium notes\\Project1\\Driver\\chromedriver.exe");
       WebDriver driver = new ChromeDriver();
       driver.get("https://www.spicejet.com/");
       String Title= driver.getTitle();
       System.out.println(Title);
       driver.close();
   }

}
