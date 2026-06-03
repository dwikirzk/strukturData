// NIM      : 25161562021
// Nama     : Mohamad Dwiki Rozak
// Tanggal  : 01/06/2026
// Soal     : Soal 1
package UAS;

public class arrayUas {
    public static void main(String[] args) {
        // menampilkan nilai ujian
        System.out.println("======================================");

        int[] nilaiUjian = { 75, 80, 90, 65, 85 };
        System.out.print("Nilai ujian mahasiswa: ");
        for (int i = 0; i < nilaiUjian.length; i++) {
            System.out.print(nilaiUjian[i] + " ");
        }
        System.out.println("\n");

        // menghitung nilai tertinggi, terendah, rata-rata, & kelulusan
        System.out.println("======================================");

        int nilaiTertinggi = nilaiUjian[0];
        int nilaiTerendah = nilaiUjian[0];
        int totalNilai = 0;
        int jumlahLulus = 0;

        for (int i = 0; i < nilaiUjian.length; i++) {
            if (nilaiUjian[i] > nilaiTertinggi) { // mencari nilai tertinggi
                nilaiTertinggi = nilaiUjian[i];
            }

            if (nilaiUjian[i] < nilaiTerendah) { // mencari nilai terendah
                nilaiTerendah = nilaiUjian[i];
            }
            totalNilai += nilaiUjian[i]; // menambahkan nilai ke total

            if (nilaiUjian[i] >= 75) { // menghitung jumlah mahasiswa yang lulus (nilai >= 75)
                jumlahLulus++;
            }
        }
        double rataRata = (double) totalNilai / nilaiUjian.length; //menghitung rata-rata nilai

        System.out.println("Nilai Tertinggi          : " + nilaiTertinggi);
        System.out.println("Nilai Terendah           : " + nilaiTerendah);
        System.out.println("Rata-rata Nilai          : " + rataRata);
        System.out.println("Jumlah Mahasiswa Lulus   : " + jumlahLulus + " mahasiswa");
        System.out.println();

        // menyimpan 3 nilai mhs pada 2 matkul
        System.out.println("======================================");

        int[][] daftarNilai = {
                { 80, 85 },
                { 70, 90 },
                { 95, 75 }
        };

        System.out.println("Mhs \t MK 1 \t MK 2"); //merapikan format
        System.out.println("---------------------");

        for (int i = 0; i < daftarNilai.length; i++) {
            System.out.print("Mhs " + (i + 1) + "\t ");

            for (int j = 0; j < daftarNilai[i].length; j++) {
                System.out.print(daftarNilai[i][j] + "\t ");
            }
            System.out.println();
        }
    }
}