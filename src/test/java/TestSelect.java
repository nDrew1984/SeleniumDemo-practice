import io.qameta.allure.Description;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestSelect extends BaseTest {

    @Test
    @DisplayName("Test Select Day")
    @Description("Testing the \"select dropdown list\" function")
    public void TestSelectDay() {
        SelectPage selectPage = new SelectPage(driver);
        selectPage.navigate();

        // test data: any weekday
        String day = "Friday";

        selectPage.selectDay(day);

        String exp = "Day selected :- " + day;
        String act = selectPage.getDayResult();
        Assertions.assertEquals(exp, act);
    }

    @Test
    @DisplayName("Test Select City")
    @Description("Testing select more options with Ctrl key")
    public void TestSelectMore() {
        SelectPage selectPage = new SelectPage(driver);
        selectPage.navigate();
        selectPage.scrollDown();

        // test data: select first 4 cities:
        selectPage.selectMore(4);
        selectPage.clickGetAllSelected();

        String exp = "Options selected are : California,Florida,New Jersey,New York";
        String act = selectPage.getCityResult();
        Assertions.assertEquals(exp, act);
    }

}
