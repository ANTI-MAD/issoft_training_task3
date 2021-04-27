package service;

import entity.Cargo;
import entity.FreightCar;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class FreightCarService {
    public String loadCargo(FreightCar freightCar, Cargo cargo) {
        log.debug("Method loadCargo(FreightCar freightCar, Cargo cargo) called.");
        if (freightCar.getLoadCapacity() >= cargo.getWeight()) {
            log.debug("Sufficient load capacity");
            return "Number of FreightCar " + freightCar.getNumber() + "; Number of Cargo " + cargo.getNumber();
        } else {
            log.debug("Insufficient load capacity");
            return "Insufficient load capacity";
        }
    }
}
