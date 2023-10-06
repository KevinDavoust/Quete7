public class Hangar {

    public static void main(String[] args) {

        Car ferrari = new Car("ferrari", 12);
        Boat paquebot = new Boat("paquebot", 22);

        System.out.println(ferrari.doStuff());
        System.out.println(paquebot.doStuff());
    }
}
