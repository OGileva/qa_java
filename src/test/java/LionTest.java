import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    @Mock
    private Feline feline;

    private final List<String> expectedFoodList = Arrays.asList("Животные", "Птицы", "Рыба");

    @Test
    public void getKittensReturnsValidCount() throws Exception {
        Lion lion = new Lion("Самец", feline);
        Mockito.when(feline.getKittens()).thenReturn(1);
        int expectedResult = 1;
        int actualResult = lion.getKittens();
        assertEquals("getKittens should return valid count", expectedResult, actualResult);
    }

    @Test
    public void getFoodReturnsValidList() throws Exception {
        Lion lion = new Lion("Самец", feline);
        Mockito.when(feline.getFood("Хищник")).thenReturn(expectedFoodList);
        List<String> actualResult = lion.getFood();
        assertEquals("getFood should return valid list of food", expectedFoodList, actualResult);
    }

    @Test
    public void constructorThrowsExceptionOnUnsupportedSex() {
        Exception exception = Assert.assertThrows(Exception.class, () -> {
            Lion lion = new Lion("Unsupported", feline);
        });
        assertEquals("Используйте допустимые значения пола животного - самец или самка", exception.getMessage());
    }
}