public class Drink {

    private static double weight;
    private static double litrePrice;

    public Drink(double weight,double litrePrice){
        Drink.weight = weight;
        Drink.litrePrice = litrePrice;
    }

    public static double getWeight() {
        return Drink.weight;
    }

    public static double getLitrePrice(){
        return Drink.litrePrice;
    }
}