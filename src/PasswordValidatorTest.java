import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordValidatorTest {

    @Test
    void isValidPassword() {
        assertTrue(PasswordValidator.isValidPassword("Sec222222222123"));
    }

    @Test
    void lengthIsatLeast8() {
        assertTrue(PasswordValidator.lengthIsAtLeast8("Sellllllllllll3"));
    }

    @Test
    void containsDigits() {
        assertTrue(PasswordValidator.containsDigits("Sellllllllllll5"));
    }

    @Test
    void containsUpperCase() {
        assertTrue(PasswordValidator.containsUpperCase("5555555555Lll"));
    }

    @Test
    void containsLowerCase() {
        assertTrue(PasswordValidator.containsLowerCase("5555555555Lll"));
    }


    @Test
    void containsCommonPasswords() {
        assertTrue(PasswordValidator.containsCommonPasswords("Password"));
    }


}