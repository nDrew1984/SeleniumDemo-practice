import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;

public class DownloadPage extends BasePage {
    public DownloadPage(WebDriver driver) {
        super(driver);
    }

    private final String url = "https://demo.seleniumeasy.com/bootstrap-download-progress-demo.html";
    private final By downloadButton = By.id("cricle-btn");
    private final By percent = By.xpath("//*[@class=\"percenttext\"]");

    public void navigate() {
        driver.get(url);
    }
    public void clickDownload(int polling) {
        driver.findElement(downloadButton).click();

        FluentWait wait = new FluentWait(driver);       //Declare and initialise a fluent wait
        wait.withTimeout(Duration.ofSeconds(25));       //Specify the timeout of the wait
        wait.pollingEvery(Duration.ofSeconds(polling)); //Specify polling time
        wait.ignoring(NoSuchElementException.class);    //Specify what exceptions to ignore
        wait.until(ExpectedConditions.textToBePresentInElementLocated(percent, "100%")); //This is how we specify the condition to wait on.
    }
}
