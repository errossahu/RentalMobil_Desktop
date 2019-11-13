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
public class Pegawai {
    private String namaPegawai;
    private String nomorPegawai ;
    private String kataSandi ;
    
    
    
    
    public Pegawai(String namaPegawai, String nomorPegawai, String  kataSandi)
    {
        this.kataSandi= kataSandi;
        this.namaPegawai= namaPegawai ;
        this.nomorPegawai= nomorPegawai ;
        
        
        
    }
    public void setNamaPegawai(String namaPegawai)
    {
        this.namaPegawai=namaPegawai ;
    }
    public String getNamaPegawai()
    {
        return namaPegawai ;
    }
    public void setNomorPegawai(String nomorPegawai)
    {
        this.nomorPegawai=nomorPegawai;
    }
    
    public String getNomorPegawai()
    {
        return nomorPegawai ;
    }
    public void setKataSandi(String kataSandi )
    {
        this.kataSandi= kataSandi;
       
    }
    public String getKataSandi()
    {
        return kataSandi;
    }
    
    
    
            
}
