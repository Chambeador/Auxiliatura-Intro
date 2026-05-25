public class Arma{
    private String nombre;
    private int cantBalas;
    private Bala bala;
    public Arma(String nombre, int cantBalas, Bala bala){
        this.nombre = nombre;
        this.cantBalas = cantBalas;
        this.bala = bala;
    }
   
    public String disparar(Persona objetivo){
        int vidaAnterior = objetivo.getVida();
        //aqui le disparamos
        objetivo.recibirDisparo(bala);
       
        cantBalas--;
       
        int vidaActual = objetivo.getVida();
        String respuesta = "";
        respuesta = "Tu objetivo tenia "+vidaAnterior+" esa vida antes del disparo"+
                    " y ahora su vida es "+vidaActual;
        return respuesta;
    }
   
    public int getCantBalas(){
        return cantBalas;
    }
}


