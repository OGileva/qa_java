import com.example.Feline;
import com.example.Lion;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class LionDoesHaveManeParamsTest {

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.openMocks(this);
    }

    @Mock
    Feline feline;

    @Parameterized.Parameter
    public String sex;
    @Parameterized.Parameter(1)
    public boolean expectedHasMane;

    @Parameterized.Parameters(name = "Sex: {0}, expected presence of a mane:")
    public static Object[][] params() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false}
        };
    }

    @Test
    public void doesHaveMane() throws Exception {
        Lion lion = new Lion(sex, feline);
        boolean actualResult = lion.doesHaveMane();
        assertEquals("doesHaveMane should return valid boolean", expectedHasMane, actualResult);
    }

}