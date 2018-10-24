import java.util.*;

class student implements Comparable<student>
{
    public int age;
    public String name;
    public float cgpa;
    student(int age,String name,float marks)
    {
        this.age=age;
        this.name=name;
        this.cgpa=cgpa;
    }
   public int compareTo(student o)
   {
       if(age==o.age)
          return 0;
       if(age<o.age)
           return -1;
       else
           return 1;
   }

    public String getName() {
        return name;
    }
}
public class attri {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
      TreeSet<student>ob1=new TreeSet<student>();
        int a;
        float c;
        String n;
        Scanner sc=new Scanner(System.in);
        int num;
        num = sc.nextInt();
        //sc.nextLine();
        for(int i=0;i<num;i++)
        {
           // System.out.println("age");
            a=sc.nextInt();
           // System.out.println("name");
            //sc.next();
            n=sc.next();
           // System.out.println("cgpa");
            c=sc.nextFloat();
            student o2=new student(a,n,c);
            ob1.add(o2);
        }
        for(student k:ob1)
            System.out.println(k.getName());
    }
    
}
