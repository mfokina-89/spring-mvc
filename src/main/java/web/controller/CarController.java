package web.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service1.CarService;

@Controller
public class CarController {

    private CarService service;

    @Autowired
    public CarController(CarService service) {
        this.service = service;
    }

    @GetMapping("/cars")
    public String printCar (@RequestParam(value = "count", required = false) Integer count, ModelMap model){
        model.addAttribute("cars", service.getCars(count));
        return "Car";
    }
}
