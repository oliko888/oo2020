/**
 * Food
 */
public abstract class Beverages {

    public String type;
    public int alcoholLevel;
    public boolean drunk;
    public String name;

	public Beverages(String type,int alcoholLevel,boolean drunk, String name){
        this.type=type;
        this.alcoholLevel=alcoholLevel;
        this.drunk=drunk;
        this.name=name;
    }
    public void isDrunk(){
        if(drunk){
            System.out.println("This "+this.name+" made u drunk!");
        }else{
            System.out.println("This "+this.name+" did not affect you!");
        }
    }

    public void drinkType(){
        System.out.println("This beverage is a "+this.type);
    }
    
}