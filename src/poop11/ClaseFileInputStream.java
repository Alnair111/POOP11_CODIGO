/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poop11;
import java.io.FileInputStream;
import java.io.IOException;
/**
 *
 * @author Alna
 */
public class ClaseFileInputStream {
    public static void main(String[] args) {
        FileInputStream fis = null;
        byte [] buffer = new byte [81];
        int nbytes;
        try{
            fis = new FileInputStream("leer.txt");
            nbytes = fis.read(buffer,0,81);
            String texto = new String (buffer,0,nbytes);
            System.out.println(texto);
        }catch(IOException ioe){
            System.out.println("Error: " + ioe.toString());
        }finally {
            try{
            if (fis != null) fis.close();
        } catch(IOException ioe){
                System.out.println("Error al cerrar el archivo");
                }
        }
    }
}
