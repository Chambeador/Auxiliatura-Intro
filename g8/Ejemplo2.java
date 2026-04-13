public class Ejemplo2 
{
    public static void main(String args[]) {
        int n = Lee.leeInt("Ingrese un numero");
        while (n != 1) {
            // hacemos el proceso
            System.out.print(n + " ");
            if (n % 2 == 0) {
                // el numero n es par
                n = n / 2;
            } else {
                // el numero es impar
                n = n * 3 + 1;
            }
        }
        System.out.print(n + " ");
    }
}