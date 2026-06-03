// NIM      :25161562021
// Nama     : Mohamad Dwiki Rozak
// Tanggal  : 01/06/2026
// Soal     : Soal 2a
package UAS;

public class rekursif2a {
    public static void hitungMundur(int n) {
        if (n == 0) {
            System.out.println("Selesai!");
            return;
        }
        System.out.println(n);
        hitungMundur(n - 1);
    }

    public static void main(String[] args) {
        hitungMundur(5);
    }
}