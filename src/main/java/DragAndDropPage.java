import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.List;


public class DragAndDropPage extends BasePage {
    public DragAndDropPage(WebDriver driver) {
        super(driver);
    }

    private final String url = "https://demo.seleniumeasy.com/drag-and-drop-demo.html";
    private final By firstElem = By.xpath("//*[@id=\"todrag\"]/span[1]");
    private final By secondElem = By.xpath("//*[@id=\"todrag\"]/span[2]");
    private final By thirdElem = By.xpath("//*[@id=\"todrag\"]/span[3]");
    private final By fourthElem = By.xpath("//*[@id=\"todrag\"]/span[4]");
    private final By dropZone = By.id("mydropzone");
    private final By droppedList = By.xpath("//*[@id=\"droppedlist\"]/span");

    public void navigate() {
        driver.get(url);
    }
    public void dragFirstElem() {
        Actions actions = new Actions(driver);
        actions.dragAndDrop(driver.findElement(firstElem), driver.findElement(dropZone)).build().perform();
    }
    public List<String> getList() {
        List<String> result = new ArrayList<>();
        List<WebElement> list = driver.findElements(droppedList);
        for (int i = 0; i < list.size(); i++) {
            result.add(list.get(i).getText());
        }
        return result;
    }
}
