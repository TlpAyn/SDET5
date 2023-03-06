package Gun09;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _AktionDoubleClickTest extends BaseDriver {

    @Test
    public void Test4() {


        driver.get("https://demoqa.com/buttons");

        WebElement element = driver.findElement(By.id("doubleClickBtn"));

        MyFunc.Bekle(2);

        Actions aksiyonlar = new Actions(driver);

        Action aksiyon = aksiyonlar.moveToElement(element).doubleClick().build();
        MyFunc.Bekle(3);
        aksiyon.perform();

//        aksiyonlar.moveToElement(element).doubleClick().build().perform();
//        aksiyonlar.doubleClick(element);

        MyFunc.Bekle(2);
        BekleKapat();

    }
}
