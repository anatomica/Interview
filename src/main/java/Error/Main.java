package Error;

public class Main {

    public static void main(String[] args) {

        Car car = new Car();
        car.setName("Red demon");
        car.setEngine("Mori");
        car.setColor("Red");

        car.open();
        car.move();
        car.stop();
        System.out.println(car);

        Lorry lorry = new Lorry();
        lorry.open();
        lorry.stop();
    }
}
