package service;

import entity.Driver;
import entity.LicenceStatus;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

class DriverServiceTest {
    private final DriverService driverService = new DriverService();

    @Test
    void hasLicence() {
        LocalDate localDate = LocalDate.of(1992, 4, 20);
        Driver driver = new Driver("firstName", "lastName",
                localDate,
                LicenceStatus.HAS);

        boolean bool = driverService.hasLicence(driver);

        assertThat(Boolean.TRUE, is(equalTo(bool)));
    }

    @Test
    void hasNotLicence() {
        LocalDate localDate = LocalDate.of(1992, 4, 20);
        Driver driver = new Driver("firstName", "lastName", localDate);

        boolean bool = driverService.hasLicence(driver);

        assertThat(Boolean.FALSE, is(equalTo(bool)));
    }

}