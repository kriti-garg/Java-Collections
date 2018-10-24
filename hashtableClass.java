import java.util.*;

import javax.lang.model.util.ElementScanner6;
public class hashtableClass{
    public static void main(String[] args){
        Hashtable t = new Hashtable();
        t.put("1",new Integer(23));
        t.put("2",new Double(23.7));
        System.out.println(t);
        if(t.contains(23.7))
        System.out.println("Yes");
        else
        System.out.println("No");

        Enumeration e = t.elements();
        while(e.hasMoreElements()){
            System.out.println(e.nextElement());
        }
        Enumeration e1 = t.keys();
        while(e1.hasMoreElements()){
            System.out.println(e1.nextElement());
        }
        t.remove(1);
        Set j = t.keySet();
        System.out.print(j);
         Set m = t.entrySet();
         System.out.print(t.values());
    }
}