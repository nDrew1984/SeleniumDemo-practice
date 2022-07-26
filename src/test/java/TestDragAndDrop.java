import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class TestDragAndDrop extends BaseTest {

    @Test
    public void TestDragDrop() {
        DragAndDropPage dragAndDropPage = new DragAndDropPage(driver);
        dragAndDropPage.navigate();

        dragAndDropPage.dragFirstElem();
        dragAndDropPage.dragFirstElem();
        dragAndDropPage.dragFirstElem();
        dragAndDropPage.dragFirstElem();

        List<String> exp = new ArrayList<>();
        exp.add("Draggable 1");
        exp.add("Draggable 2");
        exp.add("Draggable 3");
        exp.add("Draggable 4");

        List<String> act = dragAndDropPage.getList();
        Assertions.assertArrayEquals(exp.toArray(), act.toArray());
    }
}
