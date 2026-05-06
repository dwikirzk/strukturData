# 🌀 UTS: Implementasi Deret Fibonacci dengan Rekursi
## 👤 Identitas

- **Nama:** [Mohamad Dwiki Rozak]
- **NIM:** [25161562021]
- **Kelas:** [ INF 2A]

---
Proyek ini merupakan tugas Ujian Tengah Semester (UTS) yang mengimplementasikan perhitungan deret Fibonacci menggunakan metode **Fungsi Rekursif** dalam bahasa pemrograman Java.

---

## 📖 Materi: Rekursi (Recursion)

### Komponen Rekursi dalam Kode:
1.  **Base Case (Kondisi Dasar):** Jika `n == 0` atau `n == 1`, fungsi berhenti memanggil dirinya sendiri dan mengembalikan nilai langsung.
2.  **Recursive Step (Langkah Rekursif):** Jika `n > 1`, fungsi akan memanggil `fibonacci(n-1)` dan `fibonacci(n-2)` secara terus-menerus hingga mencapai *Base Case*.

---

## 🛠️ Penjelasan Kode Program

Program ini terdiri dari dua bagian utama:

### 1. Metode `fibonacci(int n)`
Fungsi ini bertanggung jawab menghitung nilai suku ke-n secara matematis. 
- Input `0` menghasilkan `0`.
- Input `1` menghasilkan `1`.
- Input `n` menghasilkan jumlahan dua suku sebelumnya.

### 2. Metode `main` (Alur Program)
- **Input User:** Menggunakan `Scanner` untuk menerima input jumlah suku dari pengguna.
- **Looping:** Menggunakan `for loop` dari `0` hingga `n` untuk mencetak deret satu per satu sehingga membentuk urutan deret Fibonacci di layar konsol.

---

## 📊 Contoh Output
Jika pengguna memasukkan angka `5`, maka program akan memproses:
- Suku 0: 0
- Suku 1: 1
- Suku 2: (1+0) = 1
- Suku 3: (1+1) = 2
- Suku 4: (2+1) = 3
- Suku 5: (3+2) = 5

**Hasil di Konsol:** `0 1 1 2 3 5`

---
