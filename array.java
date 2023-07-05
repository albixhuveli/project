import java.util.Arrays;

public class array {
    public static void main (String[] args) {
        int[] array = new int[6];
        array[0] = 155;
        array[5] = 77;
        System.out.print(array[5]);

        String[] words = new String[3];
        words[0] = "dee";
        System.out.println(Arrays.toString(words));
    }
}