# Pertemuan 12: Struktur Data LinkedList

Struktur data **LinkedList** merupakan tipe data *linear* yang penempatan elemennya tersebar di memori secara tidak berurutan. Komponen di dalamnya disebut sebagai **node**, di mana tiap *node* menyimpan objek data beserta sebuah referensi (*pointer*) yang menghubungkannya ke *node* selanjutnya.

## 💡 Konsep Utama dan Operasi (Java Built-in)
Pada sesi ini, kita langsung memakai *class* bawaan dari **Java Collections Framework**, yaitu `java.util.LinkedList`.

Beberapa fungsi dasar yang dipraktikkan pada kode meliputi:
- **`add(element)`**: Memasukkan data baru di posisi paling ujung akhir list.
- **`add(index, element)`**: Menyisipkan data baru pada posisi indeks yang diinginkan. Cara ini aman dari penimpaan karena data setelahnya akan bergeser secara otomatis.
- **`remove(index)`**: Mengeluarkan atau menghapus elemen dari indeks yang ditentukan.

## 🚀 Implementasi di Kode
Silakan jalankan file `Linkedlist.java` untuk melihat penerapannya. Di dalam kode tersebut:
- Dibuat sebuah `LinkedList` yang dikhususkan untuk objek `Integer`.
- Nilai `5, 6, 9, 7` dimasukkan sebagai data awal.
- Angka `4` disisipkan ke dalam posisi indeks ke-1 (`list.add(1, 4)`).
- Elemen yang menempati indeks ke-3 dihapus dari list (`list.remove(3)`).
- Susunan data terakhir ditampilkan pada terminal menggunakan perintah `System.out.println(list)`.