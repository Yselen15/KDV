import java.util.Scanner;
public class KDV {

    public static void main(String[] args) {
        double tutar;
        Scanner input = new Scanner(System.in);
        System.out.print("Ücret Tutarını giriniz:");
        tutar = input.nextDouble();
        if (tutar < 1000) {
            double kdvOran = 0.18;
            double kdvTutar = tutar * kdvOran;
            double kdvliTutar = kdvTutar + tutar;
            System.out.println(kdvTutar);
            System.out.println(kdvliTutar);
        } else if (tutar >= 100) {
            double kdvOran = 0.18;
            double kdvTutar = tutar * kdvOran;
            double kdvliTutar = kdvTutar + tutar;
            System.out.println(kdvTutar);
            System.out.println(kdvliTutar);


        }
    }
}