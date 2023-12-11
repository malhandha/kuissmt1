import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Barang {

     String nama;

     public Barang(String nama) {
          this.nama = nama;
     }
}

class PencarianBarang {
     List<Barang> daftarBarang;
     public PencarianBarang() {
          daftarBarang = new ArrayList<>();
     }

     public void tambahBarang(Barang barang) {
          daftarBarang.add(barang);
     }

     public List<Barang> cariBarang(String kataKunci) {
          List<Barang> hasilPencarian = new ArrayList<>();
          for (Barang barang : daftarBarang) {
               if (barang.nama.toLowerCase().contains(kataKunci.toLowerCase())) {
                    hasilPencarian.add(barang);
               }
          }
          return hasilPencarian;
     }
}

public class ProgramPencarianBarang {

     public static void main(String[] args) {
          PencarianBarang pencarianBarang = new PencarianBarang();
          // Menampilkan daftar baang
          System.out.println("Daftar Barang : ");
          System.out.println("1. Laptop");
          System.out.println("2. Mouse");
          System.out.println("3. Keyboard");
          System.out.println("4. Motherboard");
          System.out.println("5. Graphic Card");
          System.out.println("6. Power Supply");
          System.out.println("7. harddisk");
          System.out.println("8. CPU");
          System.out.println("9. RAM");
          
          // Contoh penambahan barang ke dalam daftar
          pencarianBarang.tambahBarang(new Barang("Laptop"));
          pencarianBarang.tambahBarang(new Barang("Mouse"));
          pencarianBarang.tambahBarang(new Barang("Keyboard"));
          pencarianBarang.tambahBarang(new Barang("Monitor"));
          pencarianBarang.tambahBarang(new Barang("Motherboard"));
          pencarianBarang.tambahBarang(new Barang("Graphic Card"));
          pencarianBarang.tambahBarang(new Barang("Power Supply"));
          pencarianBarang.tambahBarang(new Barang("Harddisk"));
          pencarianBarang.tambahBarang(new Barang("CPU"));
          pencarianBarang.tambahBarang(new Barang("RAM"));

          // Menerima input kata kunci dari pengguna
          Scanner scanner = new Scanner(System.in);
          System.out.print("Masukkan kata kunci: ");
          String kataKunci = scanner.nextLine();

          // Melakukan pencarian barang
          List<Barang> hasilPencarian = pencarianBarang.cariBarang(kataKunci);

          // Menampilkan hasil pencarian
          if (!hasilPencarian.isEmpty()) {
               System.out.println("Hasil Pencarian:");
               for (Barang barang : hasilPencarian) {
                    System.out.println(barang.nama);
               }
          } else {
               System.out.println("Barang tidak ditemukan.");
          }
     }
}
