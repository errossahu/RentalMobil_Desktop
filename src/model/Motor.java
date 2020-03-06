/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author ACER
 */
public class Motor {
    
    public String nomorKendaraan ;
    public String merek ;
    public int tahunPembuatan ;  
   
    
    
    public Motor(String nomorKendaraan , String merek, int tahunPembuatan )
    {
        this.merek =merek ;
        this.nomorKendaraan=nomorKendaraan ;
        this.tahunPembuatan=tahunPembuatan ;
    }
    
    
    public void setNomorKendaraan (String nomorKendaraan)
    {
        this.nomorKendaraan=nomorKendaraan ;
    }
    public String getNomorKendaraan()
    {
        return nomorKendaraan ;
    }
    public void setMerek (String merek )
    {
        this.merek=merek ;        
    }
    public String getMerek ()
    {
        return merek ;
    }
    public void settahunPembuatan(int  tahunPembuatan)
    {
        this.tahunPembuatan= tahunPembuatan ;
    }
    public int gettahunPembuatan ()
    {
        return tahunPembuatan ;
    }
    public String tampilData()
    {
        return "Data Kendaraan "+"\n"+"Nomor Plat : " +getNomorKendaraan()+"\n"
                +"Merek : " +getMerek()+"\n"+
                "Tahun Pembuatan : " +gettahunPembuatan();
    }
    
}
