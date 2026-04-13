import java.util.Scanner;

public class Iguales {
    public static void main(String args[]) {
        Scanner aux = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        int num1 = aux.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int num2 = aux.nextInt();
        while (num1 != 0) {
            int digito = num1 % 10;
            num1 = num1 / 10;
            int copiaNum2 = num2;
            boolean encontrado = false;
            while (copiaNum2 != 0 && !encontrado) {
                int digitoNum2 = copiaNum2 % 10;
                copiaNum2 = copiaNum2 / 10;
                if (digito == digitoNum2) {
                    encontrado = true;
                }
            }

            if (encontrado == false) {
                System.out.println("Los digitos no son iguales");
                break;
            }
            
        }    
        if (num1 == 0) {
            System.out.println("Los digitos son iguales");
        }
    }
}