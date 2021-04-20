import java.util.Arrays;
import java.util.Scanner;

public class Homework3_5_oddarray {
    public static void main(String[] args){

        Scanner s = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int arrayLength = s.nextInt();
        if(5<arrayLength && arrayLength<=10 ) {
            double[] randomArray = new double[arrayLength];
           int lengthArray2=0;
            for (int i = 0; i < arrayLength; i++) {
                randomArray[i] = Math.random();

            }
            System.out.println("Первоначальный массив");
            System.out.println(Arrays.toString(randomArray));

            for(int i=2;i<randomArray.length;i++) {
                if (i % 2 == 0) {
                    lengthArray2++;
                }
            }
            double[] randomArray2 = new double[lengthArray2];
            int j=0;
for(int i=2;i<randomArray.length;i++){
    if(i%2==0){
        randomArray2[j]=randomArray[i];
        j++;
    }
}
            System.out.println("Массив из четных индексов 1-го массива");
            System.out.println(Arrays.toString(randomArray2));
        }
            else {
                System.out.println("Вы ввели невырный размер массива входящий в промежуток (5,10].Попробуйте еще раз");
            }


    }
}
