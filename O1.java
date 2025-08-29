import java.util.Scanner;

public class O1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("bruttolonn: ");
        double l = in.nextDouble();

        if (l < 217401) {
            l = l * 0;

            System.out.println("skatt:" + l);
        }
        else if (l < 306051) {
            l = l * 0.017;

            System.out.println("skatt:" + l + "kr");
        }
        else if (l < 697151) {
            l = l * 0.04;

            System.out.println("skatt:" + l + "kr");
        }
        else if (l < 942401) {
            l = l * 0.137;

            System.out.println("skatt:" + l + "kr");
        }
        else if (l < 1410751) {
            l = l * 0.167;

            System.out.println("skatt:" + l + "kr");
        }
        else if (l > 1410750) {
            l = l * 0.177;

            System.out.println("skatt:" + l + "kr");
        }
    }
}