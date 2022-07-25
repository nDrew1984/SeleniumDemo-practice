import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DownloadFilePage extends BasePage {
    public DownloadFilePage(WebDriver driver) {
        super(driver);
    }

    private final String url = "https://demo.seleniumeasy.com/generate-file-to-download-demo.html";
    private final By textbox = By.id("textbox");
    private final By generateFileButton = By.id("create");
    private final By link = By.id("link-to-download");

    public void navigate() {
        driver.get(url);
    }
    public void enterText(String text) {
        driver.findElement(textbox).sendKeys(text);
    }
    public void clickGenerateFile() {
        driver.findElement(generateFileButton).click();
    }
    public void clickLinkToDownload() throws InterruptedException {
        driver.findElement(link).click();
        Thread.sleep(3000);
    }

}
