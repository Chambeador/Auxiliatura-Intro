public class Tanque extends Tropa{
    private int escudo;
    public Tanque(int vida, Punto coordenada
                , int daño, int municiones){
            super(vida, coordenada, daño, municiones);
            escudo = 100;
    }
   
   
    public String disparar(){
        //dispara en un 3x3
    }
}
