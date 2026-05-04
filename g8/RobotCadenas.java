public class RobotCadenas{
   
    public String unirCadenas(String s, String t){
        String respuesta = s + t;
        return respuesta;
    }
   
   
    public  char caracterPosicion(String s, int posicion){
            char respuesta = s.charAt(posicion);
            return respuesta;
    }
   
    public boolean esVocal(char c){
        boolean respuesta = false;
        if( c== 'a') respuesta = true;
        if( c== 'e') respuesta = true;
        if( c== 'i') respuesta = true;
        if( c== 'o') respuesta = true;
        if( c== 'u') respuesta = true;
       
        return respuesta;
    }
   
    public int contarVocales(String s){
        int contador = 0;
        for(int i = 0; i < s.length(); i++){
            char caracter = s.charAt(i);
            if(esVocal(caracter) == true){
                contador++;
            }
        }
        return contador;
    }
   
   
    public boolean esPalindroma(String s){
         boolean esPal = true;
         
         int j = s.length()-1;
         for(int i = 0; i < s.length()/2; i++){
             if(s.charAt(i) != s.charAt(j)){
                 esPal = false;
             }
             j--;
         }
         return esPal;
    }
   
   
     public boolean esPalindroma2(String s){
         boolean esPal = true;
         int i = 0;
         int j = s.length()-1;
         while(i <= j){
             if(s.charAt(i) != s.charAt(j)){
                 esPal = false;    
             }    
             i++;
             j--;
         }
         return esPal;
    }
   
   
   
   
   
   
}