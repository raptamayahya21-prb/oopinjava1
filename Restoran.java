class Restoran {
    // 1. Field (Atribut)
    String nama;
    double rating;

    // 2. Constructor dengan parameter
    Restoran(String nama, double rating) {
        this.nama = nama;
        this.rating = rating;
    }

    // 3. Method infoRestoran()
    void infoRestoran() {
        System.out.println("Nama Restoran: " + this.nama);
        System.out.println("Rating       : " + this.rating + " / 5.0");
        System.out.println("------------------------------");
    }
}
