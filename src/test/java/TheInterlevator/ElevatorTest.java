package TheInterlevator;

import TheInterlevator.Elevator;
import org.junit.Test;
import static org.junit.Assert.*;

public class ElevatorTest {
    Elevator intelevator = new Elevator(120, 2);
    Person p1 = new Person(60, "Its no room!");
    Person p2 = new Person(80, "Stop it!!");

    @Test
    public void exampleTests() {
        assertEquals("Welcome to the intelevator", intelevator.enter(p1));
        assertEquals("Its no room!", intelevator.enter(p2));
        assertEquals(1, intelevator.liftees);
        assertEquals(60, intelevator.kiloGram);
        assertEquals("Hope you had a nice trip with the intelevator", intelevator.empty());
        assertEquals("I am allready empty", intelevator.empty());
    }
}