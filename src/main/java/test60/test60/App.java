package test60.test60;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
    
    public static boolean esPalindromo(String texto) {

        texto = texto.toLowerCase();
        texto = texto.replace(" ", "");

        int izquierda = 0;
        int derecha = texto.length() - 1;

        while (izquierda < derecha) {

            if (texto.charAt(izquierda) != texto.charAt(derecha)) {
                return false;
            }

            izquierda++;
            derecha--;
        }

        return true;
    }
    
    
}
