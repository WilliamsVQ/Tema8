public class Main {
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        persona1.setEdad(7);
        System.out.println("Edad: "+persona1.getEdad());
        persona1.setNombre("Pepito");
        System.out.println("Nombre: "+persona1.getNombre());
        persona1.setTelefono(12345678);
        System.out.println("Telefono: "+persona1.getTelefono());
    }
}
class Persona{
    private int edad;
    private String nombre;
    private int telefono;

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
}