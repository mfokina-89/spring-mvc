package web.service1;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiceImp implements CarService{
    private List<Car>carList = new ArrayList<>();
    private List<Car>resultList = new ArrayList<>();
    {
      carList.add(new Car("BMW","750","black"));
      carList.add(new Car("Mercedes","GLA","white"));
      carList.add(new Car("Nissan","X-Trail","gray"));
      carList.add(new Car("Volvo","S80","blue"));
      carList.add(new Car("Toyota","Rav4","red"));
    }

    @Override
    public List<Car>getCars(Integer count){

        if (count == null || count >= 5) {
            return carList;
        }

        List <Car> sublist = carList.subList(0,count);
        return sublist;
    }
}

