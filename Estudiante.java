package registroEstudiantes;

public class Estudiante {

	@Override
	public String toString() {
		return "Estudiante [nombre=" + nombre + ", edad=" + edad + ", programa=" + programa + ", tipo_etnia="
				+ tipo_etnia + "]";
	}

	// Constructor
	public Estudiante(String nom, int ed, String pro, String etnia) {
		this.nombre = nom;
		this.edad = ed;
		this.programa = pro;
		this.tipo_etnia = etnia;
	}

	// Getters Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getPrograma() {
		return programa;
	}

	public void setPrograma(String programa) {
		this.programa = programa;
	}

	public String getTipo_etnia() {
		return tipo_etnia;
	}

	public void setTipo_etnia(String tipo_etnia) {
		this.tipo_etnia = tipo_etnia;
	}

	// Atributos
	private String nombre;
	private int edad;
	private String programa;
	private String tipo_etnia;
}
