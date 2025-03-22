import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.println("Nombre vendedor:");
        String vendedor = input.nextLine();

        System.out.println("Cantidad de productos vendidos:");
        int Cantidad = input.nextInt();

        System.out.println("Ingrese valor producto 1:");
        double producto1 = input.nextDouble();

        System.out.println("Ingrese valor producto 2:");
        double producto2 = input.nextDouble();

        System.out.println("Ingrese valor producto 3:");
        double producto3 = input.nextDouble();

        System.out.println("Ingrese valor producto 4:");
        double producto4 = input.nextDouble();

        System.out.println("Ingrese valor producto 5:");
        double producto5 = input.nextDouble();

        System.out.println("Ingrese valor producto 6:");
        double producto6 = input.nextDouble();

        System.out.println("Ingrese valor producto 7:");
        double producto7 = input.nextDouble();

        double comisiones = 0;

        if (producto1 >= 100000) {
            comisiones = comisiones + (producto1 * 0.10);
        } else {
            comisiones = comisiones + (producto1 * 0.05);
        }

        if (producto2 >= 100000) {
            comisiones = comisiones + (producto2 * 0.10);
        } else {
            comisiones = comisiones + (producto2 * 0.05);
        }

        if (producto3 >= 100000) {
            comisiones = comisiones + (producto3 * 0.10);
        } else {
            comisiones = comisiones + (producto3 * 0.05);
        }

        if (producto4 >= 100000) {
            comisiones = comisiones + (producto4 * 0.10);
        } else {
            comisiones = comisiones + (producto4 * 0.05);
        }

        if (producto5 >= 100000) {
            comisiones = comisiones + (producto5 * 0.10);
        } else {
            comisiones = comisiones + (producto5 * 0.05);
        }

        if (producto6 >= 100000) {
            comisiones = comisiones + (producto6 * 0.10);
        } else {
            comisiones = comisiones + (producto6 * 0.05);
        }

        if (producto7 >= 100000) {
            comisiones = comisiones + (producto7 * 0.10);
        } else {
            comisiones = comisiones + (producto7 * 0.05);
        }

        double totalventas = producto1 + producto2 + producto3 + producto4 + producto5 + producto6 + producto7;
        double saldototal = (double) (comisiones + 1000000);

        System.out.println("Vendedor: " + vendedor);
        System.out.println("Total ventas: " + (int)totalventas);
        System.out.println("Comisiones: " + (int)comisiones);
        System.out.println("Salario total: " + (int)saldototal);
        input.close();
    }
}
