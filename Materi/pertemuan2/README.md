# 📑 Algoritma Nested Loop & Pattern Drawing

Direktori ini memuat implementasi Java (`nestedLoopPattern.java`) yang berfokus pada penguasaan **Perulangan Bersarang (Nested Loop)**. Melalui kombinasi instruksi `for` dan kendali `if-else`, kode ini mendemonstrasikan bagaimana logika pemrograman dapat ditransformasikan menjadi bentuk visual atau pola tertentu.

---

## 🧭 Mekanisme Kerja

Dalam latihan ini, kita memandang layar konsol sebagai sebuah koordinat kartesius atau matriks berukuran $n \times n$. 
- **Loop Baris (`i`)**: Mengontrol pergerakan kursor dari atas ke bawah.
- **Loop Kolom (`j`)**: Mengontrol pergerakan kursor dari kiri ke kanan pada setiap baris.

Logika utama terletak pada **Kondisi Percabangan**: Program akan mengevaluasi apakah koordinat $(i, j)$ saat ini memenuhi kriteria untuk mencetak simbol `"x"` atau harus dikosongkan dengan spasi `" "`.

---

## 🎨 Pola yang Diimplementasikan

Setiap blok perulangan dalam file ini dirancang untuk menghasilkan visualisasi yang berbeda:

Kode dalam proyek ini menggunakan karakter `'x'` untuk mencetak pola dan spasi `' '` untuk area kosong. Logika pembentukan huruf didasarkan pada kondisi `if-else`:

### 1. Huruf I
Logika utamanya adalah mencetak karakter hanya pada kolom tengah.
- **Kondisi:** `j == (n / 2) + 1`
- **Visual:** Garis lurus vertikal dari atas ke bawah.

### 2. Huruf N
Logika ini menggabungkan tiga kondisi garis:
- **Garis Kiri:** `j == 1`
- **Garis Kanan:** `j == n`
- **Garis Diagonal:** `i == j` (mencetak saat indeks baris dan kolom sama).

### 3. Huruf F
Logika ini menggunakan kombinasi garis vertikal dan horizontal:
- **Garis Kiri:** `j == 1`
- **Garis Atas:** `i == 1`
- **Garis Tengah:** `i == (n / 2) + 1`

---
## 🎯 Tujuan Pembelajaran

Latihan "ASCII Art" ini bukan sekadar visualisasi sederhana, melainkan sarana untuk:
1.  **Analisis Ruang:** Mempertajam kemampuan pemetaan logika ke dalam sistem koordinat.
2.  **Struktur Kode:** Melatih kemahiran dalam menyusun kondisi `if-else` yang kompleks agar tetap efisien dan terbaca.
---

## 📜 Lisensi
Dikembangkan untuk keperluan akademik di bawah **MIT License**.