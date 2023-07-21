package web.service;
import org.springframework.stereotype.Service;
import web.model.Car;
import java.util.ArrayList;
import java.util.List;


@Service
public class CarServiceImpl implements CarService {

    private List<Car> cars;

    public CarServiceImpl() {
        cars = new ArrayList<>();
        cars.add(new Car("Буханка", 1960, "Ржавая"));
        cars.add(new Car("Kia", 2016," Grey"));
        cars.add(new Car("Mers", 2017 ,"Black"));
        cars.add(new Car("Kamaz", 2014,"Red"));
        cars.add(new Car("Volvo",2020 ," Brown"));
    }




    @Override
    public List<Car> getCars(int count) {
        return cars.stream().limit(count).toList();
    }


}