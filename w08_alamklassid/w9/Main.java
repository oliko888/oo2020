
public class Main {

    public static void main(String[] args) {
        Beer beer = new Beer("Blond lager", 5, false, "Saku Tume");
        beer.isDrunk();
        beer.drinkType();

        Vodka vodka = new Vodka("Spirit", 40, true, "Mõrnaja");
        vodka.isDrunk();
        vodka.drinkType();
    }

}
