package Gun12;

import Utlity.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class _02_FramlerGecis extends BaseDriver {

    @Test
    public void Test3(){


        driver.get("https://chercher.tech/practice/frames");

        driver.switchTo().frame(0);

        WebElement input = driver.findElement(By.cssSelector("b[id='topic']+input"));

        //b[@id='topic']//following::input

        input.sendKeys("Turkiye");

        driver.switchTo().parentFrame();

        driver.switchTo().frame(1);


        WebElement animal = driver.findElement(By.xpath("//select[@id='animals']"));

        Select seleckt = new Select(animal);

        seleckt.selectByVisibleText("Avatar");









    }
}
