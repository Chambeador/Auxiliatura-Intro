import java.util.Scanner;

public class Juego {

    public static void main(String args[]) {
        Scanner aux = new Scanner(System.in);
        // int numSecreto = (int) (Math.random() * (9999 - 1111 + 1) + 1111);
        int numSecreto = 4589;
        boolean encontrado = false;

        while (!encontrado) {
            System.out.print("Introduce un número: ");
            int numUsuario = aux.nextInt();

            if (numUsuario == numSecreto) {
                encontrado = true;
                System.out.println("Ganaste");
            } else {
                int copiaSecreto = numSecreto;
                int copiaUsuario = numUsuario;
                int cantidadAciertos = 0;

                while (copiaSecreto != 0 && copiaUsuario != 0) {
                    int digitoSecreto = copiaSecreto % 10;
                    int digitoUsuario = copiaUsuario % 10;
                    
                    copiaSecreto = copiaSecreto / 10;
                    copiaUsuario = copiaUsuario / 10;

                    if (digitoSecreto == digitoUsuario) {
                        cantidadAciertos++;
                    }
                }

                int cantSemiAci = 0;
                int posS = 0;
                copiaSecreto = numSecreto; 

                while (copiaSecreto != 0) {
                    int digitoS = copiaSecreto % 10;
                    int copiaUsuarioInterna = numUsuario;
                    int posU = 0;

                    while (copiaUsuarioInterna != 0) {
                        int digitoU = copiaUsuarioInterna % 10;
                        
                        if (posS != posU) { 
                            if (digitoS == digitoU) {
                                cantSemiAci++;
                                break;
                            }
                        }
                        copiaUsuarioInterna = copiaUsuarioInterna / 10;
                        posU++;
                    }
                    copiaSecreto = copiaSecreto / 10;
                    posS++;
                }

                System.out.println("La cantidad de aciertos: " + cantidadAciertos);
                System.out.println("La cantidad de semi-Aciertos: " + cantSemiAci);
            }
        }
    }
}