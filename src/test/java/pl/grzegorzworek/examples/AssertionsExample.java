package pl.grzegorzworek.examples;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AssertionsExample {
    @Test
    public void assertionsExample() {
        // given
        int a = 2;
        int b = 40;
        // when
        int actual = a + b;
        // then
        assertEquals(42, actual);
    }

    @Test
    public void someMoreAssertions() {
        assertEquals(4, 4);
        assertEquals("str", "str");
        assertEquals(0.3, 0.1 + 0.2, 0.1);
        assertEquals(4, 4, "uneven");
        assertTrue(true);
        assertFalse(false);
        assertNull(null);
        assertNotNull(new Object());
    }
}
