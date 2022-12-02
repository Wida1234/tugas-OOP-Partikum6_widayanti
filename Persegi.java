/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangun_datar.bangundatar;

/**
 *
 * @author User
 */
public class Persegi extends BangunDatar{
    float panjang;
    float lebar;
    
    // Setter 
    public Persegi(int panjang, int lebar){
        this.panjang = panjang;
        this.lebar = lebar;
    }
    
    // Abstract
    public void gambar(){
        System.out.println("Menggambar Persegi");
    }
    
    public float luas(){
        return this.panjang * this.lebar;
    }
    
}