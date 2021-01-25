import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before
    public void before(){
        printer = new Printer(60, 50);
    }

    @Test
    public void hasPages(){
        assertEquals(60, printer.getPages());
    }

    @Test
    public void hasEnoughPages(){
        printer.print(6,7);
        assertEquals(18, printer.getPages());
    }

    @Test
    public void notEnoughPages(){
        printer.print(15, 10);
        assertEquals(60, printer.getPages());
    }

    @Test
    public void hasToner(){
        assertEquals(50, printer.getToner());
    }

    @Test
    public void canReduceToner(){
        printer.print(10, 8);
        assertEquals(50, printer.getToner());
    }
}
