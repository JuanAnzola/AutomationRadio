package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;

public class Hooks {
    private static ChromeDriver driver;

    @Before
    public void initBrowser() {
        try {
            System.setProperty("webdriver.chrome.driver", "C:\\Driver Chrome/chromedriver.exe");
            ChromeDriver driver = new ChromeDriver();
            driver.get();
            driver.manage().window().maximize();
        }catch (Exception e){
            System.out.println("Error:"+e.getMessage());
        }
    }


    @After
    public void closeBrowser (){
        try {
            driver.close();
        }catch (Exception e){
            System.out.println("Error:"+e.getMessage());
        }
    }

    public static ChromeDriver getDriver(){
        return driver;
    }
}
