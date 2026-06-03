// NIM      : 25161562021
// Nama     : Mohamad Dwiki Rozak
// Tanggal  : 01/06/2026
// Soal     : Soal 4 A
package UAS;

public class queue {
    static int size = 5;
    static String[] que = new String[size];
    static int rear = -1;

    public static void main(String[] args) {
        System.out.println("=== SIMULASI ANTRIAN LOKET KAMPUS ===");

        // tambahkan ke antrian (offer)
        offer("Budi");
        offer("Sari");
        offer("Andi");
        offer("Rina");
        System.out.println();

        // tampilkan yang paling depan dengan peek()
        peek();
        System.out.println();

        // layani 2 orang pertama dengan poll()
        poll();
        poll();
        System.out.println();

        // menambahkan 'Doni' ke antrian
        offer("Doni");
        System.out.println();

        System.out.print("Sisa ");
        viewQue();
    }

    // fungsi peek()
    public static void peek() {
        if (isEmpty())
            System.out.println("Antrian kosong");
        else
            System.out.println("Antrian paling depan (peek): " + que[0]);
    }

    public static boolean isEmpty() {
        if (rear == -1)
            return true;
        else
            return false;
    }

    public static boolean isFull() {
        if (rear == size - 1)
            return true;
        else
            return false;
    }

    // fungsi offer()
    public static void offer(String x) {
        if (isFull())
            System.out.println("Antrian penuh, " + x + " tidak bisa masuk.");
        else {
            rear = rear + 1;
            que[rear] = x;
            System.out.println(x + " masuk ke antrian (offer)");
            viewQue();
        }
    }

    // fungsi poll()
    public static void poll() {
        if (isEmpty())
            System.out.println("Antrian kosong, tidak ada yang bisa dilayani");
        else {
            System.out.println(">> Melayani: " + que[0] + " (poll)");
            // geser antrian ke depan setelah data paling depan dilayani
            for (int i = 0; i < rear; i++) {
                que[i] = que[i + 1];
            }
            rear = rear - 1;
            viewQue();
        }
    }

    public static void viewQue() {
        System.out.print("Antrian saat ini: [");
        for (int i = 0; i <= rear; i++) {
            System.out.print(que[i]);
            if (i < rear) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}