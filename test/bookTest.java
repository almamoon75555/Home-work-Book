import org.junit.jupiter.api.Test;

import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.*;

class bookTest {


    @Test
    public void ninehalfbefore() {
        var b = new book();
        LocalTime t1 = LocalTime.of(8, 05, 00);
        assertEquals("3000", b.threeortwothousand(t1));
    }

    @Test
    public void betweenfoursevenhalf() {
        var b = new book();
        LocalTime t2 = LocalTime.of(16, 45, 00);
        assertEquals("3000", b.threeortwothousand(t2));
    }

    @Test
    public void betweenninehalffour() {
        var b = new book();
        LocalTime t3 = LocalTime.of(13, 00, 00);
        assertEquals("2000", b.threeortwothousand(t3));
    }

    @Test
    public void aftersevenhalf() {
        var b = new book();
        LocalTime t4 = LocalTime.of(22, 45, 00);
        assertEquals("2000", b.threeortwothousand(t4));
    }

}