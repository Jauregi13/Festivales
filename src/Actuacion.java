
public class Actuacion {
	
	private String nombreGrupo;
	private int duracion;
	
	
	
	
	
	
	
	
	public String getNombreGrupo() {
		return nombreGrupo;
	}
	public void setNombreGrupo(String nombreGrupo) {
		this.nombreGrupo = nombreGrupo;
	}
	public int getDuracion() {
		return duracion;
	}
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	
	public String getInfo(){
		return this.getNombreGrupo() + " : " + this.getDuracion();
	}
	
	

}
