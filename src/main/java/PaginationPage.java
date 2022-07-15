import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class PaginationPage extends BasePage {
    public PaginationPage(WebDriver driver) {
        super(driver);
    }

    private final String url = "https://demo.seleniumeasy.com/table-pagination-demo.html";
    private final By tableRowsVisible = By.xpath("//*[@style=\"display: table-row;\"]");
    private final By nextButton = By.xpath("//*[@class=\"next_link\"]");

    public void navigate() {
        driver.get(url);
    }
    public int numberOfRows() {
        List<WebElement> rows = driver.findElements(tableRowsVisible);
        return rows.size();
    }
    public boolean isLastPage() {
        String attribute = driver.findElement(nextButton).getAttribute("style");
        return attribute.equals("display: none;");
    }
    public void clickNextButton() {
        if (!isLastPage()) {
            driver.findElement(nextButton).click();
        }
    }
}
