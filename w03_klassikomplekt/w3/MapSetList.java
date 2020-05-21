import java.util.HashMap;
import java.util.HashSet;
import java.util.ArrayList;


public class MapSetList {

    public static void main(String[] args) {
    
        
   
        HashMap<String, String> animals = new HashMap<String, String>();
        animals.put("Delfiin","Imetaja");
        animals.put("El Tigro","Imetaja");
        animals.put("Kass","Imetaja");
        animals.put("Kärnkonn","Amphibian");
        animals.put("Hobene","Imetaja");
        animals.put("Alligaator", "Reptiil");
        
        System.out.println(animals);
        animals.remove("Tiger");
        System.out.println(animals);

    
        HashSet<String> riigid = new HashSet<String>();
        riigid.add("Eesti");
        riigid.add("Eesti");
        riigid.add("Austraalia");
        riigid.add("Norra");
        riigid.add("Soome");
        System.out.println(riigid);

        riigid.remove("Soome");
        System.out.println(riigid);

   
        ArrayList<String> asjad = new ArrayList<String>();
        asjad.add("Lauad");
        asjad.add("Toolid");
        asjad.add("Diivanid");
        asjad.add("Lambid");
        asjad.add("Soolad");
        System.out.println(asjad);
        asjad.set(2,"Piprad");
        System.out.println(asjad);
    }
}
