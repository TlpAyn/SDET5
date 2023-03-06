package Gun04TekrarEv;

import Utlity.MyFunc;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _01_OpeningWebSite {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://huertgenwald-hilft.de");





        MyFunc.Bekle(2);

        driver.quit();
    }
}
