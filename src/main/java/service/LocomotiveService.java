package service;

import entity.Driver;
import entity.Locomotive;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LocomotiveService {
    private final DriverService driverService = new DriverService();
    private final UserService userService = new UserService();

    public String appointDriver(Locomotive locomotive, Driver driver) {
        log.debug("Method appointDriver(Locomotive locomotive, Driver driver) called.");
        if (userService.getAge(driver) >= 18) {
            log.debug("The user is 18 or over 18 years old.");
            if (driverService.hasLicence(driver)) {
                log.debug("The user has a licence.");
                locomotive.setDriver(driver);
                return "Driver " + driver.getFirstName() + " " + driver.getLastName() + " appointed";
            } else {
                log.debug("User does not have a licence.");
                return "Driver " + driver.getFirstName() + " " + driver.getLastName() + " is not licenced";
            }
        } else {
            log.debug("User under 18 years old.");
            return "Driver " + driver.getFirstName() + " " + driver.getLastName() + " under eighteen";
        }
    }
}
