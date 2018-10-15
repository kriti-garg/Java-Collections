/* class abc<T>{
    T num;
    abc(T ob){
        num=ob;
    }
    T getData(){
        return num;
    }
}
class GenericProgramming{
    public static void main(String[] args) {
        //abc<Integer> ob = new abc<Integer>(12);
        abc<String> ob1 = new abc<String>("kriti");
        System.out.println(ob1.getData());
        
    }
} */
class abc<T,T1>
{
    T1 t;
    T num;
    abc(T ob,T1 ob1){
        num = ob;
        t = ob1;
    }
    void display(){
        System.out.println(num + " " + t);
    }
}
class GenericProgramming{
    public static void main(String[] args) {
        abc<Integer,String> ob = new abc<Integer,String>(12,"kriti");
        ob.display();
    }
}