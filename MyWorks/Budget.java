import java.util.ArrayList;
import java.util.Scanner;

public class Budget {

    // 1. Static main içinde kullanmak için sınıfı static yaptık
    static class Expense {
        String name;
        int amount;

        public Expense(String name, int amount) {
            this.name = name;
            this.amount = amount;
        }
    }

    public static void main(String args[]) {
        ArrayList<Expense> expenses = new ArrayList<>();
        int myLimit = 5000;
        int total = 0;

        Scanner myScanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nHarcama adı (Çıkmak için 'dur' yazınız):");
            String name = myScanner.nextLine();

            // 3. String karşılaştırma .equals ile yapılır
            if (name.equalsIgnoreCase("dur")) {
                break;
            }

            System.out.println("Harcama Miktarı:");
            int amount = myScanner.nextInt();
            myScanner.nextLine(); // Önemli: Sayıdan sonra enter tuşunu temizler

            expenses.add(new Expense(name, amount));
            total += amount;

            // 4. Değişken isimlerini (total) uyumlu hale getirdik
            if (total > myLimit) {
                System.out.println("UYARI: Limiti aştınız! Toplam: " + total);
            } else {
                System.out.println("Kalan Limit: " + (myLimit - total));
            }
        }

        System.out.println("\n--- HARCAMA ÖZETİ ---");
        for (Expense e : expenses) {
            System.out.println(e.name + " -> " + e.amount + " TL");
        }
        System.out.println("Genel Toplam: " + total + " TL");
    }
}