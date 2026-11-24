public class ArithmeticException {
    public static void main(String[] args) {

        int angka1 = 10;
        int angka2 = 0;

        try {
            int hasil = angka1 / angka2;
            System.out.println(hasil);

        } catch (java.lang.ArithmeticException e) {
            System.out.println("Tidak bisa membagi dengan nol!");
        }
    }
}