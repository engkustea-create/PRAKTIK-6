import java.util.Scanner;

public class OperasiMatriks {

    static Scanner input = new Scanner(System.in);

    static int[][] A = new int[2][2];
    static int[][] B = new int[2][2];

    static boolean matriksA = false;
    static boolean matriksB = false;

    // Method untuk memasukkan matriks
    static void masukkanMatriks(int[][] matriks, String nama) {
        System.out.println("\nMasukkan elemen Matriks " + nama);

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Baris " + (i + 1) +
                        ", Kolom " + (j + 1) + ": ");
                matriks[i][j] = input.nextInt();
            }
        }

        System.out.println("Matriks " + nama + " berhasil dimasukkan.");
    }

    // Method untuk menampilkan hasil matriks
    static void tampilkanMatriks(int[][] hasil) {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(hasil[i][j] + "\t");
            }
            System.out.println();
        }
    }

    // Method penjumlahan matriks
    static void penjumlahan() {
        int[][] hasil = new int[2][2];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                hasil[i][j] = A[i][j] + B[i][j];
            }
        }

        System.out.println("\nHasil A + B:");
        tampilkanMatriks(hasil);
    }

    // Method pengurangan matriks
    static void pengurangan() {
        int[][] hasil = new int[2][2];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                hasil[i][j] = A[i][j] - B[i][j];
            }
        }

        System.out.println("\nHasil A - B:");
        tampilkanMatriks(hasil);
    }

    // Method perkalian matriks
    static void perkalian() {
        int[][] hasil = new int[2][2];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                hasil[i][j] = 0;

                for (int k = 0; k < 2; k++) {
                    hasil[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        System.out.println("\nHasil A * B:");
        tampilkanMatriks(hasil);
    }

    // Method utama
    public static void main(String[] args) {

        char pilihan;

        do {
            System.out.println("\n===== MENU MATRIKS =====");
            System.out.println("a. Masukkan Matriks A");
            System.out.println("b. Masukkan Matriks B");
            System.out.println("c. Tampilkan A + B");
            System.out.println("d. Tampilkan A - B");
            System.out.println("e. Tampilkan A * B");
            System.out.println("f. Keluar");

            System.out.print("Pilih menu: ");
            pilihan = input.next().toLowerCase().charAt(0);

            switch (pilihan) {

                case 'a':
                    masukkanMatriks(A, "A");
                    matriksA = true;
                    break;

                case 'b':
                    masukkanMatriks(B, "B");
                    matriksB = true;
                    break;

                case 'c':
                    if (matriksA && matriksB) {
                        penjumlahan();
                    } else {
                        System.out.println("Masukkan Matriks A dan B terlebih dahulu!");
                    }
                    break;

                case 'd':
                    if (matriksA && matriksB) {
                        pengurangan();
                    } else {
                        System.out.println("Masukkan Matriks A dan B terlebih dahulu!");
                    }
                    break;

                case 'e':
                    if (matriksA && matriksB) {
                        perkalian();
                    } else {
                        System.out.println("Masukkan Matriks A dan B terlebih dahulu!");
                    }
                    break;

                case 'f':
                    System.out.println("Program telah selesai. Terima kasih!");
                    break;

                default:
                    System.out.println("Pilihan tidak tersedia!");
            }

        } while (pilihan != 'f');

        input.close();
    }
}