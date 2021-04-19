import java.util.Arrays;
import java.util.Scanner;

public class Homework3_6_arrayzero {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 0, 234, 32, 67};
        System.out.println("Array after");
        System.out.println(Arrays.toString(nums));
       for(int i=2;i<nums.length;i++) {
          if (i % 2 == 0) {
           nums[i] = 0;
           }
       }
        System.out.println("Array before");
        System.out.println(Arrays.toString(nums));
    }
}
