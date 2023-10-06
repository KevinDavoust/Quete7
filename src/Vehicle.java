public abstract class Vehicle {

    protected String brand;
    protected Integer kilometers;

    public Vehicle(String brand, Integer kilometers) {
        this.brand = brand;
        this.kilometers = kilometers;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Integer getKilometers() {
        return kilometers;
    }

    public void setKilometers(Integer kilometers) {
        this.kilometers = kilometers;
    }

    public abstract String doStuff();
}
