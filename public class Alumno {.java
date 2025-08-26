public class Alumno {
    //atributos
    private String nombre;
    private int edad;
    private String curso;

    // Constructor
    public Alumno(String nombre, int edad, String curso) {
        this.nombre = nombre;
        this.edad = edad;
        this.curso = curso;
    }
    //metodos getter
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getCurso() {
        return curso;
    }

    public String toString() {
        return "Nombre: " + nombre + ", Edad: " + edad + ", Curso: " + curso;
    }
}
public class Docente {
    // Atributos
    private String nombre;
    private int edad;
    private String asignatura;

    // Constructor
    public Docente(String nombre, int edad, String asignatura) {
        this.nombre = nombre;
        this.edad = edad;
        this.asignatura = asignatura;
    }

    // Métodos getter
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public String toString() {
        return "Nombre: " + nombre + ", Edad: " + edad + ", Asignatura: " + asignatura;
    }
}

public class Asignatura {
    // Atributos
    private String nombre;
    private String codigo;

    // Constructor
    public Asignatura(String nombre, String codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
    }

    // Métodos getter
    public String getNombre() {
        return nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public String toString() {
        return "Nombre: " + nombre + ", Código: " + codigo;
    }
}
public class Main {
    public static void main(String[] args) {
        //b instancia/agregarElementos
        Alumno alumno = new Alumno("Juan", 20, "Matemáticas");
        Docente docente = new Docente("María", 35, "Historia");
        Asignatura asignatura = new Asignatura("Ciencias", "C101");

        System.out.println(alumno);
        System.out.println(docente);
        System.out.println(asignatura);
    }
    //consultas C
    public static void consultar(Alumno alumno, Docente docente, Asignatura asignatura) {
        System.out.println("Consulta de Alumno:");
        System.out.println("Nombre: " + alumno.getNombre());
        System.out.println("Edad: " + alumno.getEdad());
        System.out.println("Curso: " + alumno.getCurso());

        System.out.println("\nConsulta de Docente:");
        System.out.println("Nombre: " + docente.getNombre());
        System.out.println("Edad: " + docente.getEdad());
        System.out.println("Asignatura: " + docente.getAsignatura());

        System.out.println("\nConsulta de Asignatura:");
        System.out.println("Nombre: " + asignatura.getNombre());
        System.out.println("Código: " + asignatura.getCodigo());
    }
}