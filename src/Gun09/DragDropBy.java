package Gun09;

import Utlity.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DragDropBy extends BaseDriver {
    @Test
    public void Test1() {


        driver.get("http://talkerscode.com/webtricks/demo/demo_price-range-slider-using-jquery-css-and-php.php");
       Actions aksiyonlar = new Actions(driver);


      WebElement solSurgu = driver.findElement(By.xpath(""));




}
}