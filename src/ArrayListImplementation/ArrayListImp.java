package ArrayListImplementation;

import java.util.ArrayList;
import java.util.List;

public class ArrayListImp {
    public static void  main(String[] args){
        //Decleration Arraylist
        List <Integer> list = new ArrayList<Integer>();
        //Adding elements
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        // Removing elements
        list.remove(2);
        // Accessing elements
        System.out.println(list.get(1));
        //Ubdating elements
        list.set(3,15);
        //Loop through elements
        for (int i :list){
            System.out.println(i);
        }
    }
}
