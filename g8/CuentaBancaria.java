public class CuentaBancaria{
    //atributos
    private int nroCuenta;
    private double monto;
    private double deuda;
    private String nombreDueño;
    private boolean congelada;
    private int ciDueño;
   
    //constructor
   
    public CuentaBancaria(int nro, String nombre, int ci){
        nroCuenta = nro;
        monto = 0.0;
        deuda = 0.0;
        nombreDueño = nombre;
        congelada = false;
        ciDueño = ci;
    }
    //metodos
   
    int getNroCuenta(){
        return nroCuenta;
    }
   
    double getMonto(){
        return monto;
    }
   
    void setNroCuenta(int nroCuentaNuevo){
        nroCuenta = nroCuentaNuevo;
    }
   
    String retirarDinero(double montoR){
        String respuesta = "";
        if(congelada == true){
            respuesta = "Tu cuenta esta congelada";
        }else{
            if(montoR <= 0){
                respuesta = "Monto invalido";
            }else{
                if(montoR > monto){
                    respuesta = "Ponte a chambear";
                }else{
                    respuesta = "Lograste retirar el monto "+montoR;
                    monto = monto - montoR;
                }
            }
        }
        return respuesta;
        //es un metodo la ultima linea es return y solo
        //hay un return por metodo
    }
   
   
    public String depositarDinero(double montoD){
        String respuesta = "";
        if(congelada == true){
            respuesta = "cuenta congelada, no puedes hacer nada";
        }else{
            if(montoD <= 0){
                respuesta = "monto invalido";
            }else{
                respuesta = "lograste depositar "+montoD;
                monto = monto+montoD;
            }
        }
        return respuesta;
    }
   
   
    public boolean congelar() {
        if(congelada == false){
            congelada = true;
        }else{
            //la cuenta ya esta congelada entonces no haces nada
        }
        return congelada;
    }
   
   
   
}