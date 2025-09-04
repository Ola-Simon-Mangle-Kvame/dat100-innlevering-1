import java.util.Scanner;

public class O2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        for (int s = 1; s <= 10; s++) {
            int poeng;

            do {
                System.out.print("poeng: ");

                poeng = in.nextInt();

                if ((poeng > 100) || (poeng < 0)) {
                    System.out.println("ugyldig poengsum");
                }

            } while ((poeng > 100) || (poeng < 0));

            if (poeng >= 90) {
                System.out.println("Karakter: A");
            } else if (poeng >= 80) {
                System.out.println("Karakter: B");
            } else if (poeng >= 70) {
                System.out.println("Karakter: C");
            } else if (poeng >= 50) {
                System.out.println("Karakter: D");
            } else if (poeng >= 40) {
                System.out.println("Karakter: E");
            } else {
                System.out.println("Karakter: F");
            }


        }
        in.close();
    }

}




