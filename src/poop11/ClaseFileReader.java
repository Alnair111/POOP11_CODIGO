/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poop11;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
/**
 *
 * @author Alna
 */
public class ClaseFileReader {
    public static void main(String[] escribir) {
        String texto = "";
        try{
            BufferedReader br;
            FileReader fr = new FileReader("leer.txt");
            br = new BufferedReader (fr);
            System.out.println("El texto contenido en el archivo leer.txt es:");
            texto = br.readLine();
            String linea = br.readLine();
            while (linea != null){
                System.out.println(linea);
                linea = br.readLine();
            }
            
            
            br.close();
        }catch(IOException ioe){
            System.out.println("\n\nErro al abrir o guardar el archivo:");
            ioe.printStackTrace();
        }catch (Exception e){
            System.out.println("Error al leer el teclado");
            e.printStackTrace();
        }
    }
}
