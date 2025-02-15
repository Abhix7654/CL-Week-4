package regex;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CreditCardValidatorTest {

    @Test
    public void testValidVisaCards() {
        assertEquals("Valid Visa Card", CreditCardValidator.validateCreditCard("4111111111111111"));
        assertEquals("Valid Visa Card", CreditCardValidator.validateCreditCard("4000123412341234"));
    }

    @Test
    public void testValidMasterCards() {
        assertEquals("Valid MasterCard", CreditCardValidator.validateCreditCard("5105105105105100"));
        assertEquals("Valid MasterCard", CreditCardValidator.validateCreditCard("5555555555554444"));
    }

    @Test
    public void testInvalidCards() {
        assertEquals("Invalid Card Number", CreditCardValidator.validateCreditCard("6011000990139424"));
        assertEquals("Invalid Card Number", CreditCardValidator.validateCreditCard("4222222222222"));
        assertEquals("Invalid Card Number", CreditCardValidator.validateCreditCard("500000000000000"));
        assertEquals("Invalid Card Number", CreditCardValidator.validateCreditCard("abcd567890123456"));
    }

}
