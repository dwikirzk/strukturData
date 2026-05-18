# 🔗 Materi Pertemuan 12: Struktur Data Tree (Binary Search Tree)

Struktur data **Tree** (Pohon) adalah struktur data _non-linear_ hierarkis yang terdiri dari elemen-elemen yang saling terhubung. Pada praktikum ini, kita secara spesifik mengimplementasikan **Binary Search Tree (BST)**, di mana setiap elemen (_node_) maksimal hanya dapat memiliki dua cabang anak (_left_ dan _right child_).

Aturan penempatan data pada BST:

- Nilai yang **lebih kecil** dari _node_ saat ini akan diletakkan di sebelah **kiri** (`left`).
- Nilai yang **lebih besar** dari _node_ saat ini akan diletakkan di sebelah **kanan** (`right`).

---

## 💡 Konsep Utama dan Operasi

Praktikum kali ini menggunakan struktur _node_ buatan sendiri (_custom implementation_) yang memiliki tiga atribut utama: `data` (nilai integer), `left` (referensi ke cabang kiri), dan `right` (referensi ke cabang kanan).

Operasi dasar yang dipraktikkan dalam kode antara lain:

- **`insert(data)`**: Menambahkan data baru ke dalam pohon secara rekursif sesuai aturan regulasi besar-kecil nilai BST.
- **`inorder()`** _(Kiri, Akar, Kanan)_: Menelusuri pohon dari cabang kiri, lalu mencetak data _node_, kemudian lanjut ke cabang kanan. Cara ini menghasilkan visualisasi data yang terurut dari kecil ke besar.
- **`preorder()`** _(Akar, Kiri, Kanan)_: Menelusuri pohon dengan mencetak data _node_ saat ini terlebih dahulu, lalu bergerak ke cabang kiri, dan dilanjutkan ke cabang kanan.
- **`postorder()`** _(Kiri, Kanan, Akar)_: Menelusuri pohon dari cabang kiri terlebih dahulu, pindah ke cabang kanan, dan terakhir mencetak data dari _node_ asal/akar tersebut.

---

## 🚀 Implementasi di Kode

Silakan jalankan file `tree.java` untuk melihat langsung penerapannya. Di dalam fungsi utama (`main`):

- Dibuat sebuah objek pohon baru bernama `bst`.
- Data dimasukkan secara bertahap dengan urutan angka: `50, 30, 20, 40, 70, 60, 80`.
- Program kemudian melakukan tiga metode penelusuran (_traversal_) berbeda (`inorder`, `preorder`, dan `postorder`) lalu mencetak susunan angka hasil dari masing-masing metode ke terminal.
