package co.edu.campusucc.sd.modelos;
// Generated 18/05/2020 09:27:51 PM by Hibernate Tools 5.4.7.Final

/**
 * Administrador generated by hbm2java
 */
public class Administrador implements java.io.Serializable {

	private AdministradorId id;
	private Giro giro;

	public Administrador() {
	}

	public Administrador(AdministradorId id) {
		this.id = id;
	}

	public Administrador(AdministradorId id, Giro giro) {
		this.id = id;
		this.giro = giro;
	}

	public AdministradorId getId() {
		return this.id;
	}

	public void setId(AdministradorId id) {
		this.id = id;
	}

	public Giro getGiro() {
		return this.giro;
	}

	public void setGiro(Giro giro) {
		this.giro = giro;
	}

}
