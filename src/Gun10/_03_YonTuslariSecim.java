package Gun10;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;



public class _03_YonTuslariSecim extends BaseDriver {

    @Test
            public void Test3(){


        driver.get("https://demoqa.com/auto-complete");
        Actions aksiyonlar = new Actions(driver);

        WebElement element = driver.findElement(By.xpath("//div[@class='auto-complete__value-container css-1hwfws3']"));

        aksiyonlar.moveToElement(element).click().sendKeys("b").build().perform();

        MyFunc.Bekle(2);

        aksiyonlar.moveToElement(element).sendKeys(Keys.DOWN).sendKeys(Keys.ENTER).build().perform();



        BekleKapat();


    }

}
