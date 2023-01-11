package org.example;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        System.out.println("\n---------------------------\nExample 1\n---------------------------");
        //Open browser to needed page
        driver.navigate().to("http://www.google.com/");
        driver.manage().window().maximize();
        //Cookies prompt handling
        driver.findElement(By.id("W0wltc")).click();
        //Element for search field "<input class="gLFyf" jsaction="paste:puy29d;" maxlength="2048" name="q" type="text" aria-autocomplete="both" aria-haspopup="false" autocapitalize="off" autocomplete="off" autocorrect="off" autofocus="" role="combobox" spellcheck="false" title="Search" value="" aria-label="Search" data-ved="0ahUKEwjxpMC7w7_8AhXi-yoKHVzUBwoQ39UDCAQ">"
        //Xpath for search field "/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input"
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).sendKeys("TSET company");
        //Element for Google Searh button "<input class="gNO89b" value="Google Search" aria-label="Google Search" name="btnK" role="button" tabindex="0" type="submit" data-ved="0ahUKEwjxpMC7w7_8AhXi-yoKHVzUBwoQ4dUDCBA">"
        //Xpath for Google Search button "/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[1]"
        ///html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[1]
        //Xpath after google suggestions are included "/html/body/div[1]/div[3]/form/div[1]/div[1]/div[2]/div[2]/div[5]/center/input[1]""
        //Xpath after google suggestions are included "/html/body/div[1]/div[3]/form/div[1]/div[1]/div[2]/div[2]/div[5]/center/input[1]"
        //Couldn't use By.name because the element is duplicate.
//        driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[2]/div[2]/div[5]/center/input[1]")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[1]")).click();
        //Close browser and driver
        String text = driver.getTitle();
        assertEquals("TSET company - Google Search",text);
        driver.quit();
    }
}