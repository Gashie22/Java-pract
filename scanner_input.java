import java.util.Scanner;  //module for allowing input
public class scanner_input {
    public static void main(String[] args) {
        Scanner names= new Scanner(System.in);//command for allowing inuput
        String name1= names.next();//making the input to be stored in a name1 variable

        //System.out.println(name1);
        System.out.println("You wrote "+ name1.toUpperCase()); // use + for concatinating


    }
}
