import java.util.*;
public class linkedList{
    public static void main(String[] args){
        LinkedList<String> ob = new LinkedList<String>();
        ob.add("AB");
        ob.addFirst("Kriti");
        ob.addLast("Garg");
        ob.add("kriti");
        ob.add("kriti");
        /* ob.removeFirstOccurence("Kriti");
        ob.removeLastOccurence("Kriti"); */
       /*  ob.removeFirst();
        ob.removeLast(); */
        Iterator it = ob.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        Object o = ob.getFirst();
        System.out.print(o);
        System.out.print(ob.indexOf("Kriti"));
        System.out.print(ob.lastIndexOf("Garg"));
    }
}