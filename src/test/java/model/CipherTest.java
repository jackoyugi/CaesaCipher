package model;
import models.Cipher;
import org.junit.Test;
import static org.junit.Assert.*;

public class CipherTest {
    @Test
    public void runCipher_instantiates() {
        Cipher testEncryption = new Cipher("z", 1);
        assertTrue("z", testEncryption instanceof Cipher);
    }
    @Test
    public void runCipher_getmInputString() {
        Cipher testEncryption = new Cipher("z", 1);
        assertEquals("z", testEncryption.getmInputString());
    }
    @Test
    public void runCipher_encrypt() {
        Cipher testEncryption = new Cipher("Hello", 4);
        assertEquals("Lipps", testEncryption.encrypt());
    }
    @Test
    public void runCipher_decrypt() {
        Cipher testEncryption = new Cipher("Lipps", 4);
        assertEquals("Hello", testEncryption.decrypt());
    }

}
