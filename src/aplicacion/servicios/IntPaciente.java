package aplicacion.servicios;

import java.io.File;
import java.util.List;

import aplicacion.entidades.Paciente;

/**
 *  Interfas tiene los metodos relacionados con la aplicacion.
 * @author csi22-amunada
 *
 */
public interface IntPaciente {
	/**
	 * Metodo para poder insertar un paciente en la base de datos
	 * @param bd
	 */
	public void InsertarPaceinte(List<Paciente> bd,File archivo);
	/**
	 * Metodo para poder modificar un paciente de la base de datos y guardarlo en fichero
	 * @param bd
	 */
	public void ModificarPaciente(File archivo,List<Paciente> bd);
}
