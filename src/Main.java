import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int nfactorial = 1, rfactorial = 1, nMinusRfactorial = 1, nMinusR, n, r;
        Scanner input = new Scanner(System.in);

        System.out.println("n değerini giriniz: ");
        n = input.nextInt();

        System.out.println("r değerini giriniz: ");
        r = input.nextInt();

        nMinusR = n-r;

        // Kombinasyon formülü = C(n,r) = (r! * (n-r)!)

        for (int i = 1; i <= n; i++) {
            nfactorial = nfactorial * i;
        }

        for (int i = 1; i <= r; i++) {
            rfactorial = rfactorial * i;
        }

        for (int i = 1; i <= nMinusR; i++) {
            nMinusRfactorial = nMinusRfactorial * i;
        }

        System.out.println("nfactorial: " + nfactorial);

        System.out.println("rfactorial: " + rfactorial);

        System.out.println("nMinusR factorial: " + nMinusRfactorial);

        System.out.println("C(n,r) = " +nfactorial / (rfactorial * nMinusRfactorial));

    }
}