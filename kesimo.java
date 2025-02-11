import java.io.*;

public class kesimo {
    public static void main(String[] args) {

        //Arreglo de un máximo de 10000 números
        int[] numeros = new int[10000];
        int count = 0;
        
        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                for (String num : linea.split("\\s+")) {
                    try {
                        numeros[count++] = Integer.parseInt(num);
                    } catch (NumberFormatException e) {
                        System.out.println("Ignorando valor no numérico: " + num);
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
            return;
        }
        
        if (k <= 0 || k > count) {
            System.out.println("El valor de k debe estar entre 1 y " + count);
            return;
        }
        
    }
}
