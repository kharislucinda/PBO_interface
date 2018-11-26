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
public class Persegi implements BangunDatar {
    private double sisi;

    public double getSisi() {
        return sisi;
    }
    
    public Persegi (double s){
        sisi=s;
        
    }

    
    

    @Override
    public double HitungLuas() {
        return (sisi*sisi);
        
    }

    @Override
    public double HitungKeliling() {
       return (4*sisi);
    }

    @Override
    public String displayinfo() {
       return ( "Persegi"
               +"\no Panjang    : " + (float)getSisi()
               +"\no Luas    : " + (float)HitungLuas()
               +"\no Keliling    : " + (float)HitungKeliling()
               );
               
    }
    
    
}