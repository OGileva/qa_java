import com.example.Animal;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class AnimalTest {

    @Test
    public void getFamilyReturnsValidString() {
        Animal animal = new Animal();
        String expectedResult = "Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи";
        String actualResult = animal.getFamily();
        assertEquals("getFamily should return valid String", expectedResult, actualResult);
    }

    @Test
    public void constructorThrowsExceptionOnUnsupportedAnimalKind() {
        Exception exception = Assert.assertThrows(Exception.class, () -> {
            Animal animal = new Animal();
            animal.getFood("Unsupported");
        });
        assertEquals("Неизвестный вид животного, используйте значение Травоядное или Хищник", exception.getMessage());
    }
}