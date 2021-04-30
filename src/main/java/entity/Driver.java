package entity;

import java.time.LocalDate;

public class Driver extends User {
    private LicenceStatus licenceStatus;

    public Driver(String firstName, String lastName, LocalDate birthday) {
        super(firstName, lastName, birthday);
        this.licenceStatus = LicenceStatus.NOT_HAS;
    }

    public Driver(String firstName, String lastName, LocalDate birthday, LicenceStatus licenceStatus) {
        super(firstName, lastName, birthday);
        this.licenceStatus = licenceStatus;
    }

    public LicenceStatus getLicenceStatus() {
        return licenceStatus;
    }

    public void setLicenceStatus(LicenceStatus licenceStatus) {
        this.licenceStatus = licenceStatus;
    }

    public boolean hasLicence() {
        return licenceStatus.equals(LicenceStatus.HAS);
    }
}
