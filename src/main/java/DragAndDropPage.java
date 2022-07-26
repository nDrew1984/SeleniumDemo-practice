import org.openqa.selenium.WebDriver;

public class DragAndDropPage extends BasePage {
    public DragAndDropPage(WebDriver driver) {
        super(driver);
    }

    private final String url = "https://demo.seleniumeasy.com/drag-and-drop-demo.html";

    public void navigate() {
        driver.get(url);
    }
    // help: https://biercoff.com/moving-slider-and-dragging-elements-with-webdriver/
}
