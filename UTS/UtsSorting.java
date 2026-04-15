package UTS;

class Mahasiswa {
    String nama;
    String npm;
    int nilai;

    Mahasiswa(String nama, String npm, int nilai) {
        this.nama = nama;
        this.npm = npm;
        this.nilai = nilai;
    }
}

public class UtsSorting {
    // Menampilkan data
    static void tampil(Mahasiswa[] data) {
        for (Mahasiswa m : data) {
            System.out.println(m.nama + " | " + m.npm + " | " + m.nilai);
        }
        System.out.println();
    }

    // Bubble Sort
    static void bubbleSort(Mahasiswa[] data) {
        for (int i = 0; i < data.length - 1; i++) {
            for (int j = 0; j < data.length - i - 1; j++) {
                if (data[j].nilai < data[j + 1].nilai) { // dibalik
                    Mahasiswa temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }
        }
    }

    // Insertion Sort
    static void insertionSort(Mahasiswa[] data) {
        for (int i = 1; i < data.length; i++) {
            Mahasiswa key = data[i];
            int j = i - 1;

            while (j >= 0 && data[j].nilai < key.nilai) { // dibalik
                data[j + 1] = data[j];
                j--;
            }
            data[j + 1] = key;
        }
    }

    // Selection Sort
    static void selectionSort(Mahasiswa[] data) {
        for (int i = 0; i < data.length - 1; i++) {
            int maxIndex = i; // cari terbesar

            for (int j = i + 1; j < data.length; j++) {
                if (data[j].nilai > data[maxIndex].nilai) { // dibalik
                    maxIndex = j;
                }
            }
            Mahasiswa temp = data[maxIndex];
            data[maxIndex] = data[i];
            data[i] = temp;
        }
    }

    // Copy array agar data asli tidak berubah
    static Mahasiswa[] copyArray(Mahasiswa[] data) {
        Mahasiswa[] copy = new Mahasiswa[data.length];
        for (int i = 0; i < data.length; i++) {
            copy[i] = new Mahasiswa(data[i].nama, data[i].npm, data[i].nilai);
        }
        return copy;
    }

    public static void main(String[] args) {

        // Data awal (acak)
        Mahasiswa[] data = {
                new Mahasiswa("Andi Saputra", "220101001", 78),
                new Mahasiswa("Budi Santoso", "220101002", 85),
                new Mahasiswa("Joko Iskandar", "220101003", 90),
                new Mahasiswa("Dedi Kurniawan", "220101004", 70),
                new Mahasiswa("Eka Putri", "220101005", 88),
                new Mahasiswa("Fajar Nugroho", "220101006", 65),
                new Mahasiswa("Dwiki Rozak", "220101007", 92),
                new Mahasiswa("Hadi Wijaya", "220101008", 75),
                new Mahasiswa("Intan Sari", "220101009", 80),
                new Mahasiswa("Syafira Ainun", "220101010", 87)
        };

        System.out.println("=== DATA AWAL ===");
        tampil(data);

        // Bubble Sort
        Mahasiswa[] bubble = copyArray(data);
        bubbleSort(bubble);
        System.out.println("=== HASIL BUBBLE SORT ===");
        tampil(bubble);

        // Insertion Sort
        Mahasiswa[] insertion = copyArray(data);
        insertionSort(insertion);
        System.out.println("=== HASIL INSERTION SORT ===");
        tampil(insertion);

        // Selection Sort
        Mahasiswa[] selection = copyArray(data);
        selectionSort(selection);
        System.out.println("=== HASIL SELECTION SORT ===");
        tampil(selection);
    }
}