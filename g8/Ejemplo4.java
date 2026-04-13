public class Ejemplo4 
{
    public static void main(String args[]) {
        int n = Lee.leeInt("Ingrese un numero");
        int [] arreglo = new int[n];
        
        // llenar el arreglo
        for (int i = 0; i < n; i++) {
            int valor = Lee.leeInt("Ingrese un valor");
            arreglo[i] = valor;
        }
        
        int maximo = arreglo[0];
        for (int i = 0; i < n; i++) {
            int valor = arreglo[i];
            maximo = Math.max(maximo, valor);
        }
        
        System.out.println("Tu maximo es " + maximo);
    }
}