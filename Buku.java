/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
public class Buku {
    String judul;
    String penulis;
    String harga;
    String isbn;
    String penerbit;
    int tahunTerbit;
    String halaman;
    
    public void tampilkanData(){
        System.out.println("Judul : "+judul);
        System.out.println("Penulis : "+penulis);
        System.out.println("Harga : "+harga);
        System.out.println("ISBN : "+isbn);
        System.out.println("Penerbit : "+penerbit);
        System.out.println("Tahun Terbit : "+tahunTerbit);
        System.out.println("Halaman : "+halaman);
    }
}
