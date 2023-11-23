import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;


    public class CreditCardTest {

        @Test
        public void testParseCreditCardNumber() {
            String cc = parseCreditCardNumber("ABC4444333322221111");
            assertEquals("4444 3333 2222 1111", cc);
        }

        @Test
        public void testValidateCreditCardNumber() {
            boolean isValid = validateCreditCardNumber("4444 3333 2222 1111");
            assertTrue(isValid);
        }

        @Test
        public void testValidateCreditCardNumber2() {
            boolean isValid = validateCreditCardNumber("4444 3333 2222 1112");
            assertFalse(isValid);
        }
    }

