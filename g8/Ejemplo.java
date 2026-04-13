public class Ejemplo 
{
    public static void main(String args[]) {
        int n = Lee.leeInt("Ingrese un numero");
        for (int i = n; i > 0; i--) {
            System.out.print(i + " ");
        }
    }
}