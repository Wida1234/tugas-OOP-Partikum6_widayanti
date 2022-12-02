/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangun_datar.bangundatar;

/**
 *
 * @author User
 */
public class Lingkaran extends BangunDatar {
    int r;
    
    // Setter
    public Lingkaran(int r){
        this.r = r;
    }
    
    // Abstract
    public void gambar(){
        System.out.println("Menggambar Lingkaran");
    }
    
    public float luas(){
        return(float)3.14 * this.r * this.r;
    }
    
}