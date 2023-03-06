package Gun05;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _03_GetCssValue extends BaseDriver {
    public static void main(String[] args) {

        driver.get("https://www.snapdeal.com/");
        MyFunc.Bekle(3);

        WebElement inputValueEnter = driver.findElement(By.id("inputValEnter"));

        // <input autocomplete="off" name="keyword" type="text" class="col-xs-20
        // searchformInput keyword" id="inputValEnter" onkeypress="clickGo(event, this)"
        // placeholder="Search products &amp; brands" value="" spellcheck="false" data-ms-editor="true">

        System.out.println("inputValueEnter.getCssValue(color) = " + inputValueEnter.getCssValue("color"));
        System.out.println("inputValueEnter.getCssValue(fontSize) = " + inputValueEnter.getCssValue("font-size"));
        System.out.println("inputValueEnter.getCssValue(fontSize) = " + inputValueEnter.getCssValue("background"));
    }
}
