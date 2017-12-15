import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// crear una actuacion por programacion
		
		Actuacion a1 = new Actuacion();
		
		a1.setNombreGrupo("ACDC");
		a1.setDuracion(90);
		
		
		
		// crear una actuacion mediante teclado
		Scanner lector = new Scanner(System.in);
		Actuacion a2 = new Actuacion();
		
		System.out.println("Introduce el nombre del grupo:");
		a2.setNombreGrupo(lector.nextLine());
		
		System.out.println("Introduce la duración de la actuación:");
		a2.setDuracion(Integer.parseInt(lector.nextLine()));
		
			
		// crear una actuacion leyendo desde fichero
		
		File fichero = new File("D:/actuaciones.txt");
		
		Scanner scan = null;
		try {
			scan = new Scanner(fichero);
		} 
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		Actuacion a3 = null;
		while (scan.hasNextLine()){
			String linea = scan.nextLine();
			String[] partes = linea.split(":");
			a3 = new Actuacion();
			a3.setNombreGrupo(partes[0]);
			a3.setDuracion(Integer.parseInt(partes[1]));
		}
		
		//crear un festival por programacion con 3 actuaciones
		
		ArrayList<Actuacion> actuaciones = new ArrayList<Actuacion>();
		actuaciones.add(a1);
		actuaciones.add(a2);
		actuaciones.add(a3);

		Festival f1 = new Festival();
		
		f1.setNombre("Jazzaldia");
		f1.setPatrocinador("Heineken");
		
		f1.setActuaciones(actuaciones);
		
		Actuacion a4 = new Actuacion();
		a4.setNombreGrupo("Mikel Laboa");
		a4.setDuracion(100);
		
		f1.addActuacion(a4);
		f1.addActuacion("Linkin Park", 95);
		
		f1.mostrarInfo();

	}

}
