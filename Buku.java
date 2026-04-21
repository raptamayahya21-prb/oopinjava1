// 1. Mendefinisikan Class Restoran
class Restoran {
    // Field (Atribut)
    String nama;
    double rating;

    // 2. Constructor dengan parameter
    Restoran(String nama, double rating) {
        // Menggunakan 'this' untuk membedakan field class dan parameter
        this.nama = nama;
        this.rating = rating;
    }

    // 3. Method untuk mencetak detail
    void infoRestoran() {
        System.out.println("Nama Restoran: " + this.nama);
        System.out.println("Rating       : " + this.rating + " / 5.0");
        System.out.println("------------------------------");
    }
}

// Class Main untuk menjalankan program
public class Main {
    public static void main(String[] args) {
        
        // 4. Instansiasi 2 Object berbeda
        Restoran restoA = new Restoran("Warung Padang Sederhana", 4.8);
        Restoran restoB = new Restoran("Sushi Tei", 4.5);

        // Memanggil method untuk masing-masing object
        System.out.println("=== DAFTAR RESTORAN ===");
        restoA.infoRestoran();
        restoB.infoRestoran();
    }
}