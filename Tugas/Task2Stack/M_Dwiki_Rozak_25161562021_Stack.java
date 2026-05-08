package Tugas.Task2Stack;
public class M_Dwiki_Rozak_25161562021_Stack {
    // === BAGIAN 1: Deklarasi Stack ===
    static String[] stack = new String[10];
    static int top = -1;

    // === BAGIAN 2: Operasi Stack ===
    static void push(String tiket) {
        if (top == stack.length - 1) {
            System.out.println("Stack penuh!");
        } else {
            top++;
            stack[top] = tiket;
        }
    }

    static String pop() {
        if (isEmpty()) {
            return "Stack kosong!";
        } else {
            String dataDihapus = stack[top];
            top--;
            return dataDihapus;
        }
    }

    static String peek() {
        if (isEmpty()) {
            return "Stack kosong!";
        }
        return stack[top];
    }

    static boolean isEmpty() {
        return top == -1;
    }

    // Tugas Bonus: Menghitung total harga, menggunakan cara manual: mengambil 5 angka terakhir dari string
    static void hitungTotal() {
        int total = 0;
        for (int i = 0; i <= top; i++) {
            String s = stack[i];
            // Mengambil potongan string harga (contoh: "50.000"), lalu menghapus titik agar bisa jadi angka
            String hargaSaja = s.substring(s.length() - 6).replace(".", "");
            total = total + Integer.parseInt(hargaSaja.trim());
        }
        System.out.println("Total transaksi: Rp" + total);
    }

    static void tampilkanStack() {
        System.out.println("=== Isi Stack (TOP -> BOTTOM) ===");
        for (int i = top; i >= 0; i--) {
            System.out.println("| " + stack[i] + " |");
        }
        System.out.println("==================================");
    }

    // === BAGIAN 3: Main Program ===
    public static void main(String[] args) {
        push("Tiket-A01: Avengers Rp50.000");
        push("Tiket-B02: Interstellar Rp45.000");
        push("Tiket-C03: Inception Rp45.000");
        
        hitungTotal();
        tampilkanStack();
        System.out.println("Tiket terakhir masuk: " + peek());
        System.out.println("Tiket dibatalkan: " + pop());
        tampilkanStack();
    }
}