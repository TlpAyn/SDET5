package Gun12;

import Utlity.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _01_Iframe_Girisi extends BaseDriver {

    @Test
    public void Test1() {

        driver.get("https://chercher.tech/practice/frames");

        driver.switchTo().frame(0);

        WebElement input = driver.findElement(By.cssSelector("b[id='topic']+input"));//b[@id='topic']//following::input
        input.sendKeys("Turkiye");



    }

}
