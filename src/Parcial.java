import java.util.Scanner;

public class Parcial {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("ingrese su edad");
        int edad=input.nextInt();
        System.out.println("ingrese clave secreta");
        int clave=input.nextInt();
        
            if (edad>18) {
                System.out.println("acceso otorgado");
            }else if (edad<=18) {
                System.out.println("acceso denegado");
            } else if (clave==1234) {
                System.out.println("acceso otorgado");
            }else  {
                System.out.println("acceso denegado");
        }
        input.close();
    }
}
