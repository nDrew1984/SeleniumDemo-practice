import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class SelectPage extends BasePage {
    public SelectPage(WebDriver driver) {
        super(driver);
    }

    private final String url = "https://demo.seleniumeasy.com/basic-select-dropdown-demo.html";
    private final By selectDay = By.id("select-demo");
    private final By resultDay = By.xpath("//*[@class=\"selected-value\"]");
    private final By cities = By.xpath("//*[@id=\"multi-select\"]/option");
    private final By getAllSelected = By.id("printAll");
    private final By resultCity = By.xpath("//*[@class=\"getall-selected\"]");

    public void navigate() {
        driver.get(url);
    }
    public void selectDay(String s) {
        Select select = new Select(driver.findElement(selectDay));
        select.selectByVisibleText(s);
    }
    public String getDayResult() {
        return driver.findElement(resultDay).getText();
    }
    public void scrollDown() {
        JavascriptExecutor scroll = (JavascriptExecutor) driver;
        scroll.executeScript("window.scrollBy(0, 300)", "");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
    public void selectMore(int n) {
        List<WebElement> list = driver.findElements(cities);
        Actions actions = new Actions(driver);
        actions.keyDown(Keys.CONTROL);
        for (int i = 0; i < n; i++) {
            actions.click(list.get(i));
        }
        actions.keyUp(Keys.CONTROL).build().perform();
    }
    public void clickGetAllSelected() {
        driver.findElement(getAllSelected).click();
    }
    public String getCityResult() {
        return driver.findElement(resultCity).getText();
    }
}
