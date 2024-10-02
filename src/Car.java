public class Car {
    //Attributes
    private String color;   //NO standard value is given
    private int speed = 0;  //standard value is given (Gives speed 0 if nothing else is given)
    private String name;
    private int maxSpeed;


    //constructor
    Car(String name, String color, int maxSpeed) {
        this.name = name;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }


    //methods
    public void speedUp(int change) {
        if (speed + change <= maxSpeed) {
            speed += change;
            System.out.println(name + " has now a speed of: " + speed + " km/h\n");
        } else {
            System.out.println("You cannot exceed your max speed!\n");
        }
    }
    //public = alla kan använda informationen (Alla attribute är private)
    //private = bara denna klass får tillgång till den informationen (Alla metoder är public)


    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }
}
