/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Nama : Mufida Anggradita
 * NIM : 22166010
 * Kelas : Sistem Informasi
 * Semester 3
 * Mata Kuliah : Pemrogaman Berorientasi Objek 1
 * LATIHAN 58
 */
class Bilangan {
    // Kelas Bilangan
    protected int x;
    protected int y;

    // Konstruktor Bilangan
    public Bilangan() {
        this.x = 0;
        this.y = 0;
    }

    // Metode getter untuk mendapatkan nilai x
    public int getX() {
        return x;
    }

    // Metode getter untuk mendapatkan nilai y
    public int getY() {
        return y;
    }
}

// Kelas JumlahBilangan yang merupakan turunan dari Bilangan
class JumlahBilangan extends Bilangan {
    // Metode untuk menampilkan hasil penjumlahan
    public void tampilHasilJumlah() {
        int jumlah = getX() + getY();
        System.out.println("Hasil penjumlahan: " + jumlah);
    }
}

// Kelas SelisihBilangan yang merupakan turunan dari Bilangan
class SelisihBilangan extends Bilangan {
    // Metode untuk menampilkan hasil selisih
    public void tampilSelisih() {
        System.out.println("Hasil selisih: " + getX() + " - " + getY() + " = " + (getX() - getY()));
    }
}

// Kelas Main untuk menjalankan progra
public class Lat58_TambahKurang {
    public static void main(String[] args) {
        // Membuat objek JumlahBilangan
        JumlahBilangan jumlahBilangan = new JumlahBilangan();

        // Mengatur nilai x dan y menggunakan metode dari kelas Bilangan
        jumlahBilangan.x = 3;
        jumlahBilangan.y = 4;

        // Menampilkan hasil penjumlahan menggunakan metode dari kelas JumlahBilangan
        jumlahBilangan.tampilHasilJumlah();

        // Membuat objek SelisihBilangan
        SelisihBilangan selisihBilangan = new SelisihBilangan();

        // Mengatur nilai x dan y menggunakan metode dari kelas Bilangan
        selisihBilangan.x = 3;
        selisihBilangan.y = 4;

        // Menampilkan hasil selisih menggunakan metode dari kelas SelisihBilangan
        selisihBilangan.tampilSelisih();
    }
}