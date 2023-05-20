import java.util.Scanner;
public class whike_loops {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a new number");

        int x= sc.nextInt();
        int count=0;
        while (x != 10){
            System.out.println("enter a new number");
            x= sc.nextInt();
            count++;

        }
        System.out.println("You entered the correct number");

        do {
            System.out.println("your first chance");
            int y= sc.nextInt();
        }while (x==5);
    }
}
