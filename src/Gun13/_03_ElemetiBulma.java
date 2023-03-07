package Gun13;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class _03_ElemetiBulma extends BaseDriver {

    @Test
    public void  Test3(){
        driver.manage().deleteAllCookies();

        driver.get("https://www.copado.com/robotic-testing");
        MyFunc.Bekle(2);
        JavascriptExecutor js = (JavascriptExecutor) driver;

        //a[target='_blank']
        //a[text()='Read story']

        WebElement adamResmi = driver.findElement(By.xpath("//a[text()='Read story']"));

        js.executeScript("arguments[0].scrollIntroView(true);", adamResmi); //elemente kadar kaydir.

        js.executeScript("arguments[0].clik();" , adamResmi);
        MyFunc.Bekle(5);


    }
}
