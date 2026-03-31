public class Kiosko{
    public static void main(String args[]){
        int precioA = Lee.leeInt("Ingresa el valor del alfajor");
        int montoB  = Lee.leeInt("Ingresa el dinero de dario");
        int precioC = Lee.leeInt("Ingresa el precio del caramelo");
       
        int cambio = montoB - precioA;
        if(precioA > montoB){
            //controlar te cuesta mas de lo que tienes
        }
        if(cambio%precioC == 0){
            System.out.println("Cambio exacto en caramelos");
        }else{
            System.out.println("no es Exacto");
        }
    }
}