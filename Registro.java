package registroEstudiantes;


import java.util.ArrayList;
import java.util.Scanner;

public class Registro {

	// Agregar Estudiante
	public  void agregarEstudiante(String[] listado) {

		if (listado[1].equals("Posgrado")) {
			Estudiante est = new Postgrado(listado[2], Integer.parseInt(listado[3]), listado[4], listado[5],
					listado[6]);
			estudiantes.add(est);

		}

		if (listado[1].equals("Pregrado")) {
			Estudiante est = new Pregrado(listado[2], Integer.parseInt(listado[3]), listado[4], listado[5],
					Integer.parseInt(listado[6]));
			estudiantes.add(est);

		}

	}

	// listar Estudiantes
	public  void listarEstudiantes() {
		System.out.println("***Listado Estudiantes***");

		for (Estudiante estudiante : estudiantes) {
			System.out.println(estudiante);
		}
	}

	// Procesar comandos
	public  void procesarComandos() {

		Scanner entrada = new Scanner(System.in);
		int opcion;

		do {

			String[] datos = entrada.nextLine().split("&");

			opcion = Integer.parseInt(datos[0]);

			switch (opcion) {
			case 1:
				agregarEstudiante(datos);
				break;

			case 2:
				listarEstudiantes();
				break;

			default:
				break;
			}

		} while (opcion == 1 || opcion == 2);
	}

	// Atributo
	private ArrayList<Estudiante> estudiantes = new ArrayList<Estudiante>();

	// MAIN
	public static void main(String[] args) {
		Registro registro =  new Registro();

		registro.procesarComandos();

	}
}

/*1&Posgrado&Maria Sarmiento&25&Maestria en economia&Ninguna&Investigacion

1&Pregrado&Luis Parra&21&Medicina&Raizal&15

1&Pregrado&Martha Casas&19&Derecho&Ninguna&42

1&Posgrado&Luz Salas&23&Maestria en ingenieria&Ninguna&Profundizacion

2

3*/

