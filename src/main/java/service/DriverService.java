package service;

import entity.Driver;
import entity.LicenceStatus;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DriverService {
    public boolean hasLicence(Driver driver) {
        log.debug("Method hasLicence(Driver driver) called.");
        return driver.getLicenceStatus().equals(LicenceStatus.HAS);
    }
}
