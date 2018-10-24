import java.util.*;
public class fileMap{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int testCases;
        testCases = sc.nextInt();
        int l=0;
        HashSet<String> obj = new HashSet<String>();
        for(int i=0;i<testCases;i++)
        {
            sc.nextLine();
            String str1;
            str1 = sc.nextLine();
            obj.add(str1);
            for(String k : obj)
            l++;
            //sc.nextLine();
            System.out.println(l);
        }
    }
}