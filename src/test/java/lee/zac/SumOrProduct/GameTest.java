package lee.zac.SumOrProduct;

import static org.junit.Assert.*;
import org.junit.Test;

public class GameTest {

    @Test
    public void productTest() {
        Game game1 = new Game();
        int expected = 120;
        int actual = game1.product(5);
        assertEquals(expected, actual);
    }

    @Test
    public void sumTest() {
        Game game1 = new Game();
        int expected = 15;
        int actual = game1.sum(5);
        assertEquals(expected, actual);
    }


}
