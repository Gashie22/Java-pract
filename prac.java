import java.util.Scanner;
//BASIC CALCULATOR
public class prac {
    public static void main(String[] args) {
        System.out.println("Hi this is my first Java Prog");
        System.out.println("Basic Calculator");

        int total;
        double avg ;
        System.out.println("enter first number :");
        Scanner sc = new Scanner(System.in);
        String scanned =sc.next();
        int num1=Integer.parseInt(scanned);
        System.out.println("You entered: "+num1);

        System.out.println("enter second number :");
        Scanner rp = new Scanner(System.in);
        String scanned2 =rp.next();
        int num2=Integer.parseInt(scanned2);
        System.out.println("You entered: "+num2);


        total=num1 + num2;
        avg = total/2 ;
        System.out.println("\n");
        System.out.println("the total of " +num1 +" and " + num2 +" is : "+total);
        System.out.println("the average of " +num1 +" and " + num2 +" is : "+avg);



    }
}

