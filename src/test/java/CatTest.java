import com.example.Cat;
import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {

    @Mock
    private Feline feline;

    private final List<String> expectedFoodList = Arrays.asList("Животные", "Птицы", "Рыбы");

    @Test
    public void getSoundReturnsValidString() {
        Cat cat = new Cat(feline);
        String expectedResult = "Мяу";
        String actualResult = cat.getSound();
        assertEquals("getSound should return valid String", expectedResult, actualResult);
    }

    @Test
    public void getFood() throws Exception {
        Mockito.when(feline.eatMeat()).thenReturn(expectedFoodList);
        Cat cat = new Cat(feline);
        List<String> actualResult = cat.getFood();
        assertEquals("getFood should return valid list", expectedFoodList, actualResult);
    }
}