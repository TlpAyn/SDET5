package Gun05;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _02_Navigating extends BaseDriver {

    public static void main(String[] args) {

                driver.get("https://testpages.herokuapp.com/styled/index.html");
                MyFunc.Bekle(3);

                WebElement element = driver.findElement(By.id("alerttest"));

                element.click(); // yeni sayfaya gittik

                MyFunc.Bekle(3);

                System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());

                driver.navigate().back();

                MyFunc.Bekle(3);

                driver.navigate().forward();
                MyFunc.Bekle(3);







                BekleKapat();
    }
}
