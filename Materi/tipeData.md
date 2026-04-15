# 📑 Dokumentasi Materi: Tipe Data (Primitif & Non-Primitif)

Repositori ini berisi penjelasan mendalam dan implementasi kode mengenai klasifikasi tipe data dalam pemrograman Java. Memahami tipe data adalah langkah awal yang krusial dalam mempelajari **Struktur Data** dan manajemen memori.

---

## 📌 1. Tipe Data Primitif (Primitive Types)

Tipe data primitif adalah tipe data dasar yang sudah terdefinisi secara bawaan oleh bahasa pemrograman. Nilainya disimpan secara langsung dalam memori **Stack**.

### Karakteristik Utama:

- **Predefined**: Sudah disediakan oleh Java.
- **Fixed Size**: Memiliki ukuran memori yang tetap.
- **Tidak Memiliki Method**: Tidak bisa memanggil fungsi (seperti `.length()`).
- **Default Value**: Selalu memiliki nilai awal (tidak bisa `null`).

### Klasifikasi Tipe Data Primitif:

| Kategori             | Tipe Data | Ukuran  | Deskripsi                                |
| :------------------- | :-------- | :------ | :--------------------------------------- |
| **Bilangan Bulat**   | `byte`    | 1 byte  | Range: -128 s/d 127                      |
|                      | `short`   | 2 bytes | Range: -32,768 s/d 32,767                |
|                      | `int`     | 4 bytes | Standar bilangan bulat                   |
|                      | `long`    | 8 bytes | Bilangan bulat besar (akhiri dengan 'L') |
| **Bilangan Desimal** | `float`   | 4 bytes | Presisi tunggal (akhiri dengan 'f')      |
|                      | `double`  | 8 bytes | Presisi ganda (standar desimal Java)     |
| **Karakter**         | `char`    | 2 bytes | Menyimpan satu karakter Unicode          |
| **Logika**           | `boolean` | 1 bit   | Nilai `true` atau `false`                |

---

## 📌 2. Tipe Data Non-Primitif (Reference Types)

Tipe data non-primitif (atau tipe referensi) merujuk pada **objek**. Variabelnya tidak menyimpan nilai secara langsung, melainkan menyimpan **alamat memori** tempat data tersebut berada di dalam **Heap**.

### Karakteristik Utama:

- **User Defined**: Dapat dibuat oleh programmer (kecuali `String`).
- **Nullable**: Dapat bernilai `null`.
- **Memiliki Method**: Dapat menjalankan operasi tertentu (objek-orientasi).
- **Ukuran Dinamis**: Ukuran data bisa bervariasi.

### Contoh Utama:

1. **String**: Kumpulan karakter yang dianggap sebagai objek.
2. **Array**: Struktur yang menyimpan banyak elemen dengan tipe yang sama.
3. **Class/Interface**: Struktur data kompleks yang mendefinisikan perilaku objek.

---

## 🔄 3. Perbandingan

| Fitur             | Tipe Primitif                | Tipe Non-Primitif                        |
| :---------------- | :--------------------------- | :--------------------------------------- |
| **Lokasi Memori** | Stack                        | Heap (Variabel di Stack merujuk ke Heap) |
| **Method**        | Tidak tersedia               | Tersedia banyak method bawaan            |
| **Nilai Default** | `0`, `false`, `\u0000`       | `null`                                   |
| **Kecepatan**     | Lebih Cepat (Akses langsung) | Sedikit lebih lambat (Akses alamat)      |
| **Penulisan**     | Huruf kecil (`int`, `char`)  | Huruf kapital (`String`, `Integer`)      |
