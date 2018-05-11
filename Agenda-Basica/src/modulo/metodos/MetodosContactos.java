package modulo.metodos;

import java.util.HashMap;

import modulo.POJOs.ContactoM;
import modulo.POJOs.Contactos;

public class MetodosContactos implements ContactoM {
	public static HashMap <Integer, Contactos>Contactos=new HashMap <Integer, Contactos>();
	@Override
	public void AñadirContacto(int numero, String nombre) {
		Contactos contacto=new Contactos(nombre ,numero);
		Contactos.put(numero, contacto);
		
	}

	@Override
	public void EliminarContacto(int numero) {
		Contactos.remove(numero);

		
	}
	
	public void modificarContacto(String nombre, int numero, int numeroAntiguo) {
		Contactos.remove(numeroAntiguo);
		Contactos contacto=new Contactos(nombre ,numero);
		Contactos.put(numero, contacto);
	}
}
