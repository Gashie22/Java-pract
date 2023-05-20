import java.util.Scanner;

public class obects_ {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        names();
        sequence(2);
        
    }

    //creating void methods
    public static void names(){ //void means that the function will not return anything
        System.out.println("my first method");
    }

    public static void sequence (int x){
        Scanner sc =new Scanner(System.in);
        int nums = sc.nextInt();

        for (int i=1;i<4;i++){
            System.out.println(x);
            x++;
            System.out.println("you entered: "+nums);
            nums++;
            System.out.println("count now on: "+i);
        }
    }

    //method which return something
    public static int add2(int x,int y){
        int r1=x+y;
        return r1;
    }
}
