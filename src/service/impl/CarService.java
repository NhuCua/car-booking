package service.impl;

import model.Car;
import model.User;

import java.util.ArrayList;
import java.util.List;

public class CarService {

    public List<Car> initListCars() {
        List<Car> cars = new ArrayList<Car>();
        cars.add(new Car("Mer", "1", "electric"));
        cars.add(new Car("BMW", "2", "gasoline"));
        cars.add(new Car("Vin", "3", "electric"));
        return  cars;
    }

}
