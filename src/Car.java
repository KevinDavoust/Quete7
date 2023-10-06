public class Car extends Vehicle{



    public Car(String brand, Integer kilometers) {
        super(brand, kilometers);

    }

    @Override
    public String doStuff() {
        return "Je suis " + this.getBrand() + " et je fais vroumvroum";
    }
}
