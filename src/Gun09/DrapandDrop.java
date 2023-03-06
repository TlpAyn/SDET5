package Gun09;

import Utlity.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DrapandDrop extends BaseDriver {
    @Test
    public void Tset7 (){

        driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
        Actions aksiyonlar = new Actions(driver);




        WebElement Oslo = driver.findElement(By.id("box1"));
        WebElement Norway = driver.findElement(By.id("box101"));

        //1. yontem
        // aksiyonlar.dragandDrop(oslo, norway). build(). perform();

        //2.Yontem

        aksiyonlar.clickAndHold(Oslo).build().perform(); // osloyu tuklat ve al
        aksiyonlar.moveToElement(Norway).release().build().perform(); // norway in uzerine git ve birak

        BekleKapat();

    }
}
