
public class Prueba2Alumno {
	private String codigo;
	private String nombre;
	private double notaParcial;
	private double notaFinal;
	/**
	 * @param codigo
	 * @param nombre
	 * @param notaParcial
	 * @param notaFinal
	 */
	public Prueba2Alumno(String codigo, String nombre, double notaParcial, double notaFinal) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.notaParcial = notaParcial;
		this.notaFinal = notaFinal;
	}
	/**
	 * 
	 */
	
	public double calcularPromedio() {
		
		return (this.notaParcial + this.notaFinal / 2);
	}
	
	public Prueba2Alumno() {
		super();
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getNotaParcial() {
		return notaParcial;
	}
	public void setNotaParcial(double notaParcial) {
		this.notaParcial = notaParcial;
	}
	public double getNotaFinal() {
		return notaFinal;
	}
	public void setNotaFinal(double notaFinal) {
		this.notaFinal = notaFinal;
	}
	


}
