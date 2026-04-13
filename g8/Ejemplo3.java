public class Ejemplo3 
{
    public static void main(String args[]) {
        int n = Lee.leeInt("Ingrese un numero");
        int primero = 0;
        int segundo = 1;
        
        if (n == 1) {
            System.out.println(0);
        } else {
            for (int i = 3; i <= n; i++) {
                int siguiente = primero + segundo;
                primero = segundo;
                segundo = siguiente;
            }
            System.out.println(segundo);
        }
    }
}