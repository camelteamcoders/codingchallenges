package countandsay;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by diana.pintilii on 18.10.2017.
 */
public class CountAndSayTest {
    CountAndSay sut = new CountAndSay();

    @Test
    public void oneIteration() {
        assertEquals("1", sut.countAndSay(1));
    }

    @Test
    public void two() {
        assertEquals("11", sut.countAndSay(2));
    }

    @Test
    public void three() {
        assertEquals("21", sut.countAndSay(3));
    }

    @Test
    public void four() {
        assertEquals("1211", sut.countAndSay(4));
    }

    @Test
    public void five() {
        assertEquals("111221", sut.countAndSay(5));
    }

    @Test
    public void six() {
        assertEquals("312211", sut.countAndSay(6));
    }

    @Test
    public void negative() {
        assertEquals("", sut.countAndSay(-100));
    }

    @Test
    public void zero() {
        assertEquals("", sut.countAndSay(0));
    }

}
