public class Barrel {

    private static double volume;
    private static double amount;

    public Barrel(double volume, double amount) {
        Barrel.volume = volume;
        Barrel.amount = amount;
    }

    public static double getvolume() {
        return volume;
    }

    public static double fillBottles(Bottle bottle1) {
        double newAmount = 0;
        if (amount != 0 && amount > Bottle.getVolume()) {
            newAmount = amount - Bottle.getVolume();
            System.out.println("Bottle was filled to the brim");
        } else {
            System.out.println("Not enough liquid");
        }
        return newAmount;
    }

    public int clearBarrel(Bottle bottle1) {
        int count = 0;

        double litres = volume*1000;
        while(litres != 0){
            litres = litres - Bottle.getVolume();
            count+=1;
        }
        return count;
    }

    public double toBottle(Bottle bottle1, Carton carton) {
        int count = 0;

        double litres = volume*1000;
        while(litres != 0){
            litres = litres - Bottle.getVolume();
            count += 1;
        }
        double amount = count / Carton.getCartonSize();
        return amount;
    }
}