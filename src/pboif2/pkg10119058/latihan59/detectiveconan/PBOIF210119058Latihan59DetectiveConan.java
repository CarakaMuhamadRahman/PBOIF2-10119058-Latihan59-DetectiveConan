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
 *                     karakter dalam anime detective conan.
 */
public class PBOIF210119058Latihan59DetectiveConan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ShinichiKudo objShinichiKudo = new ShinichiKudo("Detektif", "Bernyanyi", "Yusaku Kudo", "Ran Mouri", "Sepak bola dan olahraga lainnya");
        objShinichiKudo.setNama("Shinichi Kudo");
        KaitoKid objKaitoKid = new KaitoKid("Pesulap, Pencuri baik hati", "Takut ikan", "Touchi Kuroba", "Aoko Nakamori", "Bermain papan ski");
        objKaitoKid.setNama("Kaito Kuroba");
        
        System.out.println("======Karakter Dalam Anime Detective Conan======");
        System.out.println("Nama                : " + objShinichiKudo.getNama());
        objShinichiKudo.tampilHasil();
        System.out.println("-------------------------------------------------------");
        System.out.println("Nama                : " + objKaitoKid.getNama());
        objKaitoKid.tampilHasil();
    }
    
}

