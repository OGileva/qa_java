import com.example.Feline;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class FelineTest {


    @Test
    public void eatMeatReturnsValidList() throws Exception {
        Feline feline = new Feline();
        List<String> expectedResult = Arrays.asList("Животные", "Птицы", "Рыба");
        List<String> actualResult = feline.eatMeat();
        assertEquals("eatMeat should return valid list of food", expectedResult, actualResult);
    }

    @Test
    public void getFamilyReturnsValidString() {
        Feline feline = new Feline();
        String expectedResult = "Кошачьи";
        String actualResult = feline.getFamily();
        assertEquals("getFamily should return valid String with name of family", expectedResult, actualResult);
    }

    @Test
    public void getKittensWithoutArgumentsReturnsValidCount() {
        Feline feline = new Feline();
        int expectedCount = 1;
        int actualResult = feline.getKittens();
        assertEquals("getKittens should return valid count of kittens", expectedCount, actualResult);
    }
}