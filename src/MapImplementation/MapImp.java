package MapImplementation;

import java.util.HashMap;
import java.util.Map;

public class MapImp {
    public static void main(String[] args){
        Map<String,Integer> mymap = new HashMap<String,Integer>();
        // Adding Elemnts to map
        mymap.put("elemnt",15);
        mymap.put("another",20);
        mymap.put("third",25);
        mymap.put("fourth",30);
        // Retrieving element by key
        System.out.println(mymap.get("third"));
        // Removing element by key
        mymap.remove("third");
        //Updating element by key
        mymap.put("another",500);
        // loop through elements
        for(Map.Entry<String,Integer> elem : mymap.entrySet()){
            System.out.println(elem);

        }

    }
}
