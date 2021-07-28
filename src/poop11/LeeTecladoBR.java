/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poop11;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
/**
 *
 * @author Alna
 */

public class LeeTecladoBR {
    public static void main (String [] args) {
    try {
        String texto = "";
        BufferedReader br;
        br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Escribir el texto deseado:");
        texto = br.readLine();
        System.out.println("El texto escrito fue: " + texto);
    } catch (IOException ioe){
        System.out.println("Error al leer caracteres: \n" + ioe);
    }
  }
}
