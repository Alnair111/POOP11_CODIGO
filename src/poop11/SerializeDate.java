/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poop11;

/**
 *
 * @author Alna
 */
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Date;

public class SerializeDate {

	SerializeDate() {
		Date d = new Date ();
		System.out.println(d);
		try {
			FileOutputStream f = new FileOutputStream ("date.ser");
			ObjectOutputStream s = new ObjectOutputStream (f);
			s.writeObject (d);
			s.close ();
		} catch (IOException e) {
			e.printStackTrace ();
		}
	}
	public static void main (String args[]) {
		new SerializeDate();
	}
}