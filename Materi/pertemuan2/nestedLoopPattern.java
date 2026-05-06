package Materi.pertemuan2;

public class nestedLoopPattern {
    public static void main(String[] args) {
        // n harus ganjil agar huruf 'I' dan 'F' memiliki titik tengah yang presisi
        int n = 5;

        // --- HURUF I ---
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                // Mencetak garis vertikal di kolom tengah
                if (j == (n / 2) + 1) {
                    System.out.print("x");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        System.out.println();

        // --- HURUF N ---
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                // j == 1 (garis kiri), j == n (garis kanan), i == j (diagonal)
                if (j == 1 || j == n || i == j) {
                    System.out.print("x");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        System.out.println();

        // --- HURUF F ---
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                // j == 1 (garis kiri), i == 1 (garis atas), i == (n/2)+1 (garis tengah)
                if (j == 1 || i == 1 || i == (n / 2) + 1) {
                    System.out.print("x");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}