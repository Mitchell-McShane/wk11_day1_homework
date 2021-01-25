import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before
    public void before(){
        printer = new Printer(100, 200);
    }

    @Test
    public void hasPages(){
        assertEquals(100, printer.getPages());
    }

    @Test
    public void hasEnoughPages(){
        printer.print(20,100);
        assertEquals(100, printer.getPages());

    }

    @Test
    public void hasToner(){
        assertEquals(200, printer.getToner());
    }
}
