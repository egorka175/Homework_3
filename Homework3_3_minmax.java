import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.lang.Math;

import static java.lang.reflect.Array.*;

public class Homework3_3_minmax {
    public static void main(String[] args){

        Scanner s = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int number = s.nextInt();
        double[] randomArray = new double[number];
        for(int i=0; i<number;i++) {
            randomArray[i] = Math.random();
        }
        System.out.println("Полученный массив");
        System.out.println(Arrays.toString(randomArray));
        Arrays.sort(randomArray);

        int left=0;
        int right=randomArray.length-1;
        int i=left+(left+right)/2;
        System.out.println("Minimal number: "+randomArray[left]);
        System.out.println("Maximum number: "+randomArray[right]);
        System.out.println("Mid number: "+randomArray[i]);

    }
}
