import java.util.*;
public class priority_queue{//uses minHeap
    public static void main(String[] args) {
        PriorityQueue<Integer> ob = new PriorityQueue<Integer>();
        ob.add(10);
        ob.add(2);
        ob.add(3);
        ob.add(4);
        ob.add(5);
        ob.add(6);
        System.out.println(ob.element());
        System.out.println(ob.peek());
        System.out.println(ob.poll());
        System.out.println(ob.remove());
        System.out.println(ob.poll());
    }    
}