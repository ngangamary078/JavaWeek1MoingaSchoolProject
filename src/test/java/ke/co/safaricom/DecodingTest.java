package ke.co.safaricom;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DecodingTest {

    @Test
    @DisplayName("Testing Decoding Program")
    void decode() {
        assertEquals("THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG", Decoding.decode("QEB NRFZH YOLTK CLU GRJMP LSBO QEB IXWV ALD", 3));
        assertEquals("Y@#", Decoding.decode("X@#", 1));
    }
}