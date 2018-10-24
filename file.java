import java.util.*;
class Student implements Comparable{
    public int rollno;
    public String name;
    void getRollno(){
       System.out.print(rollno + " ");
    }
    void setRollno(int rollno){
        this.rollno = rollno;
    }
    void setName(String str){
        this.name = str;
    }
    void getName(){
        System.out.print(name + " ");
    }
    public int compareTo(Student o){
        if(rollno==o.rollno)
        return 0;
        else if(rollno>o.rollno)
        return 1;
        else return -1;
    }
}
public class file{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeSet<Student> obj = new TreeSet<Student>();
        int testCases;
        testCases = sc.nextInt();
        for(int i=0;i<testCases;i++){
            Student ob = new Student();
            String str = sc.nextLine();
            ob.setName(str);
            int rollno = sc.nextInt();
            ob.setRollno(rollno);
            obj.add(ob);
        }
        int h=1;
        for(Student k:obj)
        {
            System.out.print(h + " " + k);
            h++;
        }
    }
}