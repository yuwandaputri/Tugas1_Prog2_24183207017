/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
public class MainClass {
    public static void main(String[] args) {
     Buku buku1 = new Buku();
        buku1.judul = "0 MDPL";
        buku1.penulis = "Nurwina Sari";
        buku1.harga = "Rp 105.000";
        buku1.isbn = "9786233103190";
        buku1.penerbit = "Romancius";
        buku1.tahunTerbit = 2025;
        buku1.halaman = "300 Halaman";
        
        Buku buku2 = new Buku();
        buku2.judul = "Bandung After Rain";
        buku2.penulis = "Wulan Nur Amalia";
        buku2.harga = "Rp99.000";
        buku2.isbn = "9786231031433";
        buku2.penerbit = "Black Swan Books";
        buku2.tahunTerbit = 2024;
        buku2.halaman = "284 Halaman";
        
        System.out.println("==========Data Buku 1==========");
        buku1.tampilkanData();
        System.out.println(" ");
        System.out.println("==========Data Buku 2==========");
        buku2.tampilkanData();
    }
    
}
