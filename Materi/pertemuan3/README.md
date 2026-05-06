# 📂 Materi Pertemuan 3: Manipulasi Array & Operasi Swap

File `arrayAndSwap.java` dalam direktori ini berfokus pada penggunaan **Array 1 Dimensi** di Java, khususnya mengenai cara mengakses indeks, menukar nilai antar elemen (*swapping*), dan menampilkan seluruh isi array (*traversal*).

---
## 💡 Konsep Utama

### 1. Struktur Data Array
Array adalah kumpulan variabel dengan tipe data yang sama yang diakses melalui satu nama yang sama. Setiap elemen diidentifikasi menggunakan **indeks** yang selalu dimulai dari `0`.

### 2. Algoritma Penukaran (Swapping)
Untuk menukar dua nilai dalam array, kita memerlukan variabel bantuan (temp) agar nilai asli tidak tertimpa dan hilang.
*   **Langkah 1:** Simpan nilai `x[i]` ke variabel sementara `a`.
*   **Langkah 2:** Isi `x[i]` dengan nilai `x[j]`.
*   **Langkah 3:** Isi `x[j]` dengan nilai dari variabel `a`.

### 3. Iterasi / Traversal
Proses mengunjungi setiap elemen array menggunakan perulangan `for`. Kondisi perhentian perulangan didasarkan pada properti `.length` dari array tersebut untuk menghindari `ArrayIndexOutOfBoundsException`.

---
## 🛠️ Analisis Kode

Pada latihan ini, program melakukan manipulasi terhadap array integer:
1.  **Inisialisasi:** Array `x` didefinisikan dengan nilai `{32, 12, 20, 83, 44}`.
2.  **Operasi Swap:** Program menukar nilai pada **indeks pertama (0)** dengan nilai pada **indeks terakhir (4)**.
    *   Sebelum: `[32, 12, 20, 83, 44]`
    *   Sesudah: `[44, 12, 20, 83, 32]`
3.  **Output:** Menggunakan perulangan untuk mencetak kondisi terbaru dari array setelah proses penukaran selesai.

---

## 🎯 Tujuan Pembelajaran

Latihan ini dirancang untuk:
*   Memahami mekanisme penyimpanan data di memori menggunakan Array.
*   Melatih ketelitian dalam penggunaan indeks array agar tidak terjadi kesalahan logika (seperti *looping* yang tidak berjalan).
*   Menguasai teknik dasar manipulasi data yang nantinya akan digunakan dalam algoritma pengurutan (*Sorting*).

---

## 📜 Lisensi
Dikembangkan untuk keperluan akademik di bawah **MIT License**.