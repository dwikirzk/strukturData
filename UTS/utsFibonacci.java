package UTS;
import java.util.Scanner;
public class utsFibonacci {

    // fungsi rekursif fibonacci
    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah suku Fibonacci: ");
        int n = input.nextInt();
        System.out.println("Deret Fibonacci hingga suku ke-" + n + " adalah:");

        for (int i = 0; i <= n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
        input.close();
    }
}

