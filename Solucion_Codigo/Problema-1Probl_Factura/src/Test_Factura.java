import java.util.Scanner;

public class Test_Factura {
     public static void main(String[] args) {
         Scanner tc = new Scanner(System.in);
         System.out.println("Ingrese el numero de productos: ");
         int numProd = tc.nextInt();
         System.out.println("Ingrese el precio del producto: ");
         double precioProd = tc.nextDouble();
         Factura f1 = new Factura(numProd, precioProd);
         f1.calcularDescuento();
         f1.calcularPrecioFinal();
         System.out.println(f1);
     }
}
