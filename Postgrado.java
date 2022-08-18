package registroEstudiantes;

public class Postgrado extends Estudiante {
	
	@Override
	public String toString() {
		return "\tEstudiante de Posgrado \n\tNombre:" +  getNombre() + "\n\tEdad: " + getEdad() +" anios"+ "\n\tPrograma: " + getPrograma() +
				"\n\tEtnia: " + getTipo_etnia() + "\n\tModalidad: " + modalidad ;
	}

	
	// Constructor
	public Postgrado(String nom, int ed, String pro, String etnia, String mod) {
		super(nom, ed, pro, etnia);
		this.modalidad = mod;
	}

	// Atributos
	private String modalidad;
}
