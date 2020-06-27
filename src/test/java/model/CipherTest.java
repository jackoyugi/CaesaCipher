package model;
import models.Cipher;
import org.junit.Test;
import static org.junit.Assert.*;

public class CipherTest {
    @Test
    public void runCipher_instantiatesCorrectly() {
        Cipher testEncryption = new Cipher("z", 1);
        assertEquals("true", testEncryption instanceof Cipher);
    }
    @Test
    public void runCipher_getmInputString() {
        Cipher testEncryption = new Cipher("z", 1);
        assertEquals("z", testEncryption.getmInputString());
    }
    @Test
    public void runCipher_getmShift() {
        Cipher testEncryption = new Cipher("z", 1);
        assertEquals("1", testEncryption.getmShift());
    }
    @Test
    public void runCipher_encrypt() {
        Cipher testEncryption = new Cipher("z", 1);
        assertEquals("y", testEncryption.encrypt());
    }
    @Test
    public void runCipher_decrypt() {
        Cipher testEncryption = new Cipher("y", 1);
        assertEquals("z", testEncryption.decrypt());
    }

}
