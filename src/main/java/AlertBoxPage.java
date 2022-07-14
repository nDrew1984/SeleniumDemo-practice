import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertBoxPage extends BasePage {
    public AlertBoxPage(WebDriver driver) {
        super(driver);
    }

    private final String url = "https://demo.seleniumeasy.com/javascript-alert-box-demo.html";
    private final By promptBoxButton = By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[3]/div[2]/button");

    public void navigate() {
        driver.get(url);
    }
    public void clickPromptBox() {
        driver.findElement(promptBoxButton).click();
    }
    public void enterText(String s) {
        driver.switchTo().alert().sendKeys(s);
    }
    public void clickAlertOK() {
        driver.switchTo().alert().accept();
    }
    public void clickAlertCANCEL() {
        driver.switchTo().alert().dismiss();
    }
}
