package org.example.passwordValidator;

public class WrongFixPasswordGenerator implements PasswordGenerator {

    @Override
    public String generatePassword() {
        return "ab";
    }
}
