package Materi;

public class fungsiRekursif {
  public static void main(String[] args) {
    int n = 4;
    System.out.println("Hasil = " + fungsi(n));
  }

  public static int fungsi(int n) {
    if (n == 0) { // if (n==1) {
      System.out.println("f(" + n + ")"); // return 1; (dihapus diganti ini)
      return 3;
    } else {
      System.out.println("2*f((" + (n - 1) + ")+4"); // dihapus
      return 2 * fungsi(n - 1) + 4; // return n *fungsi(n-1);
    }
  }
}