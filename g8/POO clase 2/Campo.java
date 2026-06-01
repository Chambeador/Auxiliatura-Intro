public class Campo{
    //atributos
    private Tropa [][] mat;
    private int fila;
    private int colum;
    public Campo(int cantFila, int cantColum){
        mat = new Tropa[cantFila][cantColum];
        fila = cantFila;
        colum = cantColum;
    }
   
    public boolean agregarTropa(Tropa soldado){
        //true si logra agregar exitosamente
        //false si no lo logra
        int x = soldado.getX();
        int y = soldado.getY();
        mat[x][y] = soldado;
    }
   
    public int getFilas(){
        return fila;
    }
   
    public int getColumnas(){
        return colum;
    }
   
    public Tropa[][] getMat(){
        return mat;
    }
}