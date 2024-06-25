package pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {
    public static String hamburger_menu_xpath = "//*[@id=\"menuToggle\"]/input";
    public static String signIn_link_LinkText = "Sign In Portal";
    public static String onlineProductsPage_link_LinkText = "Online Products";
    public static WebDriver driver;

    public static void click_hamburger_menu() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://anupdamoda.github.io/AceOnlineShoePortal/index.html#");
        driver.findElement(By.xpath(hamburger_menu_xpath)).click();
    }

    public static void click_signIn_link()  {
        Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(d-> driver.findElement(By.linkText(signIn_link_LinkText)).isDisplayed());
        driver.findElement(By.linkText(signIn_link_LinkText)).click();
    }
    public static void click_OnlineProducts_link() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.linkText(onlineProductsPage_link_LinkText)).click();
    }

}
