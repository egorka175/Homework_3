import java.util.Scanner;

public class Homework3_1_numbersearch {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 0, 234, 32, 67};
        Scanner s = new Scanner(System.in);

        System.out.println("Введите число: ");
        int numToFind = s.nextInt();
        int i=0;
            int val = nums[i];
            if(val == numToFind){
                System.out.println("Заданное число входит в массив nums");
            }
            else{
                System.out.println("Данное число в массиве не найдено");
            }


    }
}
