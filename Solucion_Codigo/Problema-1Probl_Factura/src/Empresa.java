public class Empresa {
    public String nombre;
    public Empleado empleado[];
    public double porcentajeAum;
    public double salariosTotal;
    public double promedio;
    

    public Empresa(String nombre, Empleado[] empleado, double porcentajeAum) {
        this.nombre = nombre;
        this.empleado = empleado;
        this.porcentajeAum = porcentajeAum;
    }
    public void calcularTotalSalarios() {
        for (Empleado empleado : empleado) {
            this.salariosTotal += empleado.salario;
        }
    }
    public void calcularPromedio() {
        this.promedio = this.salariosTotal / empleado.length;
    }
    public void verificarSueldo(){
        for (Empleado empleado : empleado){
            if(empleado.salario < promedio){
                empleado.salario = empleado.salario + (empleado.salario*this.porcentajeAum*0.01);
            }
        }
    }

    @Override
    public String toString() {
        return "Empresa{" + "nombre=" + nombre + "empleados" + empleado.length + '}';
    }
    
    
    
}
