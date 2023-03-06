package Gun09;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _AktionsClickTest extends BaseDriver {
    @Test
    public void Test3(){

        driver.get("https://demoqa.com/buttons");
      WebElement element = driver.findElement (By.xpath("//button[text()='Click Me']"));
        //element.click();

        Actions aksiyonlar = new Actions(driver);

        Action aksiyon  = aksiyonlar.moveToElement(element).click().build();
        // elemanin uzerine klick icin git ve orada bekle.
        System.out.println("Aksyiyon Hazirlandi");

        MyFunc.Bekle(4);

        aksiyon.perform();

        System.out.println("aksiyon gerceklesti");

        BekleKapat();



    }
}
