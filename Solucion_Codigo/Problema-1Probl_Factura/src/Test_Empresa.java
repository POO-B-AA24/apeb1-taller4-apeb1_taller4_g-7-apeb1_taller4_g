import java.util.Scanner;

public class Test_Empresa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el nombre de la empresa:");
        String nombreEmpresa = sc.nextLine();

        System.out.print("Ingrese el número de empleados: ");
        int numEmpleados = sc.nextInt();
        sc.nextLine(); 

        Empleado empleado[] = new Empleado[numEmpleados];
        System.out.print("Ingrese el porcentaje de aumento: ");
        double porcentajeAum = sc.nextDouble();
        sc.nextLine();

        for (int i = 0; i < empleado.length; i++) {
            System.out.print("Ingrese en el siguiente orden: nombre salario edad del empleado " + (i + 1) + ": ");
            String[] datosEmpleado = sc.nextLine().split(" ");

            String nombre = datosEmpleado[0];
            double salario = Double.parseDouble(datosEmpleado[1]);
            int edad = Integer.parseInt(datosEmpleado[2]);

            empleado[i] = new Empleado(nombre, salario, edad);
        }
        Empresa empresa = new Empresa(nombreEmpresa , empleado , porcentajeAum);
        empresa.calcularTotalSalarios();
        empresa.calcularPromedio();
        empresa.verificarSueldo();
        
        System.out.println("Eliga una opcion: ");
        System.out.println("1. Mostrar Informacion de los empleados ");
        System.out.println("2. Mostrar Informacion de la empresa ");
        int opc = sc.nextInt();
        
        switch(opc){
            case 1:
                for (Empleado empl : empleado){
                    System.out.println(empl.mostrarInformacion());
                }
                break;
            case 2:
                System.out.println(empresa.toString());
        }
         
    }
}