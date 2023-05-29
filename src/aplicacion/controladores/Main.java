package aplicacion.controladores;

import java.io.File;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import aplicacion.entidades.Paciente;
import aplicacion.servicios.ImpFichero;
import aplicacion.servicios.ImpPaciente;
import aplicacion.servicios.ImpUtilsMenu;
import aplicacion.servicios.IntFichero;
import aplicacion.servicios.IntPaciente;
import aplicacion.servicios.IntUtilsMenu;

/**
 * Clase Main tiene la interfaz con el usuario 
 * @author csi22-amunada
 *
 */
public class Main {

	public static void main(String[] args) {
		IntUtilsMenu menu=new ImpUtilsMenu();
		IntPaciente pacien=new ImpPaciente();
		IntFichero fichero=new ImpFichero();
		List<Paciente> bd=new ArrayList<>();
		
		Boolean cerrarMenu = false; 
		File archivo = new File ("C:\\Users\\csi22-amunada\\Desktop\\Paciente.txt");
		
		 int opcion=0;
	
		
		
				while(!cerrarMenu) 
				{	
					try {
						 Scanner preguntar=new Scanner(System.in);
						//Mostramos el menú
						menu.Menu();
						System.out.println("Introduza la opción deseada: ");
						opcion = preguntar.nextInt();
						if(opcion>=0 && opcion<=2)
						{
							System.out.println("[INFO] - Has seleccionado la opcion " + opcion);
						}
						switch (opcion) 
						{			
							case 1:
								fichero.AbrirFicheroLeer(archivo,bd);
								
								break;
							
							case 2:
								pacien.InsertarPaceinte(bd,archivo);
								
								break;
							case 3:
								pacien.ModificarPaciente(archivo, bd);
								
								break;
							
							case 0:
									System.out.println("Gracias por visitar la aplicacion");
								cerrarMenu = true;
								break;
							default:
								System.err.println("Solo se puede del 0 al 3");
						}
				}catch(InputMismatchException e) {
					System.err.println("***ERROR***No has introducido un entero");
				}
				catch(NullPointerException e) {
					System.err.println("***ERROR***No lo puedes dejar nuelo");
				}
				catch(Exception e) {
					System.err.println("***ERROR***Se ha surgido otro error");

				 }
					
				}

	}

}
