package  com.app.tests;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public abstract class InterviewPrep{

    WebDriver driver;
    @Test
    public void test(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
    }
   
}