package modulo.metodos;

import modulo.POJOs.ContactoM;
import modulo.POJOs.Grupos;

public class MetodosGrupo implements ContactoM{
	
	public void a�adirGrupo(String nombre) {
		Grupos grupo=new Grupos(nombre);
		Grupos.ListadoContactos.put(nombre, grupo);
	}
	public void eliminarGrupo(String nombre) {
		Grupos.ListadoContactos.remove(nombre);
	}
	public void modificarGrupo(String nombre, String nombreAntiguo) {
		
	}
	@Override
	public void A�adirContacto(int numero, String nombre) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void EliminarContacto(int numero) {
		// TODO Auto-generated method stub
		
	}
}
