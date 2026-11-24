package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarService {

    private List<Car> listCars = new ArrayList<>();

    public void createCars() {
        for (int i = 0; i < 5; i++) {
            this.listCars.add(new Car("model" + i, "seria" + i, 2003));
        }
    }

    public List<Car> getCars(Integer count){
        if (listCars == null || count >= listCars.size()){
            return listCars;
        }
        return listCars.stream().limit(count).toList();
    }

    public CarService() {
        this.createCars();
    }
}
