/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package bangun_datar.bangundatar;

/**
 *
 * @author User
 */
public abstract class BangunDatar {
    String warna;
    
    // Setter
    public void setWarna(String warna){
        this.warna = warna;
    }
    
    // Getter
    public String getWarna(){
        return this.warna;
    }
    
    // Abstract
    public abstract void gambar();
    public abstract float luas();
}
