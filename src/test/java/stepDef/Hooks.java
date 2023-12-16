package stepDef;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Objects;

public class Hooks {

    public WebDriver driver = new ChromeDriver();


    @Before
    public void BeforeTest(){
        WebDriverManager.chromedriver().setup();
    }

    @After
    public void AfterTest(){
        driver.close();
    }
}
