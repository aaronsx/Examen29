package aplicacion.servicios;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.List;

import aplicacion.entidades.Paciente;

/**
 *  Interfas tiene los metodos relacionados con el guardado y lectura de fichero.
 * @author csi22-amunada
 *
 */
public interface IntFichero 
{
	/**
	 * Metodo Abrir fichero escrito
	 * @param Un Archivo File y una lista
	 * 
	 */
	public void AbrirFicheroEscrito(File archivo, List<Paciente> bd);
	/**
	 * Metodo Escribir en fichero
	 * @param Un Archivo FileWriter para escribir y una lista
	 * 
	 */
	public void EscribirFichero(FileWriter fichero,File archivo, List<Paciente> bd);

	/**
	 * Metodo Cerrar el fichero escrito
	 * @param Un Archivo FileWriter para cerrar
	 * 
	 */
	public void CerrarFichero(FileWriter fichero);

	/**
	 * Metodo Abrir un fichero para leer
	 * @param Un Archivo FileReader para abrir
	 */
	public void AbrirFicheroLeer(File archivo, List<Paciente> bd);

	/**
	 * Metodo Leer el fichero
	 * @param Un Archivo FileReader para leer
	 * 
	 */
	public void LeerFichero(FileReader fr, List<Paciente> bd);

	/**
	 * Metodo Cerrar el fichero leido
	 * @param Un Archivo FileReader para cerrar
	 * 
	 */
	public void CerrarFicheroLeido(FileReader fr);

	

	/**
	 * Metodo Encabezado del texto
	 * @param Un Archivo File(Direccion del proyecto)
	 *  
	 */
	public void EscirbirEncabezado(File archivo);
}
