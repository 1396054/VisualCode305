import java.util.*;

public class NewClass{
    
    public static void main(String[] args){

        System.out.println("hi");
        ArrayList<Integer> nums = new ArrayList<Integer>(Arrays.asList(2,3,1));
        
        int sum = 0;
        int length = nums.size();
        for(int i=0;i<length;i++){

            sum = nums.get(i) + sum;

        }
        int first = 0;
        int second = 1;
        System.out.println("the sum is " + sum);
        for(int j=0;j<10;j++){
            System.out.println(first);
            first = second;
            second = first + second;
        }
    }

}

