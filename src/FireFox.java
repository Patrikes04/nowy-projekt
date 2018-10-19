import org.apache.http.util.Asserts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FireFox {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\ptruszkowski\\IdeaProjects\\FireFox\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        driver.get("https://ibssodev2.bsbox.pl/#/login?appId=EBANKING");
        driver.findElement(By.id("login")).sendKeys("97424461");
        driver.findElement(By.className("btn--yellow")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.id("password")));
        driver.findElement(By.id("password")).sendKeys("123456Qq");
        driver.findElement(By.className("btn--yellow")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[3]/div[1]/section/div/aside[1]/div/navigation/div/div/nav/ul/li[2]/a")));
        driver.findElement(By.linkText("Pulpit")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[3]/div[1]/section/div/aside[1]/div/navigation/div/div/nav/ul/li[2]/a")));
        driver.findElement(By.linkText("Konta")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.className("slider-left-part")));
        driver.findElement(By.className("slider-left-part")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[2]/div[3]/div[1]/section/div/section/div[2]/div/div/div/div[2]/div/div[2]/div/div[2]")));
        String number=driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[1]/section/div/section/div[2]/div/div/div/div[2]/div/div[2]/div/div[2]")).getText();
        if(number.equals("52 1950 0001 2006 0042 7952 0002")){
            System.out.println("number bankowy się zgadza");
        }
        driver.close();
//*[@id="account-details-list"]/div/div[2]/div/div[2]

    }
}
