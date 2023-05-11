package web.service;
import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class CarServiceImp implements CarService{

    List<Car> cars = Arrays.asList(new Car(1, "Ferrari", 1989),
                    new Car(2, "BMW", 2021),
                    new Car(3, "Audi", 2010),
                    new Car(4, "Bently", 2000),
                    new Car(5, "Acura", 1999));

    @Override
    public List<Car> listCars(Integer count) {
        return cars.stream().limit(count).toList();
    }
}
