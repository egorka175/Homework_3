public class Homework2_2 {
    public static void main(String[] args){
        int x=0;
        int j=1;
        int i=1;
         while(x<100){
             if(j<=10){
                 x=i*j;
                 System.out.println(i+"x"+j+"="+x);
             j++;}
             else{ i++;
                 j=1;}


         }
    }
}
