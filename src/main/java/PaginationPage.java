import org.openqa.selenium.WebDriver;

public class PaginationPage extends BasePage {
    public PaginationPage(WebDriver driver) {
        super(driver);
    }

    private final String url = "https://demo.seleniumeasy.com/table-pagination-demo.html";

    public void navigate() {
        driver.get(url);
    }
}
