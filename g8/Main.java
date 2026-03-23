import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ayudante = new Scanner(System.in);
        System.out.println("Ingrese el radio porfavor:");
        double radio = ayudante.nextDouble();
        double pi = 3.1416;
        double areaCirculo = pi * radio * radio;
        double areaCuadrado = 2*radio * radio;
        double areaSobrante = areaCirculo - areaCuadrado;
        System.out.println("El area sobrante es: ");
        System.out.println(areaSobrante);
        
    }
}