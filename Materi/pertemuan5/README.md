# 🫧 Materi Pertemuan 5: Algoritma Bubble Sort

File `bubbleSort.java` ini berisi implementasi algoritma pengurutan dasar bernama **Bubble Sort**. Algoritma ini merupakan salah satu metode pengurutan paling sederhana yang bekerja dengan cara membandingkan elemen yang berdekatan secara berulang.

---

## 💡 Konsep Bubble Sort

Disebut "Bubble" (Gelembung) karena elemen dengan nilai terbesar akan perlahan-lahan "naik" atau berpindah ke posisi paling akhir (seperti gelembung sabun yang naik ke permukaan air).



### Mekanisme Kerja:
1. **Perbandingan Tetangga:** Algoritma membandingkan dua elemen yang berdampingan (misal: indeks `b` dan `b + 1`).
2. **Kondisi Penukaran (Swap):** Jika elemen di sebelah kiri lebih besar daripada elemen di sebelah kanan (`x[b] > x[b+1]`), maka posisi keduanya ditukar.
3. **Iterasi:** Proses ini diulangi terus-menerus hingga seluruh array berada dalam urutan yang benar (Ascending).

---

## 🛠️ Analisis Kode

Pada implementasi di file ini:
- **Array Input:** `{ 9, 8, 7, 5, 4 }` (Kondisi terburuk karena urutannya terbalik).
- **Variabel `temp`:** Digunakan sebagai wadah penyimpanan sementara saat melakukan proses *swap* (penukaran) agar data tidak tertimpa.
- **Output Visual:** Kode mencetak kondisi array setelah setiap perbandingan menggunakan simbol `|` sebagai pembatas, sehingga kita bisa melihat proses pergerakan angka secara bertahap.

---

## 🎯 Tujuan Pembelajaran

Mempelajari Bubble Sort membantu kita memahami:
1. **Efisiensi Algoritma:** Bagaimana perulangan dan percabangan bekerja bersama untuk mengelola data dalam jumlah banyak.
2. **Logika Penukaran:** Memantapkan pemahaman mengenai manipulasi indeks array yang telah dipelajari di pertemuan sebelumnya.
3. **Kompleksitas Waktu:** Menyadari bahwa pengurutan memerlukan proses komputasi yang akan semakin berat seiring bertambahnya jumlah data.

---

## 🚀 Cara Menjalankan
1. Compile file:
   ```bash
   javac Materi/pertemuan5/bubbleSort.java