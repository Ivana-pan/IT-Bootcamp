import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Properties;

public class TestLogin {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Desktop\\QA\\chromedriver_win32\\chromedriver.exe");
        Properties properties = System.getProperties();
        properties.list(System.out);
        WebDriver wd = new ChromeDriver();
        wd.get("http://automationpractice.com/index.php");
        wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        wd.manage().window().maximize();

        WebElement signInButton = wd.findElement(By.xpath("//a[contains(text(),'Sign in')]"));
        signInButton.click();


        WebElement newemail = wd.findElement(By.xpath("//input[@id='email_create']"));
        newemail.sendKeys("gicerax963@upsdom.com");
        WebElement newSignInButton = wd.findElement(By.xpath("//button[@id='SubmitCreate']"));
        newSignInButton.click();

        WebElement gender = wd.findElement(By.id("uniform-id_gender2"));
        gender.click();

        WebElement firstName = wd.findElement(By.id("customer_firstname"));
        firstName.sendKeys("Alesia");

        WebElement lastName = wd.findElement(By.id("customer_lastname"));
        lastName.sendKeys("Bruce");

        if (!wd.findElement(By.xpath("//input[@id='email']")).equals(newemail)){
            System.out.println("Email address does not match the entered email address.");
        }

        WebElement password = wd.findElement(By.xpath("//input[@id='passwd']"));
        password.sendKeys("ugachakaugauga");

        WebElement dayOfBirth = wd.findElement(By.name("days"));
        dayOfBirth.sendKeys("8");
        WebElement monthOfbirth = wd.findElement(By.name("months"));
        monthOfbirth.sendKeys("April");
        WebElement yearOfBirth = wd.findElement(By.name("years"));
        yearOfBirth.sendKeys("1983");

        wd.findElement(By.xpath("//input[@id='address1']")).sendKeys("Melvin");

        wd.findElement(By.xpath("//input[@id='company']")).sendKeys("2750 Pheasant Ridge Road");
        wd.findElement(By.xpath("//input[@id='city']")).sendKeys("Philadelphia");
        wd.findElement(By.xpath("//select[@id='id_state']")).sendKeys("Pennsylvania");
        wd.findElement(By.xpath("//input[@id='postcode']")).sendKeys("19103");
        wd.findElement(By.xpath("//select[@id='id_country']")).sendKeys("United States");
        wd.findElement(By.xpath("//input[@id='phone_mobile']")).sendKeys("215-478-0500");

        wd.findElement(By.xpath("//button[@id='submitAccount']")).click();
        //wd.close();

    }
}
