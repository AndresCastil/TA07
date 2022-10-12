import java.util.Hashtable;
import java.util.Scanner;

public class Ej1App {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int notaTotal = 0;

		// Cálculo de la nota media

		int[] nota = new int[5];
		String alumno;
		double notaMedia = 0;

		System.out.println("Nombre alumno: ");
		alumno = sc.nextLine();

		for (int i = 0; i < nota.length; i++) {
			System.out.println("Ingresa nota: ");
			nota[i] = sc.nextInt();
		}

		for (int i = 0; i < nota.length; i++) {
			notaTotal = notaTotal + nota[i];

			notaMedia = notaTotal / nota.length;
		}
		System.out.println("La nota media es: " + notaMedia);

		// Lista de alumnos y sus respectivas notas medias.
		// tablaNotaMedia.put(key, value)

		Hashtable<String, Double> tablaNotaMedia = new Hashtable<String, Double>();

		for (int i = 0; i < 5; i++) {
			System.out.println("Nombre alumno: ");
			alumno = sc.next();
			System.out.println("Nota media: ");
			notaMedia = Double.parseDouble(sc.next());
			tablaNotaMedia.put(alumno, notaMedia);

		}
		System.out.println(tablaNotaMedia);

	}

}
