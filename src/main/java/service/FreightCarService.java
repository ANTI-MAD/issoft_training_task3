package service;

import entity.Cargo;
import entity.FreightCar;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class FreightCarService {
    public boolean loadCargo(FreightCar freightCar, Cargo cargo) {
        log.debug("Method loadCargo(FreightCar freightCar, Cargo cargo) called.");
        if (freightCar.getAvailableLoadCapacity() >= cargo.getWeight()) {
            log.debug("Sufficient load capacity");
            freightCar.addToTheCargoList(cargo);
            freightCar.changeAvailableLoadCapacity(cargo);
            return true;
        } else {
            log.debug("Insufficient load capacity");
            return false;
        }
    }
}
