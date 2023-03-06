package Gun12;

import Utlity.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import javax.xml.ws.WebEndpoint;
import java.util.List;
import java.util.Set;

public class _04_WindowsGiris extends BaseDriver {

    @Test
    public void Test1(){

        driver.get("https://www.selenium.dev/");

        String anasayfaWindoID = driver.getWindowHandle();
        System.out.println("anasayfaWindowID = "+ anasayfaWindoID);

        List<WebElement> linkler = driver.findElements(By.cssSelector("a[target='_blank']"));

        for (WebElement link:linkler) {

            if (!link.getAttribute("href").contains("mail"))

            link.click();

        }
        //su anda tum sayfalar acildi

        Set<String > windowsIdler = driver.getWindowHandles();
        for (String id:windowsIdler) {
            System.out.println();

        }




    }
}
