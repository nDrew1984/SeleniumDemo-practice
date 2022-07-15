import jdk.jfr.Description;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestPagination extends BaseTest {

    @Test
    @Description("Paging through a list and counting the number of rows")
    public void TestPaging() {
        PaginationPage paginationPage = new PaginationPage(driver);

        paginationPage.navigate();

        int act = 0;
        while (true) {
            act += paginationPage.numberOfRows();
            if (paginationPage.isLastPage()) {
                break;
            }
            paginationPage.clickNextButton();
        }

        int exp = 13;
        Assertions.assertEquals(exp, act);

        
    }
}
