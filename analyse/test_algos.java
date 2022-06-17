import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class EraserTest {
    @Test
    public void testSolution() {
        assertEquals("666,thenumberofthebeast", Erase.erase("666 , the number of the beast"));
        assertEquals("06  07651970", Erase.erase("06  07 65 19 70 "));
        assertEquals("OK", Erase.erase("OK"));
        assertEquals("Coucou  JM  B", Erase.erase(" Cou cou  J M  B"));
        assertEquals("", Erase.erase(""));
        assertEquals("", Erase.erase(" "));
        assertEquals("  ", Erase.erase("  "));
        assertEquals("   ", Erase.erase("   "));
        assertEquals("    ", Erase.erase("    "));
        assertEquals("   f", Erase.erase("   f "));
        assertEquals("a", Erase.erase(" a"));
        assertEquals("       ", Erase.erase("       "));
    }
}