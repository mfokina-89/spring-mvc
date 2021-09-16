package web.service1;

import web.model.Car;

import java.util.List;

public interface CarService {
    List<Car> getCars(Integer count);
}
