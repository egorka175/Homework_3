import java.util.Scanner;
import java.util.Arrays;

public class Homework3_2_numberdel {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 234, 2, 7, 6, 2,546, 2};

        Scanner s = new Scanner(System.in);
        System.out.println("Введите число: ");
        int numDeleting = s.nextInt();
        int i = 0;
        int n = 0;
        int j = 0;
        for (; i < array.length; i++) {
            int val = array[i];
            if (val == numDeleting) {
                n++;

            }
        }
        if(n==0) {
            System.out.println("Такого числа в массиве не существует , попробуйте ввести число еще раз.");
        }
        int[] array2 = new int[array.length - n];
        for (int ing=0; ing < array.length; ing++) {
            int val = array[ing];
            if (val != numDeleting) {
                array2[j] = array[ing];
                j++;
            }
        }
        System.out.println("Полученный массив: ");
        System.out.println(Arrays.toString(array2));
    }
    }












