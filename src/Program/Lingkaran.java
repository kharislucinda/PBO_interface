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
public class Lingkaran implements BangunDatar {
    private double jari;

    public double getJari() {
        return jari;
    }
    private double phi=3.14;

    public Lingkaran(double jari) {
        this.jari = jari;
    }
    
 

    
    

    @Override
    public double HitungLuas() {
        return (phi*jari*jari);
        
    }

    @Override
    public double HitungKeliling() {
       return (2*phi*jari);
    }

    @Override
    public String displayinfo() {
       return ( "Lingkaran"
               +"\no Jari-jari    : " + (float)getJari()
               +"\no Luas    : " + (float)HitungLuas()
               +"\no Keliling    : " + (float)HitungKeliling()
               );
               
    }
    
    
}