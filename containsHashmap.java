import java.util.*;
public class containsHashmap{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int flag=0;
        int p;
        String r;
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
        System.out.print("Enter the key you wanna search");
        p= sc.nextInt();
        sc.nextLine();
        System.out.print("Enter the value you wanna search");
        r = sc.nextLine();
        for(Map.Entry k:obj.entrySet()){
            if(k.getKey().equals(p) || k.getValue().equals(r)){
                System.out.println(k.getKey() + "->" + k.getValue());
               // System.out.println(k.getKey() + "->" + r);
                flag=1;
            }
            /* if(k.getValue().equals(r)){
                System.out.print(k.getKey() + "->" + r);
                flag=1;
            } */
           /*  System.out.print(k.getValue() + " ");
            System.out.print(k.getKey()); 
            System.out.println();*/
        }
        if(flag==0)
        System.out.print("Not Found");
    }
}