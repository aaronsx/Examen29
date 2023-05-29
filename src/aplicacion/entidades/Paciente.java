package aplicacion.entidades;



/**
 * Clase paciente se encarga de tener toda las caracteristicas que se utiliza en la aplicacion
 * @author csi22-amunada
 *
 */
public class Paciente {
	
	//----------Entidades--------
	private String numeroTelefono;
	private String fechaAlta;
	private String fechaSalida;
	private String nombrePaciente;
	//-----GETTERS AND SETTER---------
	public String getNombrePaciente() {
		return nombrePaciente;
	}
	public void setNombrePaciente(String nombrePaciente) {
		this.nombrePaciente = nombrePaciente;
	}
	public String getNumeroTelefono() {
		return numeroTelefono;
	}
	public void setNumeroTelefono(String numeroTelefono) {
		this.numeroTelefono = numeroTelefono;
	}
	public String getFechaAlta() {
		return fechaAlta;
	}
	public void setFechaAlta(String fechaAlta) {
		this.fechaAlta = fechaAlta;
	}
	public String getFechaSalida() {
		return fechaSalida;
	}
	public void setFechaSalida(String fechaSalida) {
		this.fechaSalida = fechaSalida;
	}
	//---------------Constructor------------
	public Paciente(String numeroTelefono, String fechaAlta, String fechaSalida, String nombrePaciente) {
		super();
		this.numeroTelefono = numeroTelefono;
		this.fechaAlta = fechaAlta;
		this.fechaSalida = fechaSalida;
		this.nombrePaciente = nombrePaciente;
	}
	public Paciente() {
		super();
		
	}
}
