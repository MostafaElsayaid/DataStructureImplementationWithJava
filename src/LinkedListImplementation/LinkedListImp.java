package LinkedListImplementation;

import java.util.LinkedList;

public class LinkedListImp {
    public static void  main(String[] args){
        // Create a linked list
        LinkedList <String> list = new LinkedList <String> ();
        //Adding Elements at the end
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        //Adding Elements at specified positions
        list.add(0,"j");
        list.add(1,"q");
        //Remove Elements form the list
        list.remove("a");
        list.remove(0);
        //update the list
        list.set(1, "p");
        //Access the list element
        list.get(2);
        //loop throw the list elements
        for(String s : list){
            System.out.println(s);
        }


    }
}
