package main.java.es.mpt.scsp;


public class Historico{


	private int Id;
	//private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	private  int Fecha;
	private  String NombreString; 
	private  int Script;
	private  int  Estado;
	private  int Salida_ejecucion;
	private  String Version;
	private  int Ejecucion;


	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public  int getFecha() {
		return Fecha;
	}
	public  void setFecha(int fecha) {
		Fecha = fecha;
	}
	public  String getNombreString() {
		return NombreString;
	}
	public  void setNombreString(String nombreString) {
		NombreString = nombreString;
	}
	public  int getScript() {
		return Script;
	}
	public  void setScript(int script) {
		Script = script;
	}
	public  int isEstado() {
		return Estado;
	}

	public  String  isEstadoclass() {
		if (Estado == 1)
			return "bien";
		else 
			return "mal";
	}

	public  String  isEstadoString() {
		if (Estado == 1)
			return "CORRECTO";
		else 
			return "FALLO";
	}
	public  void setEstado(int estado) {
		Estado = estado;
	}
	public  int getSalida_ejecucion() {
		return Salida_ejecucion;
	}
	public  void setSalida_ejecucion(int salida_ejecucion) {
		Salida_ejecucion = salida_ejecucion;
	}
	public  String getVersion() {
		return Version;
	}
	public  void setVersion(String version) {
		Version = version;
	}
	public  int getEjecucion() {
		return Ejecucion;
	}
	public  void setEjecucion(int ejecucion) {
		Ejecucion = ejecucion;
	}
	public Historico(int id,int fecha,String nombreString,int script, int  estado,int salida_ejecucion, String version,int ejecucion) {
		Id = id;
		Fecha=fecha;
		NombreString=nombreString;
		Script=script;
		Estado=estado;
		Salida_ejecucion= salida_ejecucion;
		Version= version;
		Ejecucion=ejecucion;
	}


}