import java.util.*;

public class Game{
    
    public static void main(String[] args){

        System.out.println("hi");
        ArrayList<Integer> nums = new ArrayList<Integer>();
        nums.add(2);
        nums.add(3);
        nums.add(1);
        int sum = 0;
         int length = nums.size();
        for(int i=0;i<length;i++){

            sum = nums.get(i) + sum;

        }
        System.out.println(sum);

    }

}

