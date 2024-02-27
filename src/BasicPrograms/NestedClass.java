package BasicPrograms;

public class NestedClass
{
    public static void main(String[] args)
    {
        Car c=new Car("Lambo");
        c.drive();
        Car.Engine e=c.new Engine("500hp");
        e.start();
        c.drive();
    }
}
class Car
{
    String make;

    public Car(String make) {
        this.make = make;
    }

    void drive()
    {
        System.out.println("You can drive a car..");
    }

    public class Engine
    {
        String hp;

        public Engine(String hp) {
            this.hp = hp;

        }

        void start()
        {
            System.out.println("Engine started..");
        }
    }
    public class Break{}
    public class Accelerate{}
}
