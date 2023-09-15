import java.util.Scanner;

public class Asal {
    static boolean isAsal(int n, int i) {
        if (n <= 2) {
            return (n == 2) ? true : false;
        }
        if (n % i == 0) {
            return false;
        }
        if (i * i > n) {
            return true;
        }
        return isAsal(n, i + 1);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz: ");
        int sayi = scan.nextInt();

        if (isAsal(sayi, 2)) {
            System.out.println(sayi + " sayısı Asaldır");
        } else {
            System.out.println(sayi + " sayısı Asal değildir");
        }
    }
}