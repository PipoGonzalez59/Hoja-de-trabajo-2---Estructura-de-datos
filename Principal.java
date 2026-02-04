import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la ubicacion del archivo de texto:");
        String ruta = sc.nextLine(); //porfavor pongan la ruta exacta del archivo de texto

        try {
            BufferedReader lector = new BufferedReader(new FileReader(ruta));

            Stack<Integer> pila = new StackArrayList<>();
             Calculadora calculadora = new Calculadora(pila);

            String linea;

            while ((linea = lector.readLine()) != null) {
                int resultado = calculadora.Operate(linea);
                System.out.println("Resultado: " + resultado);
            }

            lector.close();

        } catch (Exception e) {
            System.out.println("Error al leer el archivo o al calcular");
        }
    }
}
