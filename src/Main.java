import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double cuenta=0, descuentoA=0, descuentoB=0, total=0, hora=0, recargo=0, invitados=0;
                System.out.println("Menú de opciones");
        System.out.println("1. Almuerzo, 2. Cena, 3. Reserva de evento");
        String opcion = sc.nextLine();

        switch (opcion){
            case "1":
            System.out.println("Ingrese el día de la semana");
                System.out.println("Lunes, Martes, Miércoles, Jueves, Viernes, Sabado, Domingo");
                String dia = sc.nextLine();
                System.out.println("Ingrese el valor de la cuenta");
                cuenta= sc.nextDouble();
                if (dia.equals("Lunes") || dia.equals("Miercoles") || dia.equals("Viernes")){
                    descuentoA =0.1;
                }
                if (cuenta > 100000){
                    descuentoB = 0.05;
                }
                total=cuenta*(1-(descuentoA+descuentoB));
                System.out.println("Selecionaste la opcion: "+opcion+". Almuerzo");
                System.out.println("El valor de la cuenta es: "+cuenta);
                System.out.println("El día seleccionado es: "+dia);
                System.out.println("El descuento otorgado fue del "+descuentoA+" por tu día de visitarnos y "+descuentoB+" por el valor de tu compra");
                System.out.println("Con un total de descuento de: "+(descuentoA+descuentoB));
                System.out.println("el valor total de tu cuenta es: "+total);
                System.out.println("Gracias por tu compra");
                break;
            case "2":
                System.out.println("Ingrese su hora de entrada, en horario militar");
                hora = sc.nextDouble();
                System.out.println("Ingrese el valor de la cuenta: ");
                cuenta = sc.nextDouble();
                if (hora>2000){
                    recargo=cuenta*0.1;
                }
                if (cuenta>150000){
                    descuentoA=cuenta*0.08;
                }
                total=cuenta+recargo-descuentoA;
                System.out.println("Selecionaste la opcion: "+opcion+". Cena");
                System.out.println("El valor de la cuenta es: "+cuenta);
                System.out.println("Tu hora de ingreso fue "+hora);
                System.out.println("Por lo cual te genero un recargo de: "+recargo+" y e valor de compra te genero un descuento de: "+descuentoA);
                System.out.println("el valor total de tu cuenta es: "+total);
                System.out.println("Gracias por tu compra");
                break;
            case "3":
                System.out.println("Ingrese la cantidad de invitados: ");
                invitados = sc.nextDouble();
                if (invitados>30){
                    descuentoA=0.15;
                } else if (invitados<30) {
                    descuentoA=0;
                }
                System.out.println("Su evento contara con "+invitados+" invitados, por lo cual le otorgaremos un descuento del "+descuentoA);
                System.out.println("Gracias por tu reserva");
        }

    }
}