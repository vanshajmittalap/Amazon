package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AmazonLaunch {
    @Test
    public void openbrowser(){
        System.setProperty("webdriver.chrome.driver","src/test/java/dependencies/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.in/");
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iPhone");
        driver.findElement(By.id("nav-search-submit-button")).submit();
    }
}
