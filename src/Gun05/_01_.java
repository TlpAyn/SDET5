package Gun05;

import Utlity.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class _01_ extends BaseDriver {
    public static void main(String[] args) {


        driver.get("https://www.hepsiburada.com/");
        
        List<WebElement> linkler = driver.findElements(By.tagName("a"));
        //verilen tag lerdeki tum elemanlari aldik 

        Bekle3();

        for ( WebElement e : linkler)
        {


            if(e.getText().isEmpty()){

            System.out.println("e.getAttribute((\"href\")) = " + e.getAttribute(("href")));
            System.out.println("e.getAttribute(\"title\") = " + e.getAttribute("title"));
            System.out.println("e.getAttribute(\"rel\") = " + e.getAttribute("rel"));


        }
        }


        BekleKapat();
    }

}
