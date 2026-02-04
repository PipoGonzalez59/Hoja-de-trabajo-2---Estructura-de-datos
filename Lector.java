import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Lector {
    String nombreArchivo;
    FileReader archivo;
    BufferedReader lector;

    public void leerArchivo(String nombreArchivo){
        try{
            archivo = new FileReader(nombreArchivo); 
            lector = new BufferedReader(archivo);
            String cadena;
            while((cadena = lector.readLine()) != null){
                System.out.println(cadena);
                }
        } catch(Exception e){
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}