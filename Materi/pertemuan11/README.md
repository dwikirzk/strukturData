# Pertemuan 11: Struktur Data Queue (Antrian)

Repository ini berisi implementasi struktur data **Queue (Antrian)** menggunakan bahasa pemrograman Java dengan media _Array_. Penjelasan di bawah ini berfokus pada logika dasar serta mekanisme pergeseran data pada operasi `enqueue` dan `dequeue`.

---

## 📌 Konsep Dasar Queue (FIFO)

**Queue** adalah struktur data linier yang bekerja berdasarkan prinsip **FIFO (First In, First Out)**. Elemen yang pertama kali dimasukkan ke dalam antrian akan menjadi elemen yang pertama kali dikeluarkan.

Dalam implementasi berbasis array ini, kita menggunakan tiga variabel kunci untuk mengontrol antrian:

1. `que[]`: Array statis yang berfungsi sebagai tempat penyimpanan elemen antrian.
2. `size`: Kapasitas maksimum dari array (pada kode ini bernilai `4`).
3. `rear`: Indeks penunjuk posisi elemen **paling belakang** di dalam antrian. Ketika antrian kosong, `rear` diinisialisasi dengan nilai `-1`.

---

## 📥 Logika Operasi Enqueue (Masuk Antrian)

Operasi `enqueue` digunakan untuk memasukkan data baru ke dalam antrian. Data selalu dimasukkan dari posisi belakang (_rear_).

### Alur Logika:

1. **Validasi Kapasitas (`isFull`)**: Program memeriksa apakah antrian sudah penuh dengan kondisi `if (rear == size - 1)`. Jika `rear` sudah mencapai indeks maksimum (dalam kasus ini indeks `3`), maka data baru tidak dapat dimasukkan.
2. **Penunjuk (`rear = rear + 1`)**: Jika masih ada ruang, posisi penunjuk `rear` digeser satu indeks ke kanan.
3. **Penyimpanan Data**: Data baru (`x`) dimasukkan ke dalam array pada indeks `rear` yang baru (`que[rear] = x`).

### Visualisasi Perubahan Posisi `rear`:

- Antrian Kosong: `rear = -1`
- Enqueue(4) → `rear` naik menjadi `0`, `que[0] = 4`
- Enqueue(5) → `rear` naik menjadi `1`, `que[1] = 5`

---

## 📤 Logika Operasi Dequeue (Keluar Antrian)

Operasi `dequeue` digunakan untuk mengeluarkan data dari antrian. Sesuai prinsip FIFO, data yang dikeluarkan selalu data yang berada di posisi **paling depan**, yaitu indeks `0` (`que[0]`).

Tantangan utama dalam implementasi array statis ini adalah ketika elemen di indeks `0` keluar, terjadi "kekosongan" di bagian depan. Oleh karena itu, diperlukan **logika pergeseran elemen (shifting)**.

### Alur Logika:

1. **Validasi Isi (`isEmpty`)**: Program memeriksa apakah antrian kosong melalui kondisi `if (rear == -1)`. Jika kosong, operasi dihapus karena tidak ada data yang bisa dikeluarkan.
2. **Pengambilan Data Terdepan**: Data pada indeks `que[0]` diambil atau ditampilkan sebagai data yang keluar.
3. **Pergeseran Elemen (_Shifting Loop_)**:
   ```java
   for (int i = 0; i < rear; i++) {
       que[i] = que[i + 1];
   }
### Output Program
![alt text](image.png)
