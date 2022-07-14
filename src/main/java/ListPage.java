import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class ListPage extends BasePage {
    public ListPage(WebDriver driver) {
        super(driver);
    }

    private final String url = "https://demo.seleniumeasy.com/jquery-dual-list-box-demo.html";
    private final By addAllButton = By.xpath("//*[@id=\"pickList\"]/div/div[2]/button[2]");
    private final By listResult = By.xpath("//*[@class=\"form-control pickListSelect pickListResult\"]/option");
    private final By listLeftBox = By.xpath("//*[@class=\"form-control pickListSelect pickData\"]");
    private final By listLeft = By.xpath("//*[@class=\"form-control pickListSelect pickData\"]/option");
    private final By addButton = By.xpath("//*[@id=\"pickList\"]/div/div[2]/button[1]");

    public void navigate() {
        driver.get(url);
    }
    public void clickAddAll() {
        driver.findElement(addAllButton).click();
    }
    public int getListSize() {
        List<WebElement> list = driver.findElements(listResult);
        return list.size();
    }
    public void selectName(String s) {
        WebElement elem = driver.findElement(listLeftBox);
        Select select = new Select(elem);
        select.selectByVisibleText(s);
    }
    public void clickAdd() {
        driver.findElement(addButton).click();
    }
    public int getLeftListSize() {
        List<WebElement> list = driver.findElements(listLeft);
        return list.size();
    }
    public boolean contains(WebElement s) {
        List<WebElement> list = driver.findElements(listResult);
        return list.contains(s);
    }
}
