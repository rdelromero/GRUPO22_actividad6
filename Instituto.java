import java.util.ArrayList; import java.util.List;
public class Instituto {
    //Atributos de instancia
	ArrayList<Persona> comunidad;
	
	public Instituto() {
		comunidad=new ArrayList<>();
	}
	
	//Métodos exigidos por la interfaz
	public boolean altaPersona(Persona persona) {
		boolean booleano; int i=0;
		while (i<comunidad.size() && comunidad.get(i)!=persona) {
			i=i+1;
		}
			if (i==comunidad.size()) {
				booleano=true;
				comunidad.add(persona);
				System.out.println("Persona dada de alta satisfactoriamente.");
		    }
			else {
				booleano=false;
			System.out.println("Error, esa persona ya es miembro de esta comunidad educativa.");
			}
		return booleano;
	}
	
	public Persona buscarPersona(String nif) {
		Persona personabuscada;
		int i=0;
		while (i<comunidad.size() && comunidad.get(i).getNif()!=nif)
			i=i+1;
        if (i<comunidad.size())
        	personabuscada=comunidad.get(i);
        else {
        	personabuscada=null;
        	System.out.println("Este NIF no aparece en nuestra base de datos.");
        }
        return personabuscada;
	}
	
	public List<Persona> buscarTodas() {
		return comunidad;
	}
	
	public boolean eliminarPersona(Persona persona) {
		boolean booleano; int i=0;
		while (i<comunidad.size() && comunidad.get(i)!=persona) {
			i=i+1;
		}
			if (i==comunidad.size()) {
				booleano=false;
				System.out.println("Error, esa persona no es miembro de esta comunidad educativa.");
		    }
			else {
				booleano=true;
				comunidad.remove(persona);
			    System.out.println("Persona dada de baja satisfactoriamente.");
			}
		return booleano;
	}
	
	//Método buscarPersonaPorTipo() pasando la clase como parámetro y usando isInstance
	public List<Persona> buscarPersonaPorTipo(Class tipoPersona) {
		List<Persona> listaportipo=new ArrayList<>();
		for (Persona persona: comunidad) {
			if (tipoPersona.isInstance(persona))
		    	  listaportipo.add(persona);
		}
		System.out.println("El número de personas de "+tipoPersona+" es " +listaportipo.size()+".");
		return listaportipo;
	}
	
	//Método buscarPersonaPorTipo() pasando String como parámetro y sin usar isInstance
	public List<Persona> buscarPersonaPorTipoAlt(String tipoPersona) {
		List<Persona> listaportipo=new ArrayList<>();
		for (int i=0;i<comunidad.size();i++) {
	  		String frase = comunidad.get(i).getClass().toString();
			String clase=frase.substring(6,frase.length());
		      if (clase.equals(tipoPersona))
		    	  listaportipo.add(comunidad.get(i));
		}
		System.out.println("El número de personas de "+tipoPersona+" es " +listaportipo.size()+".");
		return listaportipo;
	}
	
}
