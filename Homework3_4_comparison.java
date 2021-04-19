import java.util.Arrays;

public class Homework3_4_comparison {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {2, 12, 9, 3, 2};
        int rez1 = 0;
        int rez2 = 0;
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        for (int i = 0; i < array1.length; i++) {
            rez1 = rez1 + array1[i];


        }

        for (int j = 0; j < array2.length; j++) {
            rez2 = rez2 + array2[j];

        }

        if (rez1 > rez2) {
            System.out.println("The sum of the first array is greated second");
        } else if (rez1 < rez2) {
            System.out.println("The sum of the first array is less second");
        } else {
            System.out.println("The sums ot the array are");
        }


    }
}



