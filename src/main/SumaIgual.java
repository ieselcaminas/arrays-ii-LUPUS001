public class SumaIgual {
    public static String sumaIgual(int [] num, int numUsuario){
        String suma = "";
        for (int i = 0; i < num.length; i++) {
            for (int j = i + 1; j < num.length; j++) {
                if (num[i] + num[j] == numUsuario){
                    suma += "["+ num[i] + " + " + num[j] + "] ";
                }
            }
        }
        return suma;
    }
    public static void main(String[] args) {
        //int numUsuario = 15;
        int numUsuario = Utilidades.leerEntero("Introduce un número");
        int[] num = {2, 5, 12, 6, 7, 10, 6, 3, 8, 4};
        String suma = sumaIgual(num, numUsuario);

        System.out.println(suma);
    }
}

        /*if (sumaIgual(num, numUsuario) == numUsuario){
            System.out.println("Son iguales");
        }*/

        /*int suma = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] % 2 == 0){
                do {
                    suma += num[i];
                } while (suma != numUsuario);
            }
        }*/

