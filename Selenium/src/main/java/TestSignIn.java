import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.util.Properties;

public class TestSignIn {
    public static void main(String[] args) throws IOException, InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Desktop\\QA\\chromedriver_win32\\chromedriver.exe");
        //Properties properties = System.getProperties();
        //properties.list(System.out);
        WebDriver wd = new ChromeDriver();

        wd.get("http://automationpractice.com/index.php");
        wd.manage().window().maximize();

        if (wd.getCurrentUrl().equals("http://automationpractice.com/index.php")){
            System.out.println("Getting homepage successful");
        }else{
            System.out.println("The actual URL should be equal to http://automationpractice.com/index.php");
        }

        WebElement signInButton = wd.findElement(By.xpath("//a[contains(text(),'Sign in')]"));
        //WebElement signInButton =
        signInButton.click();
        Thread.sleep(1000);

        WebElement emailAddress = wd.findElement(By.xpath("//input[@id='email']"));
        WebElement password = wd.findElement(By.xpath("//input[@id='passwd']"));


        emailAddress.sendKeys("proba@gmail.com");
        Thread.sleep(1000);
        password.sendKeys("Probica1");
        Thread.sleep(1000);

        WebElement buttonSignIn = wd.findElement(By.xpath("//button[@id='SubmitLogin']"));
        buttonSignIn.click();
        Thread.sleep(1000);

        WebElement authErrorMessage = wd.findElement(By.xpath("//p[contains(text(),'There is 1 error')]"));
        if(!authErrorMessage.getText().equals("There is 2 error")){
            System.out.println("The error message should be present");
        }

        wd.close();
    }
}
