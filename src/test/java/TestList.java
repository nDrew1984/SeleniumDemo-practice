import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TestList extends BaseTest {

    @Test
    public void TestNumber() {
        ListPage listPage = new ListPage(driver);

        listPage.navigate();
        listPage.clickAddAll();

        int exp = 15;
        int act = listPage.getListSize();

        Assertions.assertEquals(exp, act);
    }

    @Test
    public void TestNumberAndTrue() {
        ListPage listPage = new ListPage(driver);

        listPage.navigate();

        // test data:
        String name = "Isabella";

        listPage.selectName(name);
        listPage.clickAdd();

        int exp = 14;
        int act = listPage.getLeftListSize();
        Assertions.assertEquals(exp, act);

        WebElement isabella = driver.findElement(By.xpath("//*[text()=\"Isabella\"]"));
        Assertions.assertTrue(listPage.contains(isabella));

    }
}
