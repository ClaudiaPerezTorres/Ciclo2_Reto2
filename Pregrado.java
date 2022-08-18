package registroEstudiantes;

public class Pregrado extends Estudiante {

	@Override
	public String toString() {
		return "\tEstudiante de Pregrado \n\tNombre: " +  getNombre() + "\n\tEdad: " + getEdad() + " anios" + "\n\tPrograma: " + getPrograma()
				+ "\n\tEtnia: " + getTipo_etnia() + "\n\tCreditos aprobados: " + cantidad_creditos;
	}

	// Constructor
	public Pregrado(String nom, int ed, String pro, String etnia, int cantcre) {
		super(nom, ed, pro, etnia);
		this.cantidad_creditos = cantcre;
	}

	// Atributos
	private int cantidad_creditos;
}
