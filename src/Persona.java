public class Persona {

    protected int edad;
    protected String nombre;
    protected char sexo;
    protected String direccion;

    public Persona(int edad, String nombre, char sexo, String direccion) {
        this.edad = edad;
        this.nombre = nombre;
        this.sexo = sexo;
        this.direccion = direccion;
    }

    public Persona() {
    }

    @Override
    public String toString() {
        return "Persona{" +
                "edad=" + edad +
                ", nombre='" + nombre + '\'' +
                ", sexo=" + sexo +
                ", direccion='" + direccion + '\'' +
                '}';
    }

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

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
