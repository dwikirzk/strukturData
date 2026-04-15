package Tugas;

public class arrayMin {
  public static void main(String[] args) {
    int[] x = { 12, 1, 90, 17 };
    int min = x[0];
    for (int i = 1; i < x.length; i++) {
      if (x[i] < min) {
        min = x[i];
      }
    }
    System.out.println();
    System.out.println("Nilai minimum: " + min);
  }
}