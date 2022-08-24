import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyTest {

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }
    @Test
    public void greetingsTest() {
        System.out.println("Testing my hello greeting");
        String actual = new Greetings().greet("Jens");
        String expected = "Hello Jens";
        assertEquals(expected, actual);

    }

    @Test
    public void nullInputTest() {
        System.out.println("Testing my null input test");
        String actual = new Greetings().greet(null);
        String expected = "Du er havnet her somehow";
        assertEquals(expected, actual);
    }

    @Test
    public void shoutingTest(){
        System.out.println("Testing my uppercase");
        String actual = new Greetings().greet("FREDERIK");
        String expected = "HELLO FREDERIK";
        assertEquals(expected, actual);
    }

    @Test
    public void twoNameArrayTest(){
        System.out.println("Testing for 2 names");
        String[] o = new String[2];
        o[0] = "Frederik";
        o[1] = "Denis";
        String actual = new Greetings().greet(o);
        String expected = "Hello Frederik and Denis";
        assertEquals(expected, actual);
    }

    @Test
    public void biggerArrayTest(){
        System.out.println("Testing for several names");
        String[] o = new String[] {"Frederik", "Denis", "Morten", "Casper", "Long"};

        String actual = new Greetings().greet(o);
        String expected = "Hello, Frederik, Denis, Morten, Casper and Long";
        assertEquals(expected, actual);
    }

//    @Test
//    public void seperateTwoGreetings(){
//        System.out.println("Testing seperation of 2 greetings");
//        String[] o = new String[] {"Amy, BRIAN, Charlotte"};
//
//        String actual = new Greetings().greet(o);
//        String expected = "Hello, Amy and Charlotte. AND HELLO BRIAN!";
//    }


}

