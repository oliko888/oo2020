public class Carton {

    private static double cartonPrice;
    private static double cartonMass;
    private static int cartonSize;

    public Carton(double cartonPrice, double cartonMass, int cartonSize) {
        Carton.cartonPrice = cartonPrice;
        Carton.cartonMass = cartonMass;
        Carton.cartonSize = cartonSize;
    }

    public static int getCartonSize() {
        return cartonSize;
    }

    public double calcCommonMass(Bottle bottle1) {
        double commonMass = (Bottle.calcMass() * cartonSize) + cartonMass;
        return commonMass;
    }

    public double calcCartonPrice(Bottle bottle1) {
        double endPrice = (Bottle.calcPrice() * cartonSize) + cartonPrice;
        return endPrice;
    }

    
}