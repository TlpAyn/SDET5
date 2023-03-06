package Gun11;

import Utlity.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class WaitsGiris extends BaseDriver {

    @Test
    public void Wait1(){
        driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");

        WebElement btn =driver.findElement(By.xpath("//button[text()='Click me to start timer']"));
        btn.click();

        Duration muhlet = Duration.ofSeconds(120);
        driver.manage().timeouts().implicitlyWait(muhlet);

        WebElement mesaj = driver.findElement(By.xpath("//p[text()='WebDriver']"));

        BekleKapat();


    }
}
