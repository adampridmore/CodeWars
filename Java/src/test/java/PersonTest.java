import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.junit.runners.JUnit4;

public class PersonTest {
    @Test
    public void testGreet() {
        Person shoki = new Person("Nadal");
        assertEquals("Konbanwa! My name is Nadal. It is nice to meet you, Federer!", shoki.greet("Federer"));
    }
}