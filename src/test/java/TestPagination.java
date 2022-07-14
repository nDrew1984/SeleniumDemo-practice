import org.junit.jupiter.api.Test;

public class TestPagination extends BaseTest {

    @Test
    public void TestPaging() {
        PaginationPage paginationPage = new PaginationPage(driver);

        paginationPage.navigate();

        
    }
}
