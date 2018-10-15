class temp<T,T1>{
    T1 summ;
    temp(T arr[]){
        for(int i=0;i<arr.length;i++){
            summ = summ + arr[i];
           // System.out.print(arr[i] + " ");
    }
    System.out.print(summ);
       /*  for(int i=0;i<arr.length;i++){
            summ = summ + arr[i];
        }
        return summ; */
    }
}
public class SumArrayGeneric{
    public static void main(String[] args) {
        int summ;
        Integer arr[] = {1,2,3,4,5,6,7,8};
        temp ob = new temp<Integer,int>(arr,summ);
        /* int result = ob.sum(arr,summ);
        System.out.println(result); */
    }
}

