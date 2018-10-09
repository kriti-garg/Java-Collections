import java.util.*;
public class hashSet{
    public static void main(String[] args){
       /*  HashSet<String> ob = new HashSet<String>();
        ob.add("Kriti");
        ob.add("Garg");
        ob.add(null);
        ob.add("nidhi");
        ob.add("Kriti");
        //ob.clear();
        ob.remove("Kriti");
        System.out.println(ob.contains("Garg"));
        for(String k : ob){
            System.out.println(k);
        } */
        LinkedHashSet<String> ob = new LinkedHashSet<String>();
        ob.add("Kriti");
        ob.add("Garg");
        ob.add(null);
        ob.add("nidhi");
        ob.add("Kriti");
        //ob.clear();
        ob.remove("Kriti");
        System.out.println(ob.contains("Garg"));
        for(String k : ob){
            System.out.println(k);
        }
    }
} 