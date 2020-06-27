package model;

import models.Encrypt;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EncryptTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void runEncrypt_instantiates(){
        Encrypt testEncrypt = new Encrypt( "abc", 2);
        assertEquals("abc", testEncrypt instanceof Encrypt);
    }
    @Test
    public void runEncrypt_ifInputIsString() {
        Encrypt testEncrypt = new Encrypt("abc", 3);
        assertEquals("abc", testEncrypt.getmInputString());

    }
    @Test
    public void runEncrypt_ifKeyIsInteger() {
        Encrypt testEncrypt = new Encrypt("abc", 2);
        assertEquals(2, testEncrypt.getmShift());

    }
    @Test
    public void runEncrypt_ifEncryptVariousInputs(){
        Encrypt testEncrypt = new Encrypt("!LAZY BROWN FOX JUMPS OVER A LAZY DOG2", 3);
        // does not decrypt integers and other characters but returns them as is
        assertEquals("!ODCB EURZQ IRA MXPSV RYHU D ODCB GRJ2", Encrypt.encrypt(testEncrypt));
    }
}
