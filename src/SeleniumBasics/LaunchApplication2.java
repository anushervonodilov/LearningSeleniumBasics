package SeleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchApplication2 {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
//        driver.get("https://www.google.com/");

        driver.navigate().to("https://www.facebook.com/");


    }
}
