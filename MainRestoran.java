public class MainRestoran {
    public static void main(String[] args) {
        
        // 4. Instansiasi 2 object berbeda
        Restoran resto1 = new Restoran("Bakso Mercon", 4.7);
        Restoran resto2 = new Restoran("Cafe Senja", 4.2);

        // Memanggil method masing-masing object
        System.out.println("=== INFO DAFTAR RESTORAN ===");
        resto1.infoRestoran();
        resto2.infoRestoran();
    }
}
