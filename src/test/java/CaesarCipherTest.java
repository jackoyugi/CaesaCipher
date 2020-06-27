import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CaesarCipherTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void runCaesarCipher_instantiates() {
        CaesarCipher thisCaesarCipher = new CaesarCipher("oyug", 2);
        assertEquals(true, thisCaesarCipher instanceof CaesarCipher);

    }
    @Test
    public void runCaesarCipher_ifInputIsString() {
        CaesarCipher thisCaesarCipher = new CaesarCipher("oyug", 2);
        assertEquals("oyug", thisCaesarCipher.getmInputString());
    }
    @Test
    public void runCaesarCipher_ifKeyIsInt() {
        CaesarCipher thisCaesarCipher = new CaesarCipher("oyug", 2);
        assertEquals(2, thisCaesarCipher.getmShift());
    }
    @Test
    public void runCaesarCipher_ifDecryptsVariousInputs() {
        CaesarCipher  thisCaesarCipher  = new CaesarCipher("!ODCB EURZQ IRA MXPSV RYHU D ODCB GRJ2", 3);
        // does not decrypt integers and other characters but returns them as is
        assertEquals("!LAZY BROWN FOX JUMPS OVER A LAZY DOG2", CaesarCipher.decrypt(thisCaesarCipher));
    }
}
