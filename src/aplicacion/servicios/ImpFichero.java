package aplicacion.servicios;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import aplicacion.entidades.Paciente;
/**
 * Clase que viene de la interfaz de fichero guarda o leer la informcacion que le pasas del paciente
 * @author csi22-amunada
 *
 */

public class ImpFichero implements IntFichero {

	@Override
	public void AbrirFicheroEscrito(File archivo, List<Paciente> bd) 
	{
		FileWriter fichero=null;
		EscirbirEncabezado(archivo);
        try
        {
        	//Te permite sobrescribir(por el true)
        	fichero = new FileWriter(archivo);


        } catch (Exception e) {
        	System.err.println("***ERROR***No se pudo abrir el fichero.");
        } 
        EscribirFichero(fichero,archivo,bd);
	}

	

	@Override
	public void EscribirFichero(FileWriter fichero,File archivo, List<Paciente> bd) 
	{
		
		
		 try
	        {
			 	//Es el que escribe en las lineas
	        	PrintWriter pw= new PrintWriter(fichero);
	        	EscirbirEncabezado(archivo);
	        	for(Paciente paci : bd)
	        	{
	        		pw.println(paci.getNombrePaciente()+";"+paci.getNumeroTelefono()+";"+paci.getFechaAlta()+";"+paci.getFechaSalida()+";");
	        	}
	        	
	                
	        	
	        } catch (Exception e) {
	        	System.err.println("***ERROR***No se pudo escribir en el fichero.");
	        } finally {
	        	CerrarFichero(fichero);
	        }

	}

	@Override
	public void CerrarFichero(FileWriter fichero) 
	{
		try {
	           
	           if (null != fichero)
	              fichero.close();
	           
	        }catch (Exception e2){
	        	   System.err.println("***ERROR***No se pudo cerrar el fichero.");
	            }

	}

	@Override
	public void AbrirFicheroLeer(File archivo, List<Paciente> bd) 
	{
		FileReader fr = null;
		
		try {
				//Te abre el archivo
				fr = new FileReader (archivo);
				LeerFichero(fr,bd);
			
			}catch(Exception e){
				System.err.println("***ERROR***No se pudo abrir el fichero.");
	      }

	}

	@Override
	public void LeerFichero(FileReader fr, List<Paciente> bd) 
	{
		 BufferedReader br = null;
	
			try {
				//Recorre linea por linea
				 br = new BufferedReader(fr);
				byte contador=0;
				 String linea;
		         while((linea=br.readLine())!=null)
		         {	
		        	 
		        	 String [] vCampos;
			 		vCampos=linea.split(";");
			 		//Se salta el encabezado
				 		if(contador!=0)
				 		{
				 			Paciente pro=new Paciente(vCampos[0],vCampos[1],vCampos[2],vCampos[3]) ;
				 			bd.add(pro);
				 		}else
				 			contador++;
				 		
			 			
			 		}
		        
			 			
			 		
					
		         } catch(Exception e){
						System.err.println("***ERROR***Se ha producido un error.");
			      }finally {
			    	  CerrarFicheroLeido(fr);
			        }
			 

	}

	@Override
	public void CerrarFicheroLeido(FileReader fr) 
	{
		try {
			 if (null != fr)
				 fr.close();
	          } catch (Exception e2) {
	             e2.printStackTrace();
	          }

	}


	@Override
	public void EscirbirEncabezado(File archivo) 
	{
		 FileWriter fichero = null;
	        PrintWriter pw = null;
	        try
	        {
	        	//Escribir el encabezado
	            fichero = new FileWriter(archivo);
	            
	            pw = new PrintWriter(fichero);

	                pw.println("nombre;telefono;fecha alta;fecha salida;");

	        }catch (IOException e) 
	        {
	        	System.err.println("***ERROR***No se pudo aceder el fichero.");
	        } 
	        catch (Exception e) {
	        	System.err.println("***ERROR***Se ha producido un error.");
	        } finally {
	           try {
	           if (null != fichero)
	              fichero.close();
	           } catch (Exception e2) {
	              e2.printStackTrace();
	           }
	        }

	}

}
