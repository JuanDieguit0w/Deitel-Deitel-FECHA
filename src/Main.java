import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Fecha f1 = new Fecha();

        int day;
        int month;
        int year;

        System.out.println("FECHA INGRESADA POR CONSOLA");

        System.out.println("Ingrese el dia: ");
        day = Integer.parseInt(sc.next());
        f1.setDay(day);

        System.out.println("Ingrese el mes: ");
         month = Integer.parseInt(sc.next());
         f1.setMonth(month);

        System.out.println("Ingrese el año: ");
        year = Integer.parseInt(sc.next());
        f1.setYear(year);

        System.out.println("La fecha es: "+f1.mostrarFecha(f1.getMonth(), f1.getDay(), f1.getYear()));

        Fecha f2;

        System.out.println("FECHA INGRESADA POR CONSOLA");

        System.out.println("Ingrese el dia: ");
        day = Integer.parseInt(sc.next());

        System.out.println("Ingrese el mes: ");
        month = Integer.parseInt(sc.next());

        System.out.println("Ingrese el año: ");
        year = Integer.parseInt(sc.next());

        f2 = new Fecha(month, day, year);
        System.out.println("La fecha es: "+f2.mostrarFecha(f2.getMonth(), f2.getDay(), f2.getYear()));
    }
}