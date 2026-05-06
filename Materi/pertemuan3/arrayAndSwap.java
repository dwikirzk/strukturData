package Materi.pertemuan3;

public class arrayAndSwap {
    public static void main(String[] args) {
        int[] x = {32, 12, 20, 83, 44};
        int a = 0;

        // Proses Swap (Tukar Nilai) antara indeks 0 dan indeks 4
        a = x[0];    // Simpan nilai 32 ke variabel sementara 'a'
        x[0] = x[4]; // Isi indeks 0 dengan nilai dari indeks 4 (44)
        x[4] = a;    // Isi indeks 4 dengan nilai 'a' (32)

        // Perbaikan pada kondisi: i < x.length
        for (int i = 0; i < x.length; i++) {
            System.out.println(x[i]);
        }
    }
}