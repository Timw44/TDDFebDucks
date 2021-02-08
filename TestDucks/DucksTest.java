import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DucksTest
{
    @Test
    public void initialToString()
    {
        Ducks duck1 = new Ducks("white", 5);
        String expected = "Ducks{Color: white, Age: 5}";
        assertEquals(expected, duck1.toString());
    }

    @Test
    public void defaultConstructor()
    {
        Ducks defaultDuck = new Ducks("", 0);
        String expected = "Ducks{Color: , Age: 0}";
        assertEquals(expected, defaultDuck.toString());
    }

    @Test
    public void colorGetNSet()
    {
        Ducks blankDuck = new Ducks();
        String expected = "yellow";
        blankDuck.setColor("yellow");
        assertEquals(expected, blankDuck.getColor());
    }

    @Test
    public void ageGetNSet()
    {
        Ducks blankDuck = new Ducks();
        int expected = 5;
        blankDuck.setAge(5);
        assertEquals(expected, blankDuck.getAge());
    }

    @Test
    public void babySaysPeep()
    {
        Ducks babyDuck = new Ducks("yellow", 1);
        String expected = "Peep";
        assertEquals(expected, babyDuck.duckSays());
    }

    @Test
    public void adultSaysQuack()
    {
        Ducks adultDuck = new Ducks("white", 5);
        String expected = "Quack";
        assertEquals(expected, adultDuck.duckSays());
    }
}