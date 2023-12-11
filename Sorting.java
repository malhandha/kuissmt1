class Barang {
    String nama;
    int harga;

    public Barang(String nama, int harga) {
        this.nama = nama;
        this.harga = harga;
    }
}

public class Sorting {
    public static void main(String[] args) {
        Barang[] barang = {
                new Barang("Laptop", 12000000),
                new Barang("Smartphone", 8000000),
                new Barang("Kamera", 15000000),
                new Barang("TV", 10000000)
        };

        // Mengurutkan barang berdasarkan harga tertinggi
        bubbleSortByHighestPrice(barang);
        System.out.println("Urut berdasarkan harga tertinggi:");
        printBarang(barang);

        // Mengurutkan barang berdasarkan harga terendah
        bubbleSortByLowestPrice(barang);
        System.out.println("Urut berdasarkan harga terendah:");
        printBarang(barang);

        // Mengurutkan barang berdasarkan abjad
        bubbleSortByAlphabet(barang);
        System.out.println("Urut berdasarkan abjad:");
        printBarang(barang);
    }

    // Bubble Sort untuk mengurutkan berdasarkan harga tertinggi
    static void bubbleSortByHighestPrice(Barang[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j].harga < arr[j + 1].harga) {
                    // Swap
                    Barang temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Bubble Sort untuk mengurutkan berdasarkan harga terendah
    static void bubbleSortByLowestPrice(Barang[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j].harga > arr[j + 1].harga) {
                    // Swap
                    Barang temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Bubble Sort untuk mengurutkan berdasarkan abjad
    static void bubbleSortByAlphabet(Barang[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j].nama.compareTo(arr[j + 1].nama) > 0) {
                    // Swap
                    Barang temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Fungsi untuk menampilkan data barang
    static void printBarang(Barang[] arr) {
        for (Barang b : arr) {
            System.out.println("Nama: " + b.nama + ", Harga: " + b.harga);
        }
        System.out.println();
    }
}
