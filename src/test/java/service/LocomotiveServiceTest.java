package service;

import entity.Driver;
import entity.LicenceStatus;
import entity.Locomotive;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

class LocomotiveServiceTest {
    private final LocomotiveService locomotiveService = new LocomotiveService();

    @Test
    void appointDriverSuccess() {
        Locomotive locomotive = new Locomotive(321L, "loco model", 120_000);
        Driver driver = new Driver("Vasya", "Pupkin",
                LocalDate.of(1992, 10, 24),
                LicenceStatus.HAS);

        final String info = locomotiveService.appointDriver(locomotive, driver);

        assertThat("Driver Vasya Pupkin appointed", is(equalTo(info)));
    }

    @Test
    void appointDriverUnderEighteen() {
        Locomotive locomotive = new Locomotive(321L, "loco model", 120_000);
        Driver driver = new Driver("Vasya", "Pupkin",
                LocalDate.of(2010, 10, 24));

        final String info = locomotiveService.appointDriver(locomotive, driver);

        assertThat("Driver Vasya Pupkin under eighteen", is(equalTo(info)));
    }

    @Test
    void appointDriverUnlicensed() {
        Locomotive locomotive = new Locomotive(321L, "loco model", 120_000);
        Driver driver = new Driver("Vasya", "Pupkin",
                LocalDate.of(1992, 10, 24));

        final String info = locomotiveService.appointDriver(locomotive, driver);

        assertThat("Driver Vasya Pupkin is not licenced", is(equalTo(info)));
    }

}