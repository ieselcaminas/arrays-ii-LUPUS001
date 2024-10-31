public class Iguales {
    public static boolean sonIguales(int [] array, int [] arrayClone){
        boolean esIgual = false;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == arrayClone[j]){
                    esIgual = true;
                }
            }
        }
        return esIgual;
    }
    public static void main(String[] args) {
        int [] array = {12, 34, 2, 8};
        int [] arrayClone = array.clone();

        boolean esIgual = sonIguales(array, arrayClone);
    }
}
