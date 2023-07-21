// 2. 

class Automobile{
    private String drive() {
        return "Driving Vehicle";
    }
}

class Car extends Automobile{
    protected String drive() {
        return "Driving car";
    }
}

public class ElectricCar extends Car{

    @Override
    public final String drive() {
        return "Driving electric car";
    }

    public static void main(String args[]){
        final Car car = new ElectricCar();
        System.out.print(car.drive());
    }
}

