import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class AddTest {
    @Test
    public void test() {
        Add adding = new Add();
        int x = adding.add(1, 2);

        assertEquals(5, x);
    }
}
//RESULT:
//junit.framework.AssertionFailedError:
//        Expected :5
//        Actual   :3