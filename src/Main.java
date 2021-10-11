import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double fyt, kdv1 = 0.18, kdv2 = 0.08, kdvtutar, kdvlitutar;

        Scanner input = new Scanner(System.in);
        System.out.print("Fiyatı giriniz : ");
        fyt = input.nextDouble();

        boolean kosul1 = fyt >= 0;
        boolean kosul2 = fyt <= 1000;
        boolean sonuc = kosul1 && kosul2;

        System.out.println("KDV'siz fiyat : " + fyt);
        kdvtutar = sonuc ? kdv1 : kdv2;
        kdvlitutar = fyt + (fyt * kdvtutar);

        System.out.println("KDV'li fiyat :" + kdvlitutar );
        System.out.println("KDV tutari :" + fyt * kdvtutar);

    }
    }
