import java.util.*;
public class PriorityQueueExample 
{
    public static void main(String[] args) 
    {
       
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(40);
        pq.add(10);
        pq.add(30);
        pq.add(50);
        pq.add(20);
        System.out.println("Initial Priority Queue: " + pq);
        System.out.println("Removed Element: " + pq.poll());
        System.out.println("Queue After Removal: " + pq);
        System.out.println("Top Element : " + pq.peek());
        System.out.println("Remaining Elements in Priority Queue:");
        Iterator<Integer> iterator = pq.iterator();
        while (iterator.hasNext()) 
        {
            System.out.println(iterator.next());
        }
    }
}


