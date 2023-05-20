import java.util.Scanner;
public class conditions {
    public static void main(String[] args) {
        System.out.println("Typical Loop");
        System.out.println("enter a name ");

        // System.out.println("Typical Loop");
        Scanner x = new Scanner(System.in);
        String xs=x.next();
        if (xs.toUpperCase().equals("GASHIE")){ //compares the entered string to GASHIE
            System.out.println("that is  a familiar name"); //return this if comparison is true
        }
        else {
            System.out.println("new name detected"); //if comparison false

        }
        System.out.println("Nested Loop");
        System.out.println("enter your age");

        int xz=x.nextInt();
        if (xz>=18){
            System.out.println("You are an adult");
            System.out.println("What is your dream job");
            String xy;
            xy=x.next();
            System.out.println("Cool ,Your dream job is "+xy);
        } else if (xz<18 && xz>=13) {
            System.out.println("You are in your teens");
            System.out.println("When are you going to College ?");
            int z=x.nextInt();
            System.out.println("Cool,you are going to college in "+z);

        } else if (xz>=1 && xz<13) {
            System.out.println("You are still a child");


        } else {
            System.out.println("That is an invalid age !");

        }


    }
}
