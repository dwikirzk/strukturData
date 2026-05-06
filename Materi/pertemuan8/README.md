# 🥞 Materi Pertemuan 8: Struktur Data Stack (Tumpukan)

File `Stack.java` ini berisi implementasi struktur data **Stack** menggunakan Array. Stack adalah koleksi objek yang menerapkan prinsip **LIFO (Last In, First Out)**, di mana data yang terakhir masuk akan menjadi data yang pertama kali keluar.

---

## 💡 Konsep Dasar Stack

Bayangkan sebuah tumpukan piring. Anda hanya bisa menambah piring baru ke bagian paling atas, dan jika ingin mengambil piring, Anda juga harus mengambil yang paling atas terlebih dahulu.

### Operasi Utama:
1. **Push:** Menambahkan elemen ke posisi paling atas (*top*).
2. **Pop:** Menghapus atau mengambil elemen dari posisi paling atas.
3. **isEmpty:** Memeriksa apakah tumpukan kosong.
4. **isFull:** Memeriksa apakah tumpukan sudah mencapai batas kapasitas (karena menggunakan array statis).

---

## 🛠️ Penjelasan Implementasi Kode

Dalam kode ini, kita menggunakan beberapa komponen penting:

### 1. Deklarasi Variabel
- `size = 4`: Menentukan kapasitas maksimal tumpukan.
- `stack[]`: Array yang digunakan untuk menyimpan data.
- `top = -1`: Indikator posisi data teratas. Dimulai dari `-1` karena array kosong dimulai sebelum indeks `0`.

### 2. Logika Fungsi Push
Sebelum menambah data, program memanggil `isFull()`. Jika `top` sudah mencapai `size - 1`, maka sistem menolak data baru ("Maaf penuh"). Jika belum, `top` akan naik (`+1`) dan data dimasukkan ke indeks tersebut.

### 3. Logika Fungsi Pop
Sebelum mengambil data, program memanggil `isEmpty()`. Jika `top` masih `-1`, maka tidak ada data untuk diambil ("Zonk"). Jika ada, program menampilkan data teratas, lalu menurunkan nilai `top` (`-1`) agar data tersebut tidak lagi dianggap bagian dari tumpukan.

### 4. Penelusuran (Tracing) di Main Method
Skenario dalam kode:
- Melakukan **Push** 4, 3, 5, 6 (Stack penuh).
- Mencoba **Push** 7 (Gagal karena penuh).
- Melakukan **Pop** 2 kali (Mengambil 6 dan 5).
- Melakukan **Push** 108 (Berhasil masuk karena ada ruang kosong setelah Pop).

---

## 🎯 Tujuan Pembelajaran

Mempelajari Stack membantu memahami:
- Cara kerja alokasi memori dinamis dan pemrosesan instruksi pada CPU.
- Manajemen data yang membutuhkan urutan kronologis terbalik.
- Pentingnya penanganan error (Overlow & Underflow) saat memanipulasi struktur data statis.

---

## 📜 Lisensi
Dikembangkan untuk keperluan akademik di bawah **MIT License**.