import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CaffeineBuzzTest {
    @Test
    public void Tests1() throws Exception {
        assertEquals("mocha", "mocha_missing!", CaffeineBuzz.caffeineBuzz(1));
        assertEquals("java", "Java", CaffeineBuzz.caffeineBuzz(3));
        assertEquals("JavaScript", "JavaScript", CaffeineBuzz.caffeineBuzz(6));
        assertEquals("CoffeeScript", "CoffeeScript", CaffeineBuzz.caffeineBuzz(12));
    }
}