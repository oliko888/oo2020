public class Main {
    public static void main(String[] args) {
        Drink appleJuice = new Drink(5500.0, 1.00);
        
        Bottle bottle = new Bottle(2.0, 0.10, appleJuice);
        System.out.println("Bottle weighs " + Bottle.calcMass() + " gramms.");
        System.out.println("Drink costs " + Bottle.calcPrice() + " dollars"); 
        
        Barrel barrel = new Barrel(1.0, 10.0);
        System.out.println("Barrel has " + Barrel.fillBottles(bottle) + " litres left.");
        
        System.out.println(barrel.clearBarrel(bottle) + " bottles have been filled.");
        
        Carton carton = new Carton(6.95, 1500.0, 24);
        System.out.println("Full tare weight is " + carton.calcCommonMass(bottle)+" gramms.");
        System.out.println("Full tare price is " + carton.calcCartonPrice(bottle) + " $"); 
    }

}