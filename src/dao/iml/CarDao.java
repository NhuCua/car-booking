package dao.iml;

import dao.Dao;
import model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarDao implements Dao<Car> {
    private final List<Car> cars = new ArrayList<>();

    public CarDao() {
        cars.add(new Car("Mer", "1", "electric"));
        cars.add(new Car("BMW", "2", "gasoline"));
        cars.add(new Car("Vin", "3", "electric"));
    }

    @Override
    public List<Car> getAll() {
        return cars;
    }

    @Override
    public void viewAll() {

    }
}
