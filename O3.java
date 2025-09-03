import java.util.Scanner;
public class O3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


            System.out.print("heltall: ");
        int n = in.nextInt();
        int resultat = 1;
if(n>0) {

    for (int i = 1; i <= n; i++) {
        resultat = resultat * i;

    }

} else {System.out.print("ugyldig tall");


    } System.out.print (resultat);
}}