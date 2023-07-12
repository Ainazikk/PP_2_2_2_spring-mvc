package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiceImpl implements CarService{

    private List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car("Toyota", "f7"));
        cars.add(new Car("Hyundai", "879"));
        cars.add(new Car("Audi", "100"));
        cars.add(new Car("Tesla", "m6"));
        cars.add(new Car("Lexus", "a500"));
    }

    public List<Car> show(int count) {
        if (count < 0 || count > cars.size()) {
            return cars;
        } else {
            return cars.subList(0, count);
        }
    }
}