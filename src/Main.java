import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double cuenta=0, descuentoA=0, descuentoB=0, total=0;
                System.out.println("Menú de opciones");
        System.out.println("1. Almuerzo, 2. Cena, 3. Reserva de evento");
        String opcion = sc.nextLine();

        switch (opcion){
            case "1":
            System.out.println("Ingrese el día de la semana");
                System.out.println("L-Lunes, M-Martes, Mi-Miércoles, J-Jueves, V-Viernes, S-Sábado, D-Domingo");
                String dia = sc.nextLine();
                System.out.println("Ingrese el valor de la cuenta");
                cuenta= sc.nextDouble();
                if (dia.equals("L") || dia.equals("Mi") || dia.equals("V")){
                    descuentoA =0.1;
                }
                if (cuenta > 100000){
                    descuentoB = 0.05;
                }
                total=cuenta*(1-(descuentoA+descuentoB));

        }
    }
}