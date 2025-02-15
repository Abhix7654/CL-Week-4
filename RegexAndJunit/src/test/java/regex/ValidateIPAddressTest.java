package regex;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ValidateIPAddressTest {

    @Test
    public void testValidIPs() {
        assertTrue(ValidateIPAddress.isValidIPAddress("192.168.1.1"));
        assertTrue(ValidateIPAddress.isValidIPAddress("255.255.255.255"));
        assertTrue(ValidateIPAddress.isValidIPAddress("0.0.0.0"));
        assertTrue(ValidateIPAddress.isValidIPAddress("127.0.0.1"));
    }

    @Test
    public void testInvalidIPs() {
        assertFalse(ValidateIPAddress.isValidIPAddress("256.100.50.25"));
        assertFalse(ValidateIPAddress.isValidIPAddress("192.168.1"));
        assertFalse(ValidateIPAddress.isValidIPAddress("192.168.1.300"));
        assertFalse(ValidateIPAddress.isValidIPAddress("192.168.1.-1"));
        assertFalse(ValidateIPAddress.isValidIPAddress("192.168..1.1"));
        assertFalse(ValidateIPAddress.isValidIPAddress("abc.def.gha.bcd"));
    }

}
