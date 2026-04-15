# 📘 Program Sorting Data Mahasiswa (Java)

## 📝 Deskripsi

Program ini dibuat menggunakan bahasa pemrograman Java untuk mengurutkan data mahasiswa berdasarkan nilai.
Data yang digunakan terdiri dari **nama, NPM, dan nilai**.

Program mengimplementasikan 3 algoritma sorting dasar, yaitu:

- Bubble Sort
- Insertion Sort
- Selection Sort

Hasil pengurutan ditampilkan dari **nilai terbesar ke terkecil (descending)**.

---

## 🎯 Tujuan

- Memahami konsep dasar algoritma sorting
- Membandingkan cara kerja 3 metode sorting
- Melatih penggunaan array dan object dalam Java

---

## 📊 Struktur Data

Setiap data mahasiswa disimpan dalam class:

```java
class Mahasiswa {
    String nama;
    String npm;
    int nilai;
}
```

---

## 🔄 Algoritma yang Digunakan

### 1. Bubble Sort

- Membandingkan dua data bersebelahan
- Menukar jika urutan salah
- Perulangan sampai data terurut

### 2. Insertion Sort

- Mengambil satu data (key)
- Membandingkan dengan data sebelumnya
- Menyisipkan di posisi yang tepat

### 3. Selection Sort

- Mencari nilai terbesar
- Menempatkan di posisi awal
- Mengulang untuk sisa data

---

## 📥 Data Awal

Contoh data yang digunakan:

| Nama           | NPM       | Nilai |
| -------------- | --------- | ----- |
| Andi Saputra   | 220101001 | 78    |
| Budi Santoso   | 220101002 | 85    |
| Joko Iskandar  | 220101003 | 90    |
| Dedi Kurniawan | 220101004 | 70    |
| Eka Putri      | 220101005 | 88    |
| Fajar Nugroho  | 220101006 | 65    |
| Dwiki Rozak    | 220101007 | 92    |
| Hadi Wijaya    | 220101008 | 75    |
| Intan Sari     | 220101009 | 80    |
| Syafira Ainun  | 220101010 | 87    |

---

## 📤 Output Program

Program akan menampilkan:

1. Data awal (acak)
2. Hasil pengurutan dengan:
   - Bubble Sort
   - Insertion Sort
   - Selection Sort

Semua hasil ditampilkan dalam urutan **descending (nilai tertinggi ke terendah)**.

---

## 👨‍💻 Penulis

Nama: _Mohamad Dwiki Rozak_
NPM: _25161562021_
Mata Kuliah: Struktur Data

---
