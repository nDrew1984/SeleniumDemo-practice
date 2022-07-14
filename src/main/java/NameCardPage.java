import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class NameCardPage extends BasePage {
    public NameCardPage(WebDriver driver) {
        super(driver);
    }

    private final String url = "https://demo.seleniumeasy.com/data-list-filter-demo.html";
    private final By nameCards = By.xpath("//*[@class=\"searchable-container\"]/div/div");
    private final By names = By.xpath("./h4");
    private final By titles = By.xpath("./p");

    public void navigate() {
        driver.get(url);
    }
    public void createFile(String filename) throws IOException {
        File file = new File(filename);
        file.createNewFile();
    }
    public void saveData(String filename) throws IOException {
        List<WebElement> nameCardsList = driver.findElements(nameCards);
        FileWriter writer = new FileWriter(filename);
        writer.write("Serial" + "\t" + "Name" + "\t" + "Title" + "\r\n");

        for (int i = 0; i < nameCardsList.size(); i++) {
            String name = nameCardsList.get(i).findElement(names).getText();
            name = name.replace("Name: ", "");
            String title = nameCardsList.get(i).findElement(titles).getText();
            title = title.replace("Title: ", "");
            String serial = String.valueOf(i+1);

            writer.write(serial + "\t" + name + "\t" + title + "\r\n");
        }
        writer.close();
    }
    public long getSize() {
        List<WebElement> nameCardsList = driver.findElements(nameCards);
        return nameCardsList.size();
    }


}
