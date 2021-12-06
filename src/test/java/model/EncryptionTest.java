package model;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EncryptionTest {
    @Test
    public void encryption_allUpperCase_String() {
        Encryption newEncryption = new Encryption();
        String oMessage = "CEASAR CIPHER";
        assertEquals(oMessage, Encryption.encryption("ceasar cipher", 1));


    }
}