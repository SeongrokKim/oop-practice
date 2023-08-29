package org.example.passwordValidator;

public class CorrectFixPasswordGenerator implements PasswordGenerator {

    @Override
    public String generatePassword() {
        return "abcedfgh";
    }
}
