package Materi.pertemuan2;

public class rekursif1 {
  public static void main(String[] args) {
    int n = 5;
    int x = 3;
    fungsi(n, x);

  }

  public static int fungsi(int n, int x) {
    if (x == 0) {
      System.out.println("f(" + n + ")");
      return 3;
    } else {
      System.out.println("2*f((" + (n - 1) + ")+4");
      return n * fungsi(n, x - 1);
    }
  }
}