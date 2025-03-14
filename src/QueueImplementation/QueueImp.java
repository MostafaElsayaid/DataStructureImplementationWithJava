package QueueImplementation;

import java.util.LinkedList;
import java.util.Queue;

public class QueueImp {
    public  static  void  main(String[] args){
        // Create a queue
        Queue<Integer> queue = new LinkedList<>();
        // Add elements to the queue
        queue.add(1);
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        //remove elements from the queue
        queue.remove();
        queue.remove(20);
        //update the queue element
        Integer [] elements = queue.toArray(new Integer[0]);
        elements[2] = 200;
        queue.clear();
        for(Integer element : elements){
            queue.add(element);
        }
        // get the frist queue element
        System.out.println(queue.peek());
        // loop through the elements
        for(Integer element : queue){
            System.out.println(element);
        }
    }
}
