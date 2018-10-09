import java.util.*;
class Student implements Comparable<Student>{
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
   /*  public int compareTo(Student o){
       if(id==o.id)
       return 0;
       else if(id>o.id)
       return 1;
       else
       return -1;
    } */
    public int compareTo(Student o){
        if(name.compareTo(o.name)==0)
        return 0;
        else if(name.compareTo(o.name)>0)
        return 1;
        else return -1;
    }
}

public class treesSetClass{
    public static void main(String[] args){
        Student o1 = new Student(1,"kriti",78);
        Student o2 = new Student(2,"arnav",90);
        TreeSet<Student> obj = new TreeSet<Student>();
        obj.add(o1);
        obj.add(o2);
        for(Student k : obj)
        System.out.println(k);
    }
}
