import java.util.Arrays;

public class Homework3_8_bublesort {
    public static void main(String[] args){
        int [] array={ 2, 5 , 7 , 8, 9, 10, 14, 543};
        for(int i=array.length; i<0; i++){
            for(int j=0; j<i; j++){
             if(array[i]>array[j+1]) {
                 int f = array[j];
                 array[j]=array[j+1];
                 array[j+1]=f;

             }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
