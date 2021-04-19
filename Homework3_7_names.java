import java.util.Arrays;

public class Homework3_7_names {
    public static void main(String[] args) {
        String[] nums = {"Dima", "Oleg", "Nikita", "Artem", "Egor"};
        System.out.println("Array after");
        System.out.println(Arrays.toString(nums));
        Arrays.sort(nums);

        System.out.println("Array before");
        System.out.println(Arrays.toString(nums));
    }
}
