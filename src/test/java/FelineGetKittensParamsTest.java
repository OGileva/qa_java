
import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class FelineGetKittensParamsTest {

    @Parameterized.Parameter()
    public int kittensCount;
    @Parameterized.Parameter(1)
    public int expectedCount;

    @Parameterized.Parameters(name = "Count of kittens: {0}, expected count: {1}")
    public static Object[][] params() {
        return new Object[][]{
                {0, 0},
                {1, 1},
                {2, 2}
        };
    }

    @Test
    public void getKittensWithArgumentsReturnsValidCount() {
        Feline feline = new Feline();
        int actualResult = feline.getKittens(kittensCount);
        assertEquals("getKitten should return valid count of kittens", expectedCount, actualResult);
    }
}