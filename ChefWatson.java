
import java.util.*;
class ChefWatson
{
    public static void main(String[] args)
    {
        Map<Integer,String> m1 = new TreeMap<Integer,String>(Collections.reverseOrder());
        Map<Integer,String> m2 = new TreeMap<Integer,String>(Collections.reverseOrder());
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        for(int i=0;i<n;i++) 
        {
            int a=in.nextInt();
            m1.put(a,"");
        }
        for(int i=0;i<m;i++)
        {
            int first=in.nextInt();
            if(m1.containsKey(first))
            {
                int a=in.nextInt();
                String s=in.next(); //   in.nextLine();
                m1.put(a,s);
            }
            else {
                int a=in.nextInt();
            
                String s=in.next();  //  in.nextLine();
                m2.put(a,s);
      
            }
        }


        
        for (String as: m1.values()){
            if(as!="")
                System.out.println(as);
        }
        for (String as: m2.values()){
            if(as!="")
                System.out.println(as);
        }



    }
}