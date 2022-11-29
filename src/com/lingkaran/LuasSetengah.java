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
public class LuasSetengah {
      private Lingkaran lingkaran;
    
    public LuasSetengah(Lingkaran lingkaran){
        this.lingkaran = lingkaran;
    }
    
    public void hitung(){
        this.lingkaran.hitungLuas();
    }
    
    public void tampilkan(){
        this.lingkaran.tampilkanLuas();
    }    
    
}
