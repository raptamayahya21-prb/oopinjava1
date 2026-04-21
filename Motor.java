class Motor {
    // Field
    String merk;
    int cc;

    // Constructor untuk inisialisasi
    Motor(String merk, int cc) {
        this.merk = merk;
        this.cc = cc;
    }

    // Method start
    void start() {
        System.out.println("Motor " + this.merk + " dinyalakan!");
    }
}

