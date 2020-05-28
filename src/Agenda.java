
public class Agenda {
	
	private String nombre;
	private String apellidos;
	private String direccion;
	private String email;
	private int telefono;
	
	
	public Agenda(String nombre, String apellidos, String direccion, String email, int telefono) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.direccion = direccion;
		this.email = email;
		this.telefono = telefono;
	}

	
	
	
	public Agenda(String email, int telefono) {
		this.nombre = "";
		this.apellidos= "";
		this.direccion = "";
		this.email = email;
		this.telefono = telefono;	
	}

	public Agenda() {
		this.nombre = "";
		this.apellidos= "";
		this.direccion = "";
		this.email = "";
		this.telefono = 0;	
	}



	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + telefono;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Agenda))
			return false;
		Agenda other = (Agenda) obj;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (telefono != other.telefono)
			return false;
		return true;
	}
	

	public void mostrarContacto() {
		
		System.out.println("El nombre es -> " + nombre + "El apellido es -> " + apellidos + 
				"La direccion es -> " + direccion + "El email es -> " + email + "El telefono es -> " + telefono);
		}
	
	
}
