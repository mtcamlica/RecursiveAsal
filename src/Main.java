import java.util.Scanner;

public class Main {

    static int isAsal (int sayi) {
        int sayac = 0;
        for (int i =2; i<sayi; i++) {
            if (sayi == 2) {
                break;
            } else if (sayi % i == 0) {
                sayac++;
                break;

            }
        }
        if (sayac == 0) {
            System.out.println(sayi + " -->> asaldır.");
        }else {
            System.out.println(sayi + " -->> asal değildir.");
        }
        return sayac;
    }




    public static void main(String[] args) {

        int sayi;
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        sayi = input.nextInt();

        isAsal(sayi);
    }
}
