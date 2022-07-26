import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class SliderPage extends BasePage {
    public SliderPage(WebDriver driver) {
        super(driver);
    }

    private final String url = "https://demo.seleniumeasy.com/drag-drop-range-sliders-demo.html";
    private final By sliders = By.xpath("//*[@name=\"range\"]");
    private final By slider1Value = By.id("range");
    private final By slider2Value = By.id("rangePrimary");
    private final By slider3Value = By.id("rangeSuccess");
    private final By slider4Value = By.id("rangeInfo");
    private final By slider5Value = By.id("rangeWarning");
    private final By slider6Value = By.id("rangeDanger");

    public void navigate() {
        driver.get(url);
    }
    public void dragSliders(int xOffset, int yOffset) throws Exception {
        List<WebElement> sliderList = driver.findElements(sliders);
        for (int i = 0; i < sliderList.size(); i++) {
            Actions moveSliders = new Actions(driver);
            Action action = moveSliders.clickAndHold(sliderList.get(i))
                    .moveByOffset(xOffset, yOffset)
                    .release()
                    .build();
            action.perform();
            Thread.sleep(250);
        }
    }
    public int slider1Value() {
        return Integer.parseInt(driver.findElement(slider1Value).getText());
    }
    public int slider2Value() {
        return Integer.parseInt(driver.findElement(slider2Value).getText());
    }
    public int slider3Value() {
        return Integer.parseInt(driver.findElement(slider3Value).getText());
    }
    public int slider4Value() {
        return Integer.parseInt(driver.findElement(slider4Value).getText());
    }
    public int slider5Value() {
        return Integer.parseInt(driver.findElement(slider5Value).getText());
    }
    public int slider6Value() {
        return Integer.parseInt(driver.findElement(slider6Value).getText());
    }
}
