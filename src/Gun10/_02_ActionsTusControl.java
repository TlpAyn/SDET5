package Gun10;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _02_ActionsTusControl extends BaseDriver {
    @Test
    public void Test4 (){



        driver.get("https://demoqa.com/auto-complete");
        Actions aksiyonlar = new Actions(driver);

        WebElement element = driver.findElement(By.id("autoCompleteSingleInput"));

         Action aksiyon = aksiyonlar.
                 moveToElement(element)
                 .click()
                 .keyDown(Keys.SHIFT)
                 .sendKeys("a")
                 .keyUp(Keys.SHIFT)
                 .sendKeys("hmet")
                 .build(); //aksiyona hazirla

         //aksiyon hazirlandi

        MyFunc.Bekle(2);

        aksiyon.perform(); // gerceklestir

        BekleKapat();


    }
}
