/**
 * Versión 5 y en revisión, 5/9/24
 * Lic. Carlos Manzur Soria
 * Docente Facultad de Ciencias y Tecnología
UMSS
 *
 * Clase diseñada para facilitar el aprendizaje de la programación de Java en cursos iniciales,
 * dando la posibilidad de usarla en cursos más avanzados
 *
 * La clase Lee está diseñada para facilitar la captura de datos desde el teclado en Java,
 * permitiendo a los estudiantes interactuar con diferentes tipos de datos de manera simple.
 * Aquí te dejo una descripción clara para que los estudiantes principiantes puedan entender cómo usarla:
 *
 * Método leeString: Captura una cadena de texto (String).
 *
 * Métodos para números: Captura diferentes tipos de números, como byte, int, long, float, y double.
 * Si el usuario ingresa un valor no válido, el programa muestra un mensaje de error y devuelve un valor
 * predeterminado (generalmente 0).
 *
 * Manejo de errores: Cada método intenta convertir la entrada del usuario al tipo de dato adecuado.
 * Si la entrada no es válida (por ejemplo, si se intenta ingresar una palabra en lugar de un número),
 * el programa muestra un mensaje de error y devuelve un valor predeterminado.
 *
 * Captura de booleanos y caracteres: También puedes capturar valores booleanos (true o false) y caracteres individuales.
 *
 * Cierre del escáner: Es recomendable usar el método closeLee() al final del programa para liberar los recursos del escáner
 * utilizado para capturar las entradas.
*/

import java.util.Scanner;
public class Lee
{  private static final Scanner input = new Scanner(System.in);
   
    public static String leeString(String msn) {
       System.out.print(msn+" ?");
     return input.nextLine();
    }
   
    public static void closeLee() { input.close(); }
   
    public static byte leeByte() {
      try {return Byte.parseByte(leeString(""));
           } catch (NumberFormatException e) {
                System.out.println("Error: Entrada no es un byte válido.");
                return 0;
                }
       }

    public static byte leeByte(String msn) {
      try {return Byte.parseByte(leeString(msn));
           } catch (NumberFormatException e) {
                System.out.println("Error: Entrada no es un byte válido.");
                return 0;
                }
       }
       
    public static int leeInt() {
        try {  return Integer.parseInt(leeString(""));
            }catch (NumberFormatException e) {
               System.out.println("Error: Entrada no es un int válido.");
               return 0;
            }
    }
   
     public static int leeInt(String msn) {
        try {  return Integer.parseInt(leeString(msn));
            } catch (NumberFormatException e) {
                System.out.println("Error: Entrada no es un int válido.");
                return 0;
            }
    }
   
   
     public static long leeLong() {
        try {  return Long.parseLong(leeString(""));
            } catch (NumberFormatException e) {
                 System.out.println("Error: Entrada no es un long válido.");
                 return 0;
             }
    }
   
    public static long leeLong(String msn) {
        try { return Long.parseLong(leeString(msn));
            } catch (NumberFormatException e) {
                System.out.println("Error: Entrada no es un long válido.");
                return 0;
            }
    }
       
    public static float leeFloat() {
        try {  return Float.parseFloat(leeString(""));
            } catch (NumberFormatException e) {
                System.out.println("Error: Entrada no es un float válido.");
                return 0;
              }
    }

    public static float leeFloat(String msn) {
        try {  return Float.parseFloat(leeString(msn));
            } catch (NumberFormatException e) {
                System.out.println("Error: Entrada no es un float válido.");
                return 0;
            }
    }
   
    public static double leeDouble() {
        try { return Double.parseDouble(leeString(""));
            } catch (NumberFormatException e) {
                System.out.println("Error: Entrada no es un double válido.");
                return 0;
            }
    }
   
    public static double leeDouble(String msn) {
        try { return Double.parseDouble(leeString(msn));
            } catch (NumberFormatException e) {
                System.out.println("Error: Entrada no es un double válido.");
                return 0;
           }
    }
       
    public static boolean leeBoolean() {
        try { return Boolean.parseBoolean(leeString(""));
            } catch (Exception e) {
                System.out.println("Error: Entrada no es un boolean válido.");
                return false;
            }
    }
   
    public static boolean leeBoolean(String msn) {
        try { return Boolean.parseBoolean(leeString(msn));
            } catch (Exception e) {
                System.out.println("Error: Entrada no es un boolean válido.");
                return false;
            }
    }
   
    public static char leeChar() {
        try { return leeString("").charAt(0);
            } catch (Exception e) {
                System.out.println("Error: Entrada no es un char válido.");
                return '0';
            }
    }
   
    public static char leeChar(String msn) {
        try {  return leeString(msn).charAt(0);
            } catch (Exception e) {
                System.out.println("Error: Entrada no es un char válido.");
                return '0';
        }
    }
}