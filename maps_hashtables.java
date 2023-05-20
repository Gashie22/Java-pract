import java.util.HashMap;
import java.util.Map;

public class maps_hashtables {
    public static void main(String[]args){
        //python version of dictionaries

        //Creating a harsh map
        Map m = new HashMap();
        //creating value pairs
        m.put("Gashie",3.2);
        m.put("Andy",2.2);
        m.put("Cole",3.2);
        System.out.println(m);
        System.out.println(m.containsValue("2.2"));
        System.out.println(m.containsKey("Andy"));
        System.out.println(m.isEmpty());

        m.put("Gashie",2.1);//overwrites the previous value pair of Gashie

        System.out.println(m);
        System.out.println(m.get("Andy"));

        //another class
        new_class2 xs =new new_class2("Gashie",23,"Rice");
        xs.sentence();
    }

    }
