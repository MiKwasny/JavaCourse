package JavaCourse_Section_12_Maps;

import java.util.HashMap;
import java.util.Map;

public class MapClass {
    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();
        if(map.containsKey("Java")){
            System.out.println("java here");
        }else{
            map.put("Java", "A compiled high level language");
            System.out.println("java added");
        }

        map.put("Python", "something more");
        map.put("Algol", "algoritm language");
        map.put("Basic", "for begginers");
        System.out.println(map.put("Lisp", "madnes!"));

        //If it was put before it will be visible now as it was before
        System.out.println(map.put("Java", "A compiled high level language"));

        map.get("Lisp");

        System.out.println(map.get("Lisp"));

        map.put("Lisp", "lolex in this place");

        System.out.println(map.get("Lisp"));

        //map.remove("Lisp");

        if(map.containsKey("Java")){
            System.out.println("java here!");
        }else{
            System.out.println("this is not about java");
        }

        System.out.println("===========================================================");

        //It is printing value before replace
        if(map.replace("Lisp","lolex in this place", "replaced text")){
            System.out.println("Lisp replaced!!!!!!!!!!!!!!!!!!");
        }else{
            System.out.println("Lisp was not replaced!!!!!!");
        }
        //it is printing null because we had not previous key/value
        System.out.println(map.replace("Basic69", "this will not be added"));

        for(String key:map.keySet()){
            System.out.println(key +" "+map.get(key));

        }

        if(map.remove("Python", "something better")){
            System.out.println("Python removed");
        }else{
            System.out.println("Python value/pair not found");
        }


    }
}
