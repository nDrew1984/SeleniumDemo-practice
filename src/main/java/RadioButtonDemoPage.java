import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RadioButtonDemoPage extends BasePage {
    public RadioButtonDemoPage(WebDriver driver) {
        super(driver);
    }

    private final String url = "https://demo.seleniumeasy.com/basic-radiobutton-demo.html";
    private final By female1Button = By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[1]/div[2]/label[2]/input");
    private final By getCheckedValue = By.id("buttoncheck");

    private final By female2Button = By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/div[1]/label[2]/input");
    private final By age1550 = By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/div[2]/label[3]/input");
    private final By getValues = By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/button");

    public void navigate() {
        driver.get(url);
    }
    public void clickFemale1() {
        driver.findElement(female1Button).click();
    }
    public void clickGetCheckedValue() {
        driver.findElement(getCheckedValue).click();
    }

    public void clickFemale2() {
        driver.findElement(female2Button).click();
    }
    public void clickAge1550() {
        driver.findElement(age1550).click();
    }
    public void clickGetValues() {
        driver.findElement(getValues).click();
    }
}
