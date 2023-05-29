package aplicacion.servicios;

/**
 * Clase implementa de la interfaz InstUtilsMenu para utilar el menu
 * @author csi22-amunada
 *
 */

public class ImpUtilsMenu implements IntUtilsMenu {

	@Override
	public void Menu() {
		
			System.out.println("<-----------Menu------------->");
			System.out.println("1. Leer Paciente");
			System.out.println("2. Añadir Paciente");
			System.out.println("3. Modificar paciente");
			System.out.println("0. Salir");
		
	}

}
