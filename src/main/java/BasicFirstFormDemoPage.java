import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.nio.charset.StandardCharsets;
import java.util.Random;

public class BasicFirstFormDemoPage extends BasePage{
    public BasicFirstFormDemoPage(WebDriver driver) {
        super(driver);
    }

    private final String url = "https://demo.seleniumeasy.com/basic-first-form-demo.html";
    private final By valueFieldA = By.id("sum1");
    private final By valueFieldB = By.id("sum2");
    private final By getTotalButton = By.xpath("//*[@id=\"gettotal\"]/button");
    private final By total = By.id("displayvalue");
    private final By inputTextField = By.xpath("(//*[@class=\"form-control\"])[1]");
    private final By showMessageButton = By.xpath("//*[@id=\"get-input\"]/button");
    private final By textResult = By.id("display");

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
    public String totalNumber() {
        return driver.findElement(total).getText();

    }
    public String totalString() {
        return driver.findElement(total).getText();
    }
    public String getRandomString(int n) {
        String characters =
                "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                        + "0123456789"
                        + "abcdefghijklmnopqrstuvxyz"
                        + ">#&@{}?:;-_$ß€[]äđ+!=";

        StringBuilder sb = new StringBuilder(n);
        for (int i = 0; i < n; i++) {
            int index = (int) (characters.length() * Math.random());
            sb.append(characters.charAt(index));
        }
        return sb.toString();
    }
    public void enterText(String s) {
        driver.findElement(inputTextField).sendKeys(s);
    }
    public void clickShowMessageButton() {
        driver.findElement(showMessageButton).click();
    }
    public String getTextResult() {
        return driver.findElement(textResult).getText();
    }
    public int getRandomNumber(int min, int max) {
        return (int) Math.floor(Math.random()*(max-min+1)+min);
    }
    public void clear() {
        driver.findElement(valueFieldA).clear();
        driver.findElement(valueFieldB).clear();
    }
    public void clearText() {
        driver.findElement(inputTextField).clear();
    }
    public void scrollDown() {
        JavascriptExecutor scroll = (JavascriptExecutor) driver;
        scroll.executeScript("window.scrollBy(0,300)", "");
    }





}
