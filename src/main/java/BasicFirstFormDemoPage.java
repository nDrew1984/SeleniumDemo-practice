import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasicFirstFormDemoPage extends BasePage{
    public BasicFirstFormDemoPage(WebDriver driver) {
        super(driver);
    }

    private final String url = "https://demo.seleniumeasy.com/basic-first-form-demo.html";
    private final By valueFieldA = By.id("sum1");
    private final By valueFieldB = By.id("sum2");
    private final By getTotalButton = By.xpath("//*[@id=\"gettotal\"]/button");
    private final By total = By.id("displayvalue");

    public void navigate() {
        driver.get(url);
    }
    public void inputA(String x) {
        driver.findElement(valueFieldA).sendKeys(x);
    }
    public void inputB(String y) {
        driver.findElement(valueFieldB).sendKeys(y);
    }
    public void clickGetTotal() {
        driver.findElement(getTotalButton).click();
    }
    public int totalNumber() {
        String s = driver.findElement(total).getText();
        return Integer.parseInt(s);
    }
    public String totalString() {
        return driver.findElement(total).getText();
    }

}
