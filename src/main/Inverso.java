import java.util.Arrays;

public class Inverso {
    public static int[] esInverso(int[] array){
        int[] inverso = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            inverso[array.length- i - 1] = array[i];
            //array.length = 9
            // i [primera iteración]= 0
            // - 1
            // 9 - 0 - 1 = 8, el que esta en la posicion 8 sería 9, luego en la siguiente iteración
            //será 8 ya que está en la posición 7 y como hemos llegado a esto?
            //array.length = 9
            // i [segunda iteración]= 1
            // - 1
            // 9 - 1 - 1 = 7  | y así es como hemos llegado, y asi sucesivamente hasta llegar al 0
            /*La primera iteración sería lo mismo que poner inverso[8] = array[0]*/
        }
        return inverso;
    }
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9};
        int[] inverso = esInverso(array);

        System.out.println(Arrays.toString(inverso));

    }
}
