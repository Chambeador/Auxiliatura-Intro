public class Clasificador
{
    public static void main(String args[]){
        int ladoA = Lee.leeInt("Ponga el lado A");
        int ladoB = Lee.leeInt("Ponga el lado B");
        int ladoC = Lee.leeInt("Ponga el lado C");
        if(ladoA+ladoB>ladoC && ladoB+ladoC>ladoA && ladoA+ladoC>ladoB){
            if(ladoA == ladoB && ladoA == ladoC && ladoB == ladoC){
                System.out.println("El triangulo es equilatero");
            }else{
                //tenemos dos alternativas que seria
                //triangulo Escaleno e Isoceles
                if(ladoA != ladoB && ladoA != ladoC && ladoB != ladoC){
                    System.out.println("El triangulo es Escaleno");
                }else{
                    System.out.println("El triangulo es Isoceles");
                }
            }
        }else{
            System.out.println("No es un triangulo");
        }
        }
}