public class Persona{
    //atributo
    private String nombre;
    private int vida;
    private Arma arma;
    //constructor
   
    public Persona(String nombre, Arma arma){
        vida = 100;
        this.nombre = nombre;
        this.arma = arma;
    }
    //metodos
    public boolean estoyVivo(){
        return vida > 0;
    }
   
    public String disparar(Persona objetivo){
        String respuesta = "";
        if(estoyVivo()){
            //estas vivo puedes disparar
            if(objetivo.estoyVivo() == false){
                respuesta = "Tu objetivo esta muerto, ya no puedes disparar";
            }else{
                int cantidad = arma.getCantBalas();
                if(cantidad > 0){
                    //aun tienes balas
                    respuesta = arma.disparar(objetivo);
                }else{
                     respuesta = "No tienes balas";  
                }
            }
        }else{
            respuesta = "Estas muerto";
        }
        return respuesta;
    }
   
   
    public void recibirDisparo(Bala bala){
        int dañoBala = bala.getDaño();
        vida-=dañoBala;
    }
   

    public int getVida(){
        return vida;
    }
   
   
   
   
   
}