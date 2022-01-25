import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
import java.util.Properties;

public class ProbaLoginNaProbu {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Desktop\\QA\\chromedriver_win32\\chromedriver.exe");
        Properties properties = System.getProperties();
        properties.list(System.out);
        WebDriver wd = new ChromeDriver();
        wd.get("http://automationpractice.com/index.php");
        wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        wd.manage().window().maximize();

        WebElement signInButton = wd.findElement(By.xpath("//a[contains(text(),'Sign in')]"));
        signInButton.click();

        wd.findElement(By.xpath("//input[@id='email']")).sendKeys("gicerax963@upsdom.com");
        wd.findElement(By.xpath("//input[@id='passwd']")).sendKeys("ugachakaugauga");
        wd.findElement(By.xpath("//button[@id='SubmitLogin']")).click();
        wd.findElement(By.xpath("//header/div[3]/div[1]/div[1]/div[6]/ul[1]/li[3]/a[1]")).click();
        WebElement majica = wd.findElement(By.xpath("//body/div[@id='page']/div[2]/div[1]/div[3]/div[2]/ul[1]/li[1]/div[1]/div[1]/div[1]/a[1]/img[1]"));
        majica.click();
        wd.findElement(By.xpath("//span[contains(text(),'Add to cart')]")).click();
        wd.findElement(By.xpath("//body[1]/div[1]/div[1]/header[1]/div[3]/div[1]/div[1]/div[4]/div[1]/div[2]/div[4]/a[1]/span[1]")).click();
        wd.findElement(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/p[2]/a[1]/span[1]")).click();
        wd.findElement(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/form[1]/p[1]/button[1]/span[1]")).click();
        WebElement termsOfAgreement = wd.findElement(By.xpath("//input[@id='cgv']"));
        termsOfAgreement.click();
        wd.findElement(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/form[1]/p[1]/button[1]/span[1]")).click();
        wd.findElement(By.xpath("//body/div[@id='page']/div[2]/div[1]/div[3]/div[1]/div[1]/div[3]/div[2]/div[1]/p[1]/a[1]")).click();
        wd.findElement(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/form[1]/p[1]/button[1]/span[1]")).click();
        WebElement orderConfirmation = wd.findElement(By.xpath("//p[contains(text(),'Your order on My Store is complete.')]"));
        if (orderConfirmation.getText().equals("Your order on My Store is complete.")){
            System.out.println("Your order was successful.");
        }else {
            System.out.println("There is a misteake. ");
        }

        wd.close();





    }
}
