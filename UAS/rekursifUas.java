// NIM      : 25161562021
// Nama     : Mohamad Dwiki Rozak
// Tanggal  : 01/06/2026
// Soal     : Soal 2 (b,c)
package UAS;

public class rekursifUas {
    public static int faktorial(int n) {
        // base case: jika n adalah 0, kembalikan nilai 1
        if (n == 0) {
            return 1;
        }
        // rekursif case: n * faktorial(n - 1)
        return n * faktorial(n - 1);
    }

    // ===========================================
    public static int pangkat(int x, int n) {
        if (n == 0) {
            return 1;
        }
        return x * pangkat(x, n - 1);
    }

    public static void main(String[] args) {
        System.out.println("===== PENGUJIAN FAKTORIAL ====");
        int hasilFaktorial = faktorial(5);
        System.out.println("Hasil dari faktorial(5) = " + hasilFaktorial);
        System.out.println();

        System.out.println("===== PENGUJIAN PANGKAT ====");
        // Menguji fungsi pangkat dengan 3 nilai berbeda
        int uji1 = pangkat(2, 4);
        System.out.println("Uji coba 1 -> pangkat(2, 4) = " + uji1);

        int uji2 = pangkat(3, 3);
        System.out.println("Uji coba 2 -> pangkat(3, 3) = " + uji2);

        int uji3 = pangkat(5, 2);
        System.out.println("Uji coba 3 -> pangkat(5, 2) = " + uji3);
    }
}