package modulo.metodos;

import java.util.HashMap;
import modulo.POJOs.Grupos;

public class MetodosGrupo {
	public static HashMap<String, Grupos> TodosLosGrupos = new HashMap<String, Grupos>();

	public void anadirGrupo(String nombre) {
		Grupos grupo = new Grupos(nombre);
		TodosLosGrupos.put(nombre, grupo);
	}

	public void eliminarGrupo(String nombre) {
		TodosLosGrupos.remove(nombre);
	}

	public void modificarGrupo(String nombre, String nombreAntiguo) {
		TodosLosGrupos.remove(nombreAntiguo);
		Grupos grupo = new Grupos(nombre);
		TodosLosGrupos.put(nombre, grupo);
	}

	// Añadir Contactos a grupos
	public void AnadirContacto(int numero, String nombre, String nombreGrupo) {
		TodosLosGrupos.get(nombreGrupo).Participantes.put(numero, Grupos.Participantes.get(nombre));

	}

	// Eliminar Contactos a grupos
	public void EliminarContacto(int numero, String nombreGrupo) {
		TodosLosGrupos.get(nombreGrupo).Participantes.remove(numero);
	}
}
