package service;

import entity.Cargo;
import entity.FreightCar;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

class FreightCarServiceTest {
    private final FreightCarService freightCarService = new FreightCarService();

    @Test
    void loadCargoWithSufficientLoadCapacity() {
        FreightCar freightCar = new FreightCar(1234L, "model", 10000.0);
        Cargo cargo = new Cargo(123L, 2000.0);

        final String info = freightCarService.loadCargo(freightCar, cargo);

        assertThat("Number of FreightCar 1234; Number of Cargo 123", is(equalTo(info)));
    }

    @Test
    void loadCargoWithInsufficientLoadCapacity() {
        FreightCar freightCar = new FreightCar(1234L, "model", 10000.0);
        Cargo cargo = new Cargo(123L, 20000.0);

        final String info = freightCarService.loadCargo(freightCar, cargo);

        assertThat("Insufficient load capacity", is(equalTo(info)));
    }
}