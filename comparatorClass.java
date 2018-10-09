import java.util.*;

import javax.lang.model.util.ElementScanner6;

import java.lang.*;
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
/* class studentIdSort implements Comparator<Student>{
    public int compare(Student o1,Student o2){
        if(o1.id==o2.id)
        return 0;
        else if(o1.id>o2.id)
        return 1;
        else
        return -1;
    }
}
class studentNameSort implements Comparator<Student>{
    public int compare(Student o1,Student o2){
        if(o1.name.compareTo(o2.name)==0)
        return 0;
        else if(o1.name.compareTo(o2.name)>0)
        return 1;
        else 
        return -1;

    }
} */
class studentMarksSort implements Comparator<Student>{
    public int compare(Student o1,Student o2){
        if(o1.marks==o2.marks)
        {
             if(o1.name.equals(o2.name))
             {
                 if(o1.id==o2.id)
                 return 0;
                 else if(o1.id>o2.id)
                 return 1;
                 else return -1;
             }
             else if(o1.name.compareTo(o2.name)>0){
                return 1;
             }
             else 
             return -1;
        }
        else if(o1.marks>o2.marks)
        return 1;
        else
        return -1;
    }
}
public class comparatorClass{
    public static void main(String[] args) {
        Student o1 = new Student(1,"kartik",78);
        Student o2 = new Student(2,"aman",78);
        Student o3 = new Student(3,"kriti",78);
        Student o4 = new Student(4, "aman", 78);
        Student o5 = new Student(5,"attri",90);
        ArrayList<Student> obj = new ArrayList<Student>();
        obj.add(o1);
        obj.add(o2);
        obj.add(o3);
        obj.add(o4);
        obj.add(o5);
        for(Student k : obj)
        System.out.println(k);
        System.out.println();
        System.out.println();
      /*   Collections.sort(obj, new studentIdSort());
        for(Student k : obj)
        System.out.println(k);
        Collections.sort(obj, new studentNameSort());
        for(Student k : obj)
        System.out.println(k); */
        Collections.sort(obj,new studentMarksSort());
        for(Student k : obj)
        System.out.println(k);
    }
}