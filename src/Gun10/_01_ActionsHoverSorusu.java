package Gun10;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class _01_ActionsHoverSorusu extends BaseDriver {

    @Test
    public void Test1() {

        driver.get("https://www.etsy.com/");
        Actions aksiyonlar = new Actions(driver);


        List<WebElement> datenSchutz = driver.findElements(By.xpath("//button[@class='wt-btn wt-btn--filled wt-mb-xs-0']"));

        if (datenSchutz.size() > 0)
            datenSchutz.get(0).click();


        WebElement schmuck = driver.findElement(By.xpath("//span[@id='catnav-primary-link-10855']"));
        WebElement ketten = driver.findElement(By.xpath("//span[@id='side-nav-category-link-10873']"));
        WebElement bigketten = driver.findElement(By.xpath("//a[@id='catnav-l3-10881']"));


        aksiyonlar.moveToElement(schmuck).build().perform();
        MyFunc.Bekle(2); // gozukene kadar bekle
        aksiyonlar.moveToElement(ketten).build().perform();
        MyFunc.Bekle(2);
        aksiyonlar.moveToElement(bigketten).build().perform();
        MyFunc.Bekle(2);

        bigketten.click();


        System.out.println(driver.getCurrentUrl());
        Assert.assertTrue(driver.getCurrentUrl().contains("necklaces"));
BekleKapat();

    }
}
