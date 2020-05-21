
public class Bottle {

    private static double volume;
    private static double mass;
    private static double tarePrice;
    private static Drink drink;
    private static double price;

    public Bottle(double volume, double tarePrice, Drink drink) {
        Bottle.volume = volume;
        Bottle.tarePrice = tarePrice;
        Bottle.drink = drink;
    }

    public static double calcMass() {
        if (drink != null) {
            mass = Drink.getWeight() * volume;

        } else {
            System.out.println("Bottle is empty");
        }
        return mass;

    }

    public static double calcPrice() {
        if (drink != null) {
            mass = volume * Drink.getWeight();
            price = (mass * Drink.getLitrePrice() / 1000) + tarePrice;
        } else {
            System.out.println("Bottle is empty");
            price = tarePrice;
        }
        return price;

    }

    public static double getVolume() {
        return volume;
	}
}