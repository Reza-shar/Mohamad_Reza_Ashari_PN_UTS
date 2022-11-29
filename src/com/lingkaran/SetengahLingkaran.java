/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lingkaran;

/**
 *
 * @author SHIKUZIKA
 */
public class SetengahLingkaran implements Lingkaran {
     double hasil;
    public SetengahLingkaran(){
        hasil = 0;
    }

    @Override
    public void hitungLuas() {
        double luas1 = (PANJANG / 2 * LEBAR) - (Math.PI * (PANJANG / 2)* (PANJANG / 2) / 4);
        hasil = 2 * luas1;
    }

    @Override
    public void tampilkanLuas() {
        System.out.println("luas gambar tersebut adalah : " + this.getHasil());
    }
    
    public double getHasil(){
        return hasil;
    }
    
}
