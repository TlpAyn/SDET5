package Gun08;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ElemaninStatüsü  extends BaseDriver {

    @Test

    public void Test1(){

        driver.get("https://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwCheckBox");

        MyFunc.Bekle(2);

      WebElement Thursday =  driver.findElement(By.xpath("//input[@id='gwt-debug-cwCheckBox-Tuesday-input']"));
      Thursday.click();



        System.out.println("Thursday.isDisplayed() = " + Thursday.isDisplayed());
        System.out.println("Thursday.isEnabled() = " + Thursday.isEnabled());
        System.out.println("Thursday.isSelected() = " + Thursday.isSelected());

        MyFunc.Bekle(2);

        WebElement Sunday =  driver.findElement(By.xpath("//input[@id='gwt-debug-cwCheckBox-Sunday-input']"));
        Sunday.click();



        System.out.println("Sunday.isDisplayed() = " + Sunday.isDisplayed());
        System.out.println("Sunday.isEnabled() = " + Sunday.isEnabled());
        System.out.println("Sunday.isSelected() = " + Sunday.isSelected());



    }
}
