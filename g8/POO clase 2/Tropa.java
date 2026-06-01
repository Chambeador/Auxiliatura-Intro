public class Tropa{
    //atributos
    private int vida;
    private Punto coordenada;
    private int daño;
    private int municiones;
    //constructor
   
    public Tropa(int vida, Punto coordenada,
                int daño, int municiones){
        this.vida = vida;
        this.coordenada = coordenada;
        this.daño = daño;
        this.municiones = municiones;
    }
    //metodos
   
   
    public String moverse(int nx, int ny, Campo campo, Tropa sold){
        String respuesta = "Se logro mover exitosamente";
        int cantF = campo.getFilas();
        int cantC = campo.getColumnas();
        Tropa[][] mat = campo.getMat();
        if(nx < 0 || ny < 0 || nx > cantF || ny > cantC){
            respuesta = "No te lograste mover tu pos, es invalida";
        }else{
            if(mat[nx][ny] != null){
                respuesta = "Posicion ocupada, elige otras coordenadas";
            }else{
                //mover a la tropa a la pos nx, ny
                int xPasado = coordenada.getX();
                int yPasado = coordenada.getY();
                //mover a la nueva posicion
                mat[nx][ny] = sold;
               
                mat[xPasado][yPasado] = null;
            }
        }
       
        return respuesta;
    }
   
    public String disparar(Campo campo){
        //tropa va a disparar en el campo
       
    }
   
   
   
   
   
   
   
   
   
   
   
   
   
}
