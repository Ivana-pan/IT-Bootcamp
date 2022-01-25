import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Properties;

public class ProbaSelenium {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Desktop\\QA\\chromedriver_win32\\chromedriver.exe");
        Properties properties = System.getProperties();
        properties.list(System.out);
        WebDriver wd = new ChromeDriver();

        wd.get("http://automationpractice.com/index.php");

        WebElement logo = wd.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/header[1]/div[3]/div[1]/div[1]/div[1]/a[1]/img[1]"));
        logo.click();
        wd.close();
    }
}
