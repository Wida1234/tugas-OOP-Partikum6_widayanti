/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangun_datar.bangundatar;

/**
 *
 * @author User
 */
public class Segitiga extends BangunDatar {
    int alas;
    int tinggi;
    
    
    // Setter
    public Segitiga(int alas, int tinggi){
        this.alas = alas;
        this.tinggi = tinggi;
    }
    
    // Abstract
    public void gambar(){
        System.out.println("Menggambar Segitiga");
    }
    
    public float luas(){
        return this.alas * this.tinggi;
    }
    
}
