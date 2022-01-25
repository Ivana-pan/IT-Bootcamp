package Pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;
import java.time.Duration;

public class TestCompareDresses {

    public static WebDriver driver;

    @BeforeTest
    public void init() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();

    }

    @Test
    public void compareDressesPage() throws InterruptedException {

        driver.get("http://automationpractice.com/index.php");
        driver.manage().window().maximize();

        CompareDresses poredi = new CompareDresses(driver);
        poredi.putInCompareTwoDress();
        System.out.println("Doslo je do stranice compare to");
        //poredi.checkIfBothDressesAreInCompare();

        Thread.sleep(3000);
        String compareButton = driver.findElement(By.xpath("//div[@class='top-pagination-content clearfix']//span[1]")).getText();
        //System.out.println(compareButton);
        //Assert.assertEquals(compareButton, "Compare (2)");
        Assert.assertTrue(compareButton.contains("2"));

    }

    @AfterTest
    public void closeBrowser() throws IOException, InterruptedException {
        Thread.sleep(2000);
        driver.quit();
        Runtime.getRuntime().exec("taskkill /F /IM chromedriver.exe /T");
    }

}
