import java.util.Arrays;

public class arrays_loops extends whike_loops {//means arrays_loops inherits all methods of while_loops
    //this is called inheritance
    public static void main(String[]args){
        //basic array
        int [] nums=new int[3];
        nums[0]=2;
        nums[1]=6;
        nums[2]=8;
        System.out.println(nums[0] +nums[1] +nums[2]); //addition lol
        //sorting in arrays
        Arrays.sort(nums,0,7);

        String [] fruits={"banana","apple","pears","orange","banana"};//another way of implementing an array
        System.out.println(fruits[0]);
        System.out.println(fruits[1]);
        System.out.println(fruits[2]);

        //for loop
        System.out.println("this will be a pattern");
        for (int i=0;i< fruits.length;i++){
            int j = i * 'x';
           // System.out.println(fruits[i]);
            if (fruits[i].toUpperCase().equals("BANANA")){
                System.out.println("Banana found at index position : "+i);
            }

        }
        //alternative solution
        int count=0;
        for (int element:nums){
            System.out.println(element +" "+count);
            count++;
        }
    }
}
