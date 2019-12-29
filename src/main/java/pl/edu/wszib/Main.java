package pl.edu.wszib;

import pl.edu.wszib.CUI.UserInterface;


public class Main {
    public static void main(String[] args) {

        UserInterface userInterface = new UserInterface();
        userInterface.ShowInterface();

        //Car car = new Car(20, "Audi", "A4", 1999);


        //CarServiceImpl.saveCar(car);
        //CarRepository.persistCar(car);

        /*Car car2 = CarRepository.getCarById(1);
        car2.setModel("6");
        CarRepository.persistCar(car2);
        Car updatedCarFromDb = CarRepository.getCarById(1);
        System.out.println(updatedCarFromDb);*/
        //System.out.println(product);


    }
}
