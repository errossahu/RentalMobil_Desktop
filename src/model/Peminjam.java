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
public  abstract class Peminjam {
    
    protected String  namaPeminjam;
    protected String  nomorKtp ;
    protected String alamat ;
    protected int lamaPinjam ;
    protected double biaya ;
    
   
    public Peminjam(String namaPeminjam, String nomorKtp, String alamat, int lamaPinjam)
    {
     
        this.alamat=alamat ;
        this.lamaPinjam= lamaPinjam;
        this.namaPeminjam= namaPeminjam ;
        this.nomorKtp=nomorKtp ;
   
               
    }
   

    public void setAlamat (String alamat)
    {
        this.alamat=alamat ;
    }
    
    public String getAlamat()
    {
        return alamat ;
    }
    
    
    public void setNamaPeminjam(String namaPeminjam)
    {
        this.namaPeminjam= namaPeminjam ;
    }
    public String getNamaPeminjam()
    {
        return namaPeminjam ;
    }
   
    
    public void setLamaPeminjam(int lamaPinjam)
    {
        this.lamaPinjam=lamaPinjam;
    }
    public int getLamaPeminjam ()
    {
        return lamaPinjam ;
    }
    
    public void setNomorKtp(String nomorKtp)
    {
        this.nomorKtp=nomorKtp ;
    }
    public String  getNomorKtp ()
    {
        return nomorKtp ;
    
    }
    

    
   
    
    
    
    
    
    
}
