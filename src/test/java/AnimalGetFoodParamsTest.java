import com.example.Animal;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class AnimalGetFoodParamsTest {

    @Parameterized.Parameter()
    public String animalKind;
    @Parameterized.Parameter(1)
    public List<String> expectedResult;

    @Parameterized.Parameters(name = "Animal kind: {0}; Expected food: {1}")
    public static Object[][] params() {
        return new Object[][]{
                {"Травоядное", Arrays.asList("Трава", "Различные растения")},
                {"Хищник", Arrays.asList("Животные", "Птицы", "Рыба")},
        };
    }

    @Test
    public void getFoodReturnsValidList() throws Exception {
        Animal animal = new Animal();
        List<String> actualResult = animal.getFood(animalKind);
        assertEquals("getFood should return valid list of food", expectedResult, actualResult);
    }

}