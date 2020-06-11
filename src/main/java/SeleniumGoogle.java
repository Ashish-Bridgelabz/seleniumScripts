import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumGoogle {
    public static void main(String[] args) {
        System.out.println("HELLO");

        //setup the chromedriver using WebDriverManager
        WebDriverManager.chromedriver().setup();
        //Create driver object for Chrome
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");
    }
}

