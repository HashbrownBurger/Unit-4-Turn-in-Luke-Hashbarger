
public class Car {
    private String make;
    private String model;
    private double MPG;
    private double tankSize;
    private double amountFuel;
    double distanceDriven;

    public Car(String var1, String var2, double var3, double var5) {
        make = var1;
        model = var2;
        MPG = var3;
        tankSize = var5;
        amountFuel = var5;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public double getMPG() {
        return MPG;
    }

    public double getTankSize() {
        return tankSize;
    }

    public double getAmountFuel() {
        return amountFuel;
    }

    public String toString() {
        String var1 = "";
        var1 = var1 + "\n Make: " + make + "\n";
        var1 = var1 + "Model: " + model + "\n";
        var1 = var1 + "MPG: " + MPG + "\n";
        var1 = var1 + "Fuel: " + amountFuel + "\n";
        return var1;
    }

    public double drive(double var1) {
        this.amountFuel = (this.MPG * this.tankSize - var1) / this.MPG;
        return this.amountFuel;
    }

    public double addFuel(double var1) {
        this.amountFuel += var1;
        return this.amountFuel;
    }
}
