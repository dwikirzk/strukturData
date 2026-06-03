// NIM      : 25161562021
// Nama     : Mohamad Dwiki Rozak
// Tanggal  : 01/06/2026
// Soal     : Soal 3
package UAS;

public class stack {
    static int size = 4;
    static int[] stack = new int[size];
    static int top = -1;

    public static void main(String[] args) {
        push(10);
        push(20);
        push(30);
        // tampilkan elemen paling atas dengan peek()
        peek();
        // mengambil elemen teratas
        pop();
        push(40);

        System.out.print("Isi stack akhir -> ");
        tampilIsi();
    }

    public static boolean isFull() {
        if (top == size - 1) {
            return true;
        } else {
            return false;
        }
    }

    public static void push(int x) {
        if (isFull()) {
            System.err.println("Maaf penuh");
        } else {
            top = top + 1;
            stack[top] = x;
            System.out.print("Setelah push(" + x + ") : ");
            tampilIsi();
        }
    }

    public static void tampilIsi() {
        System.out.print("[");
        for (int i = 0; i <= top; i++) {
            System.out.print(stack[i]);
            if (i < top) {
                System.out.print(", "); // agar output memakai koma
            }
        }
        System.out.println("]");
    }

    public static boolean isEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public static void pop() {
        if (isEmpty()) {
            System.out.println("Zonk");
        } else {
            top = top - 1;
            System.out.print("Setelah pop()    : ");
            tampilIsi();
        }
    }

    public static void peek() {
        if (isEmpty()) {
            System.out.println("Stack Kosong");
        } else {
            System.out.println("Peek             : " + stack[top]);
        }
    }
}