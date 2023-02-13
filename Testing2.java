
public class Testing2 {
	public static void main(String[] args) {
		Instituto insti1=new Instituto();
		
		Profesor profesor1 = new Profesor("01234561A", "Andrés Álvarez", "Puerta del Sol, 1", "600000001");
    	profesor1.setCompetencias("Matemáticas y Tecnología");
		Profesor profesor2 = new Profesor("01234562A", "Beatriz Bueno", "C/ Alcalá, 5", "600000002");
    	profesor2.setCompetencias("Lengua Española");
    	Alumno alumno1 = new Alumno("01234563A", "Carlos Carrascal", "C/ Carmen, 2", "600000003");
    	alumno1.setCurso("1.º ESO");
    	Alumno alumno2 = new Alumno("01234564A", "Diana Díaz", "C/ Preciados, 1", "600000004");
    	alumno1.setCurso("2.º ESO");
    	Administrativo administrativo1 = new Administrativo("01234564A", "Enzo Espada", "C/ Arenal, 2", "600000005");
    	administrativo1.setTareas("Hacer matrículas, controlar asistencia");
    	Administrativo administrativo2 = new Administrativo("01234564A", "Fina Flores", "C/ Correo, 4", "600000006");
    	administrativo1.setTareas("Hacer matrículas, gestionar títulos");
    	
		System.out.println(insti1.altaPersona(profesor1));
		System.out.println(insti1.altaPersona(profesor2));
		System.out.println(insti1.altaPersona(alumno1));
		System.out.println(insti1.altaPersona(alumno2));
		System.out.println(insti1.altaPersona(administrativo1));
		System.out.println(insti1.altaPersona(administrativo2));
		System.out.println(insti1.buscarPersona("01234561A"));
		System.out.println(insti1.buscarPersona("00000000C"));
		System.out.println(insti1.buscarTodas());
		System.out.println(insti1.eliminarPersona(profesor2));
		
		System.out.println(insti1.buscarPersonaPorTipo(profesor1.getClass()));
		System.out.println(insti1.buscarPersonaPorTipo(alumno1.getClass()));
		System.out.println(insti1.buscarPersonaPorTipo(administrativo1.getClass()));
		
		System.out.println(insti1.buscarPersonaPorTipoAlt("Profesor"));
		System.out.println(insti1.buscarPersonaPorTipoAlt("Alumno"));
		System.out.println(insti1.buscarPersonaPorTipoAlt("Administrativo"));
	}

}
