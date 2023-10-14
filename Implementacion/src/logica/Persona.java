package logica;

public abstract class Persona {
	protected String nombre;
	protected double cedula;
	protected String fechadeNacimiento;
	protected String nacionalidad;
	protected String email;
	protected double celular;
	//public **imagen documento**//
	public String login;
	public String password;
	public Persona(String nombre, double cedula, String fechadeNacimiento, String nacionalidad, String email,
			double celular, String login, String password) {
		super();
		this.nombre = nombre;
		this.cedula = cedula;
		this.fechadeNacimiento = fechadeNacimiento;
		this.nacionalidad = nacionalidad;
		this.email = email;
		this.celular = celular;
		this.login = login;
		this.password = password;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getCedula() {
		return cedula;
	}
	public void setCedula(double cedula) {
		this.cedula = cedula;
	}
	public String getFechadeNacimiento() {
		return fechadeNacimiento;
	}
	public void setFechadeNacimiento(String fechadeNacimiento) {
		this.fechadeNacimiento = fechadeNacimiento;
	}
	public String getNacionalidad() {
		return nacionalidad;
	}
	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public double getCelular() {
		return celular;
	}
	public void setCelular(double celular) {
		this.celular = celular;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public abstract void agregarPersona() {
		//Se agrega a la lista//
		return ;
	}
	

}
