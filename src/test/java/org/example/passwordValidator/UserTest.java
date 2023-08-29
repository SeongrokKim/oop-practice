package org.example.passwordValidator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class UserTest {
    @DisplayName("패스워드를 초기화한다.")
    @Test
    void passwordTest() {
        User user = new User();

        user.initPassword(new CorrectFixPasswordGenerator());

        assertThat(user.getPassword()).isNotNull();
    }

    @DisplayName("패스워드가 요구사항에 부합되지 않아 초기화가 되지 않는다.")
    @Test
    void passwordTest2() {
        User user = new User();

        user.initPassword(new WrongFixPasswordGenerator());

        assertThat(user.getPassword()).isNull();
    }
}