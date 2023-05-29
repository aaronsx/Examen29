package aplicacion.servicios;

import java.io.File;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import java.util.List;
import java.util.Scanner;

import aplicacion.entidades.Paciente;
/**
 * Clase ImpPaciente implementa de IntPaciente para poder realizar los metodos de la aplicacion
 * @author csi22-amunada
 *
 */
public class ImpPaciente implements IntPaciente {

	@Override
	public void InsertarPaceinte(List<Paciente> bd,File archivo) {
		Paciente paci=new Paciente();
		Scanner pregunta=new Scanner(System.in);
		System.out.println("Introduce en nombre del paciente:");
		paci.setNombrePaciente(pregunta.next());
		System.out.println("Introduce el numero de telefono del dueño:");
		paci.setNumeroTelefono(pregunta.next());
		//Te genera la fecha actual en formato dd MM yyyy
		String fecha= DateTimeFormatter.ofPattern("dd MMM yyyy").format(LocalDateTime.now());
		paci.setFechaAlta(fecha);
		paci.setFechaSalida("-");
		//Añadimos al usuario a la lista
		bd.add(paci);
		
	}
	/**
	 * Metodo para preguntar si quiere modificar o no
	 * @param txt
	 * @return
	 */
	private boolean MetodoSiono(String txt) 
	{
		//Preguntar si o si no
		Scanner pregunta=new Scanner(System.in);
		String SioNo;
		boolean repetir=true;
		do {
			System.out.println(txt);
			  SioNo=pregunta.next().toLowerCase();
			  
			  switch(SioNo)
			  {
				  case "si":
					  return true;
				  case "no":
					  return false;
					default:
						System.err.println("***ERROR*** solo se puede si o no.");
						repetir=false;
			  }
			  
		}while(!repetir);
		return true;
		
	}
	@Override
	public void ModificarPaciente(File archivo,List<Paciente> bd) {
		Scanner pregunta=new Scanner(System.in);
		IntFichero fichero=new ImpFichero();
		String NumeroTele;
		//Un metodo que pregunta si quiere al usuario modificar o no 
		if(MetodoSiono("¿Quieres modificar?"))
		{
			System.out.println("Introduce el Numero de telefono del que quieres modificar: ");
			NumeroTele=pregunta.next();
			for(Paciente pacien: bd)
			{
				if(pacien.getNumeroTelefono()==NumeroTele)
				{
					System.out.println("Introduce la fecha del alta");
					//Te genera la fecha actual en formato dd MM yyyy
					String fecha= DateTimeFormatter.ofPattern("dd MMM yyyy").format(LocalDateTime.now());
					pacien.setFechaSalida(fecha);
					System.out.println("La fecha se ha actualizado correctamente a la "+fecha);
				}
			}
		}
		
		fichero.AbrirFicheroEscrito(archivo, bd);
		

	}

}
