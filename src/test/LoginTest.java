package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginTest {

    @Test
    public void signin()
    {
        //open a webpage
        System.setProperty("webdriver.chrome.driver","C:\\Users\\PREMANAND RAJA\\Desktop\\Selenium notes\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.spicejet.com/");
        driver.manage().window().maximize();
        String Title= driver.getTitle();
        System.out.println(Title);
    }

}
