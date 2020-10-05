import java.util.Date;

public class Cliente  extends Persona {
    private int id;
    private boolean vip;
    private Date fecha;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Cliente(int edad, String nombre, char sexo, String direccion, int id, boolean vip, Date fecha) {
        super(edad, nombre, sexo, direccion);
        this.id = id;
        this.vip = vip;
        this.fecha = fecha;
    }
}
