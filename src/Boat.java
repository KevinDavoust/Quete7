public class Boat extends Vehicle{
    public Boat(String brand, Integer kilometers) {
        super(brand, kilometers);
    }

    @Override
    public String doStuff() {
        return "Je suis " + this.getBrand() + " et je flotte";
    }
}
