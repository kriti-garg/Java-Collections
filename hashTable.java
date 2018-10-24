/*
It is a class and implements a hashtable which maps key to a value.
It inherits Dictionary class and implements Map interface.
It is an array of list.
Each List is known as a bucket.
The position of bucket is identified by calling the hashcode method.
It contains only unique elements.
Hastable t = new Hashtable();
*/

/*
clone method::
Hastable ob = (Hashtable)ob.clone();
*/
import java.util.*;
public class hashTable{
    public static void main(String[] args){
        Hashtable<Integer,String> obj = new Hashtable<Integer,String>();
        obj.put(1,"Kriti");
        obj.put(2,"garg");
        /*
        Set s = ob.entrySet();
        Iterator i = s.iterator();
        while(i.hasNext()){
            Map.Entry e = (Map.Entry)i.next();
            System.out.println(k.getKey() + " " + k.getValue());
        }
        */
        Hashtable ob = (Hashtable)obj.clone();
        /* for(Map.Entry k:ob.entrySet()){
            System.out.println(k.getKey() + " " + k.getValue());
        } */
        System.out.println(ob);
    }
}