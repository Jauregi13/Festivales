import java.util.ArrayList;
import java.util.Iterator;

public class Festival {
	
	private String nombre;
	private String patrocinador;
	private ArrayList<Actuacion> actuaciones;
	
	
	
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPatrocinador() {
		return patrocinador;
	}
	public void setPatrocinador(String patrocinador) {
		this.patrocinador = patrocinador;
	}
	public ArrayList<Actuacion> getActuaciones() {
		return actuaciones;
	}
	public void setActuaciones(ArrayList<Actuacion> actuaciones) {
		this.actuaciones = actuaciones;
	}
	
	
	public void addActuacion(Actuacion a){
		this.actuaciones.add(a);
	}
	
	public void addActuacion(String nombre, int duracion){
		
		Actuacion a = new Actuacion();
		a.setNombreGrupo(nombre);
		a.setDuracion(duracion);
		this.actuaciones.add(a);
	}
	
	public void mostrarInfo(){
		System.out.println(getNombre());
		System.out.println("Patrocinado por " + getPatrocinador());
		System.out.println("----------------");
		Iterator<Actuacion> i = actuaciones.iterator();
		
		while (i.hasNext()){ 
			System.out.println(i.next().getInfo());
		}
	}
	
	
	

}
