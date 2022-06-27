package Exercises.CarLot.service;

import Exercises.CarLot.dto.Car;
import Exercises.CarLot.dto.CarKey;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CarLotServiceImpl implements CarLotService
{
    Map<String, Car> cars = new HashMap<String, Car>();
    @Override
    public Car getACar(String VIN)
    {
        return cars.get(VIN);
    }

    @Override
    public List<Car> getAllCars()
    {
        return (List<Car>) cars.values();
    }

    @Override
    public List<Car> getCarsByColor(String color)
    {
        List<Car> carsColor = new ArrayList<>();
        for(Car car : cars.values())
        {
            if(car.getColor().equals(color))
            {
                carsColor.add(car);
            }
        }
        return carsColor;
    }

    @Override
    public List<Car> getCarsInBudget(BigDecimal maxPrice)
    {
        List<Car> carsBudget = new ArrayList<>();
        for(Car car : cars.values())
        {
            if(car.getPrice().compareTo(maxPrice) < 0)
            {
                carsBudget.add(car);
            }
        }
        return carsBudget;
    }

    @Override
    public List<Car> getCarByMakeAndModel(String make, String model)
    {
        List<Car> carsMakeModel = new ArrayList<>();
        for(Car car : cars.values())
        {
            if(car.getMake().equals(make) && car.getModel().equals(model))
            {
                carsMakeModel.add(car);
            }
        }

        return carsMakeModel;
    }

    @Override
    public BigDecimal discountCar(String VIN, BigDecimal percentDiscount) throws NoSuchCarException
    {
       Car car = getACar(VIN);
       if(car == null)
       {
           throw new NoSuchCarException("-- No such car exists, with VIN: "+ VIN +" --");
       }
       else
       {
           return (car.getPrice().multiply(percentDiscount.divide(BigDecimal.valueOf(100), RoundingMode.UP)));
       }
    }

    @Override
    public CarKey sellCar(String VIN, BigDecimal cashPaid) throws NoSuchCarException, OverpaidPriceException, UnderpaidPriceException
    {

        Car car = getACar(VIN);
        if(car == null)
        {
            throw new NoSuchCarException("-- No such car exists, with VIN: "+ VIN +" --");
        }
        else
        {
            int priceCompare = car.getPrice().compareTo(cashPaid);
            if (priceCompare > 0)
            {
                throw new OverpaidPriceException("-- You have paid too much money for this car --");
            }
            else if(priceCompare < 0)
            {
                throw new UnderpaidPriceException("-- You have paid too little money for this car --");
            }
            else
            {
                cars.remove(VIN);
                return car.getKey();
            }
        }
    }
}
