package service;

import entity.LicenceStatus;
import entity.User;
import lombok.extern.slf4j.Slf4j;

import java.time.LocalDate;
import java.time.Period;

@Slf4j
public class UserService {

    public boolean isAdult(User user) {
        log.debug("Method isAdult(User user) called.");
        if (getAge(user) >= 18) {
            log.debug("The user is 18 or over 18 years old.");
            return true;
        } else {
            log.debug("User under 18 years old.");
            return false;
        }
    }

    public int getAge(User user) {
        log.debug("Method getAge(User user) called.");
        return Period.between(user.getBirthday(), LocalDate.now()).getYears();
    }
}
