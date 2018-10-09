import java.util.*;
public class hashMap{
    public static void main(String[] args) {
        HashMap<Integer,String> obj = new HashMap<Integer,String>();
        obj.put(1,"kriti");
        obj.put(2,"attri");
        obj.put(3,"grover");
        obj.put(4,"nidhi");
        obj.put(5,"garg");
        obj.put(6,"kartik");
        obj.put(7,"mittal");
        obj.put(8,"hello");
        obj.put(9,"biiee");
       /*  for(Map.Entry k:obj.entrySet()){
            System.out.print(k.getValue() + " ");
            System.out.print(k.getKey());
            System.out.println();
        } */
        Set s = obj.entrySet();
        Iterator it = s.iterator();
        while(it.hasNext()){
            Map.Entry e = (Map.Entry)it.next();
            System.out.println(e);
        }
        

    }
}