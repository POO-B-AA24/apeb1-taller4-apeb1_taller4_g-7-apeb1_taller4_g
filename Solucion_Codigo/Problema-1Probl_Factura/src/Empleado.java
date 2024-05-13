public class Empleado {
    public String nombre;
    public double salario;
    public int edad;
    public double totalSalarios;

    public Empleado(String nombre, double salario, int edad ) {
        this.nombre = nombre;
        this.salario = salario;
        this.edad = edad;
    }

    public String mostrarInformacion() {
        return "Empleado{" + "nombre=" + nombre + ", salario=" + salario + ", edad=" + edad + '}';
    }
    
    
}
