import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Working with Cars!");

        //create a car
        //datatype (Car), variableName (car) = create new object
        Car car1 = new Car("Hudson", "blue", 200);
        //give the attributes value /\

        //creates second car
        Car car2 = new Car("Mater", "brown", 100);
        //give the attributes value /\


        System.out.println(car1.getName() + " is " + car1.getColor() + " and has a max speed of: ");
        System.out.println(car2.getName() + " is " + car2.getColor());

        car1.speedUp(200);
        car2.speedUp(95);


        //This is a static array list
        ArrayList<Car> myCars = new ArrayList<>();
        myCars.add(car1);
        myCars.add(car2);
        myCars.add(new Car("Lightning McQueen", "red", 400));   //Skapar ny bil i array list

        //Hämtar bilar från array listan. (myCars = namnet på arrayen)
        Car theCar = myCars.get(0);

        System.out.println(theCar.getName() + " is " + theCar.getColor() + " and has a max speed of: " + theCar.getSpeed());


    }
}