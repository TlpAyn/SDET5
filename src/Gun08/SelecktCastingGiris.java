package Gun08;

import Utlity.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SelecktCastingGiris extends BaseDriver {

    @Test

    public void TestDeneme(){

        driver.get("https://www.amazon.com.tr/");

        WebElement webMenu = driver.findElement(By.id("searchDropdownBox"));

        Select ddMenu = new Select(webMenu);

ddMenu.selectByVisibleText("Elektronik");

        System.out.println("ddMenu.getOptions().size() = " + ddMenu.getOptions().size());

        BekleKapat();


    }
}
