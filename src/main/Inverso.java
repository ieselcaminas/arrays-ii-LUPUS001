import java.util.Arrays;

public class Inverso {
    public static int[] esInverso(int[] array){
        int[] inverso = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            inverso[array.length- i - 1] = array[i];
        }
        return inverso;
    }
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9};
        int[] inverso = esInverso(array);

        System.out.println(Arrays.toString(inverso));

    }
}
