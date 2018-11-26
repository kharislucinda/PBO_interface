/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Program;

/**
 *
 * @author Alif Pratama
 */
 public class PersegiPanjang implements BangunDatar {
    private double panjang, lebar;
    
    public PersegiPanjang (double p, double l){
        panjang = p;
        lebar = l;
        
    }

    public double getPanjang() {
        return panjang;
    }

    public double getLebar() {
        return lebar;
    }
    

    @Override
    public double HitungLuas() {
        return (panjang*lebar);
        
    }

    @Override
    public double HitungKeliling() {
       return (2*(panjang+lebar));
    }

    @Override
    public String displayinfo() {
       return ( "Persegi Panjang"
               +"\no Panjang    : " + (float)getPanjang()
               +"\no Lebar    : " + (float)getLebar()
               +"\no Luas    : " + (float)HitungLuas()
               +"\no Keliling    : " + (float)HitungKeliling()
               );
               
    }
    
    
}
   
