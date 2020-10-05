public class Empleado extends Persona {

    private int id;
    private double sueldo;

    public Empleado(int edad, String nombre, char sexo, String direccion, int id, double sueldo) {
        super(edad, nombre, sexo, direccion);
        this.id = id;
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "id=" + id +
                ", sueldo=" + sueldo +
                "nombre = " + nombre +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
}
