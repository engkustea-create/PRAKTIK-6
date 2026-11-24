import java.util.Scanner;

public class RataRataTes {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] nilai = new int[5];
        int total = 0;
        double rataRata;

        System.out.println("===> MENGHITUNG RATA-RATA TES <===");

        // Memasukkan 5 nilai tes
        for (int i = 0; i < 5; i++) {
            System.out.print("Masukkan nilai tes ke-" + (i + 1) + ": ");
            nilai[i] = input.nextInt();

            total += nilai[i];
        }

        // Menghitung rata-rata
        rataRata = (double) total / 5;

        System.out.println("\n===> HASIL PERHITUNGAN <===");
        System.out.println("Total nilai: " + total);
        System.out.println("Rata-rata mahasiswa: " + rataRata);

        input.close();
    }
}