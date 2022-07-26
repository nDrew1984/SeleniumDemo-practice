import org.junit.jupiter.api.Test;

public class TestDragAndDrop extends BaseTest {

    @Test
    public void TestDragDrop() {
        DragAndDropPage dragAndDropPage = new DragAndDropPage(driver);
        dragAndDropPage.navigate();


    }
}
