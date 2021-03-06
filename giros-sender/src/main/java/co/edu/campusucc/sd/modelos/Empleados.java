package co.edu.campusucc.sd.modelos;
// Generated 18/05/2020 09:27:51 PM by Hibernate Tools 5.4.7.Final

import java.util.HashSet;
import java.util.Set;

/**
 * Empleados generated by hbm2java
 */
public class Empleados implements java.io.Serializable {

	private String idEmpleado;
	private String nombre;
	private String apellido;
	private String tipoDocumento;
	private Set giros = new HashSet(0);
	private Set locutorios = new HashSet(0);

	public Empleados() {
	}

	public Empleados(String idEmpleado) {
		this.idEmpleado = idEmpleado;
	}

	public Empleados(String idEmpleado, String nombre, String apellido, String tipoDocumento, Set giros,
			Set locutorios) {
		this.idEmpleado = idEmpleado;
		this.nombre = nombre;
		this.apellido = apellido;
		this.tipoDocumento = tipoDocumento;
		this.giros = giros;
		this.locutorios = locutorios;
	}

	public String getIdEmpleado() {
		return this.idEmpleado;
	}

	public void setIdEmpleado(String idEmpleado) {
		this.idEmpleado = idEmpleado;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return this.apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getTipoDocumento() {
		return this.tipoDocumento;
	}

	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	public Set getGiros() {
		return this.giros;
	}

	public void setGiros(Set giros) {
		this.giros = giros;
	}

	public Set getLocutorios() {
		return this.locutorios;
	}

	public void setLocutorios(Set locutorios) {
		this.locutorios = locutorios;
	}

}
