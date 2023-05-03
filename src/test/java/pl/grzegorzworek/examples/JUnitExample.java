package pl.grzegorzworek.examples;

import org.junit.jupiter.api.*;

public class JUnitExample {

    @Test
    public void firstTest() {
        System.out.println("execute firstTest");
    }

    @Test
    public void secondTest() {
        System.out.println("execute secondTest");
    }

    @Disabled
    @Test
    public void thirdTest() {
        System.out.println("execute thirdTest");
    }

    @BeforeEach
    public void beforeEach() {
        System.out.println("run beforeEach");
    }

    @AfterEach
    public void afterEach() {
        System.out.println("run afterEach");
    }

    @BeforeAll
    public static void beforeAll() {
        System.out.println("run beforeAll");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("run afterAll");
    }
}
