import java.util.*;
class Que8
{
    public static void main(String[] arg)
    {
        int n,i,num;
        String s;
        Scanner sd=new Scanner(System.in);
        n=sd.nextInt();
      sd.nextLine();
        HashMap <String,Integer> h=new HashMap<String,Integer>();
    for(i=0;i<n;i++)
    {
      s=sd.nextLine();
      num=sd.nextInt();
      sd.nextLine();
      h.put(s,num);
    }
    for(i=0;i<n;i++)
    {
        s=sd.nextLine();
        if(h.containsKey(s))
        System.out.println(s+"="+h.get(s));
        else
        System.out.println("Not found");
    }
    }
}