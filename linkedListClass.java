import java.util.*;
class Student{
    public int id;
    public String name;
    public double marks;
    Student(int id,String name,double marks){
        this.id = id;
        this.name = name;
        this.marks = marks;
    }
    public String toString(){
        return "student{" + "id=" + id + ", name=" + name + ",marks=" + marks + "}";
    }
}
public class linkedListClass{
    public static void main(String[] args){
        Student o1 = new Student(1,"kriti",78);
        Student o2 = new Student(2,"nidhi",90);
        LinkedList<Student> ob = new LinkedList<Student>();
        ob.add(o1);
        ob.add(o2);
        ArrayList<Student> ob1 = new ArrayList<Student>();
        ob1.add(o1);
        ob1.add(o2);
        for(Student k : ob1){
            System.out.println(k);
        }
    }
}