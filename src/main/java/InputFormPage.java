import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class InputFormPage extends BasePage {
    public InputFormPage(WebDriver driver) {
        super(driver);
    }

    private final String url = "https://demo.seleniumeasy.com/input-form-demo.html";
    private final By firstName = By.xpath("//*[@name=\"first_name\"]");
    private final By lastName = By.xpath("//*[@name=\"last_name\"]");
    private final By email = By.xpath("//*[@name=\"email\"]");
    private final By phone = By.xpath("//*[@name=\"phone\"]");
    private final By address = By.xpath("//*[@name=\"address\"]");
    private final By city = By.xpath("//*[@name=\"city\"]");
    private final By state = By.xpath("//*[@name=\"state\"]");
    private final By zip = By.xpath("//*[@name=\"zip\"]");
    private final By webSite = By.xpath("//*[@name=\"website\"]");
    private final By hostingYes = By.xpath("//*[@id=\"contact_form\"]/fieldset/div[10]/div/div[1]/label/input");
    private final By hostingNo = By.xpath("//*[@id=\"contact_form\"]/fieldset/div[10]/div/div[2]/label/input");
    private final By comment = By.xpath("//*[@name=\"comment\"]");
    private final By send = By.xpath("(//*[@type=\"submit\"])[2]");

    public void navigate() {
        driver.get(url);
    }
    public void inputFirstName(String s) {
        driver.findElement(firstName).sendKeys(s);
    }
    public void inputLastName(String s) {
        driver.findElement(lastName).sendKeys(s);
    }
    public void inputEmail(String s) {
        driver.findElement(email).sendKeys(s);
    }
    public void inputPhone(String s) {
        driver.findElement(phone).sendKeys(s);
    }
    public void inputAddress(String s) {
        driver.findElement(address).sendKeys(s);
    }
    public void inputCity(String s) {
        driver.findElement(city).sendKeys(s);
    }
    public void selectState(String s) {
        Select select = new Select(driver.findElement(state));
        select.selectByVisibleText(s);
    }
    public void inputZip(String s) {
        driver.findElement(zip).sendKeys(s);
    }
    public void inputWebSite(String s) {
        driver.findElement(webSite).sendKeys(s);
    }
    public void clickHostingYes() {
        driver.findElement(hostingYes).click();
    }
    public void clickHostingNo() {
        driver.findElement(hostingNo).click();
    }
    public void inputComment(String s) {
        driver.findElement(comment).sendKeys(s);
    }
    public void clickSend() {
        driver.findElement(send).click();
    }
}
