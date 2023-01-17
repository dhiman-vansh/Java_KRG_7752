// package Maping;

import java.util.*;

public class Maping {
    

    
    public static void main(String[] args) {
        HashMap<Integer,String> dic = new HashMap<>();
        dic.put(3, "Vansh");    
        dic.put(1, "Mehul");    
        dic.put(3, "Deepak");
        for (Map.Entry m : dic.entrySet() ) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }

}
