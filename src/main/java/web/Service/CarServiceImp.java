package web.Service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarServiceImp implements CarService{
    private List<Car>carList = new ArrayList<>();
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

        return carList.stream()
                .limit(count)
                .collect(Collectors.toList());
    }
}

