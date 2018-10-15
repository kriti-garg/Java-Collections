import java.util.*;
public class ArrayPQ{
    public static void main(String[] args) {
        int arr[] = {7,10,-3,4,-10};
        int j=arr.length;
        j=j-1;
        for(int i=0;i<=arr.length-1;i++){
            if(arr[i]==0){
                arr[j--]=arr[i];
            }
            if(arr[i]>arr[i+1]){
                int temp;
                temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
    for(int i=0;i<arr.length;i++)
    System.out.print(arr[i] + " ");
    }
}