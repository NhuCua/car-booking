package service.impl;

import dao.iml.CarDao;
import model.Car;

import java.util.List;

public class CarService {
    private final CarDao carDao = new CarDao();

    public void viewAll() {
        List<Car> cars = carDao.getAll();
        for (Car car : cars) {
            System.out.println(car.toString());
            System.out.println("-------------------");
        }
    }

    public void viewAllElectricCars() {
        carDao.getAll().stream()
                .filter(car -> car.getType().equals("electric"))
                .forEach(car -> {
                    System.out.println(car);
                    System.out.println("-------------------");
                });
    }

    public List<Car> getAll() {
        return carDao.getAll();
    }
}
