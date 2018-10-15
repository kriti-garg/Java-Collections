import java.util.*;
public class arrayList{
    public static void main(String[] args){
        //List<String> ob= new ArrayList<String>();
        ArrayList<String> ob= new ArrayList<String>();
        ob.add("hii");
        ob.add("biie");
        ob.add(2,"hello");
        ob.add(3,"kriti");
        ob.add(4,"garg");
        Iterator t = ob.iterator();
        /*while(t.hasNext()){
             System.out.println(t.next());
        }*/
        ob.remove(3);
        ob.remove("hello");
        //ob.remove(2);
        ob.set(2,"kriti");//to update the value
        Collections.swap(ob,1,2);//swapping will take place between 1 and 2 indexes
       /*  for(String a:ob){
             System.out.println(a);
        } */
        System.out.println(ob.get(2));
       /*  System.out.println("index: " + ob.indexOf("hii"));
        System.out.println("size of ArrayList is : " + ob.size());
        System.out.println("contains method : " + ob.contains("no"));
        ob.clear();
        System.out.println("size after clearing : " + ob.size()); */
    }
}