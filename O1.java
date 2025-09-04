import java.util.Scanner;

public class O1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Bruttolønn: ");
        double lonn = in.nextDouble();
        double skatt = 0;


        if (lonn > 1410750) {
            double grunnlag = lonn - 1410750;
            skatt = skatt + (grunnlag * 0.177);
        }
        if (lonn > 942400) {
            double topp = lonn;
            if (topp > 1410750) {
                topp = 1410750;
            }
            double grunnlag = topp - 942400;
            skatt = skatt + (grunnlag * 0.167);
        }
        if (lonn > 697150) {
            double topp = lonn;
            if (topp > 942400) {
                topp = 942400;
            }
            double grunnlag = topp - 697150;
            skatt = skatt + (grunnlag * 0.137);
        }
        if (lonn > 306050) {
            double topp = lonn;
            if (topp > 697150) {
                topp = 697150;
            }
            double grunnlag = topp - 306050;
            skatt = skatt + (grunnlag * 0.04);
        }
        if (lonn > 217400) {
            double topp = lonn;
            if (topp > 306050) {
                topp = 306050;
            }
            double grunnlag = topp - 217400;
            skatt = skatt + (grunnlag * 0.017);
        }
        System.out.printf("Trinnskatt: %.2f kr%n", skatt);
        in.close();
    }
}