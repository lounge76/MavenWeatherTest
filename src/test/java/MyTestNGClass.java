import io.github.bonigarcia.wdm.DriverManagerType;
import io.github.bonigarcia.wdm.FirefoxDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class MyTestNGClass {

    @Test
    public void setup1(){
        /* saves us from system set property gecko..... */
        FirefoxDriverManager.getInstance(DriverManagerType.FIREFOX).setup();
        WebDriver x = new FirefoxDriver();

        x.get("https://lounge76-weather-app.glitch.me/");

        //assertEquals method Parameters: Expected Value, Actual Value, Assertion Message
        assertEquals("Weather App123", x.getTitle(), "Title check failed!");


        /*
        quit driver instance
        x.close();
        x.quit();
        */
    }
    @Test
    public void setup2(){
        System.out.println("Welcome to maven TestNG Project2");

    }
    @Test
    public void setup3(){
        System.out.println("Welcome to maven TestNG Project3");

    }
    @Test
    public void setup4(){
        System.out.println("Welcome to maven TestNG Project4");

    }
}
