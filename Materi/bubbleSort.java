package Materi;

public class bubbleSort {
  public static void main(String[] args) {
    int[] x = { 9, 8, 7, 5, 4 };

    for (int b = 0; b < x.length - 1; b++) {
      if (x[b] > x[b + 1]) {
        int temp = x[b];
        x[b] = x[b + 1];
        x[b + 1] = temp;
      }
      for (int i = 0; i < x.length; i++) {
        System.out.print(x[i] + "|");
      }
      System.out.println();
    }
  }
}