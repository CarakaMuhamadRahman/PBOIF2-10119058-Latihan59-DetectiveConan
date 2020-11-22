/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119058.latihan59.detectiveconan;

/**
 *
 * @author 
 * NAMA     : Caraka Muhamad Rahman
 * KELAS    : PBOIF2
 * NIM      : 10119058
 * Deskripsi Program : Program ini berisi program untuk menampilkan biodata 
 *                     karakter dalam anime detective conan.Karakter
 */
public class Karakter {
    protected String profesi;
    protected String kelemahan;
    protected String namaAyah;
    protected String wanitaYangDisukai;
    protected String hobi;
    
    public Karakter(String profesi, String kelemahan, String namaAyah, String wanitaYangDisukai, String hobi) {
        this.profesi = profesi;
        this.kelemahan = kelemahan;
        this.namaAyah = namaAyah;
        this.wanitaYangDisukai = wanitaYangDisukai;
        this.hobi = hobi;
    }
    public void tampilHasil(){
        System.out.println("Profesi             : "+profesi);
        System.out.println("Hobi                : "+hobi);
        System.out.println("Kelemahan           : "+kelemahan);
        System.out.println("Nama Ayah           : "+namaAyah);
        System.out.println("Wanita yang Disukai : "+wanitaYangDisukai);
    }
}
