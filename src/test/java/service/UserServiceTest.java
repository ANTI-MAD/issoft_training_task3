package service;

import entity.User;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.CoreMatchers.is;

class UserServiceTest {
    private final UserService userService = new UserService();

    @Test
    void getAge() {
        LocalDate localDate = LocalDate.of(1992, 4, 20);
        User user = new User("firstName", "lastName",
                localDate);
        int age = userService.getAge(user);

        assertThat(29, is(equalTo(age)));
    }

    @Test
    void getAge2() {
        LocalDate localDate = LocalDate.of(1992, 7, 27);
        User user = new User("firstName", "lastName",
                localDate);
        int age = userService.getAge(user);

        assertThat(28, is(equalTo(age)));
    }

    @Test
    void isAdult() {
        LocalDate localDate = LocalDate.of(1992, 7, 27);
        User user = new User("firstName", "lastName",
                localDate);

        boolean bool = userService.isAdult(user);

        assertThat(Boolean.TRUE, is(equalTo(bool)));
    }

    @Test
    void isNotAdult() {
        LocalDate localDate = LocalDate.of(2010, 7, 27);
        User user = new User("firstName", "lastName",
                localDate);

        boolean bool = userService.isAdult(user);

        assertThat(Boolean.FALSE, is(equalTo(bool)));
    }
}