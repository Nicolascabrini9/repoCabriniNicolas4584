package ar.edu.unju.fi.model;

public class Libro {
	private String Nombre;
	private int codigo;
	private String autor;
	public Libro () {
		
	}
	public Libro(String nombre, int codigo, String autor) {
		super();
		Nombre = nombre;
		this.codigo = codigo;
		this.autor = autor;
	}

}
