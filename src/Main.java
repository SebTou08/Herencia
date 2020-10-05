import java.util.Date;

public class Main {
    public static void main(String args[]){
    Empleado e1 = new Empleado(20,"Sebastian Toulier", 'M',"Villa el salvador",45846,1800 );
    Empleado e2 = new Empleado(20,"Ariana Carrasco", 'F',"Chorrillos",876, 2200);
    System.out.println(e1.toString());
    System.out.println(e2.toString());
    Cliente c1 = new Cliente(20, "Rosa Pereda" ,'F',"San Juan de Miraflores",6884, true, new Date());
    System.out.println(c1);
        System.out.println(c1.getFecha());
    }
}
