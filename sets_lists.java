import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class sets_lists {
    public static void main(String[]args){
        //creating a simple set
        System.out.println("this is a set");

        Set<Integer> t=new HashSet<>(); //new set created called t
        //adding elements
        t.add(5);
        t.add(3);
        t.add(7);
        t.add(10);
        System.out.println(t);
        boolean x=t.contains(7);
        boolean y=t.contains(12);
        System.out.println("is 7 in the list T: "+x);
        System.out.println(t.size());
        t.remove(5);
        System.out.println(t);

        //creating a simple list
        ArrayList<Integer>t2=new ArrayList<>(); //index starts at 0
        t2.add(6);
        t2.get(0);
        t2.add(10);
        t2.add(9);
        t2.set(1,5); //setting 5 at index 1
        t2.subList(1,2);//get elements from index 1 to index 2
        System.out.println("this is now a List");
        System.out.println(t2);








    }

    }
