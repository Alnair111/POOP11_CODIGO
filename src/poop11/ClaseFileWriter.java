/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poop11;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.IOException;
/**
 *
 * @author Alna
 */
public class ClaseFileWriter {
    public static void main(String[] leer) {
        String texto = "";
        try{
            BufferedReader br;
            br = new BufferedReader (new InputStreamReader(System.in));
            System.out.println("Escribir texto: ");
            texto = br.readLine();
            FileWriter fw = new FileWriter ("archivo.txt");
            BufferedWriter bw = new BufferedWriter (fw);
            PrintWriter salida = new PrintWriter(bw);
            salida.println(texto);
            salida.close();
        }catch(IOException ioe){
            System.out.println("\n\nErro al abrir o guardar el archivo:");
            ioe.printStackTrace();
        }catch (Exception e){
            System.out.println("Error al leer el teclado");
            e.printStackTrace();
        }
    }
}
