package Tugas.Task1SelectionSort;

public class selectionSort {
  public static void main(String[] args) {
    int[] x = { 20, 15, 90, 13, 26 };

    for (int i = 0; i < x.length - 1; i++) { // Loop untuk melakukan 4 kali iterasi
      int min = 999999;
      int index = i;

      for (int j = i; j < x.length; j++) { // Loop untuk mencari nilai terkecil
        if (x[j] < min) {
          min = x[j];
          index = j;
        }
      }

      // Proses Tukar (Swap)
      if (x[i] > x[index]) {
        int temp = 0;
        temp = x[i];
        x[i] = x[index];
        x[index] = temp;
      }

      // Cetak Hasil Array setelah ditukar
      for (int b = 0; b < x.length; b++) {
        System.out.print(x[b] + " ");
      }
      System.out.println();
    }
  }
}
// iterasi jumlah data -1 (data 5 berarti iterasi 4)