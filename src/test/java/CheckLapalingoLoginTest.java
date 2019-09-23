import com.company.Assert;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class CheckLapalingoLoginTest {
    public static class Main {

        public static void main(String[] args) throws InterruptedException {
            System.setProperty("webdriver.chrome.driver","C:\\selenium-java-3.141.59\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get("https://www.lapalingo.com/en");
            driver.manage().window().maximize();
            driver.findElement(By.name("lionline_user_login[_username]"));
            WebElement mail = driver.findElement(By.name("lionline_user_login[_username]"));
            mail.sendKeys("vladtestauto@gmail.com");
            driver.findElement(By.name("lionline_user_login[_password]"));
            WebElement password = driver.findElement(By.name("lionline_user_login[_password]"));
            password.sendKeys("Tester123");
            driver.findElement(By.xpath("/html/body/div[2]/div[9]/div[2]/div[1]/div[1]/form/div[3]/button"));
            WebElement login = driver.findElement(By.xpath("/html/body/div[2]/div[9]/div[2]/div[1]/div[1]/form/div[3]/button"));
            login.click();
            String actualUrl;
            actualUrl = "https://www.lapalingo.com/en";
            String expectedUrl = driver.getCurrentUrl();
            if(actualUrl.equalsIgnoreCase(expectedUrl)) { System.out.println("Test passed"); } else { System.out.println("Test failed");}
            Thread.sleep(10000);
            driver.close();


        }
    }
}