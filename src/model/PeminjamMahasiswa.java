/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author JHOGAN
 */
public class PeminjamMahasiswa extends Peminjam implements hitungBiayaSewa {
    
    public String namaKampus ;
    public String alamatKampus ;
    public double biaya ;
    public PeminjamMahasiswa(String namaPeminjam, String nomorKtp, String alamat, int lamaPinjam,String namaKampus, String alamatKampus,double biaya) {
        super(namaPeminjam, nomorKtp, alamat, lamaPinjam);
        this.namaKampus=namaKampus ;
        this.alamatKampus=alamatKampus ;
        this.biaya= biaya ;
    }
    
    public void setNamaKampus (String namaKampus )
    {
        this.namaKampus= namaKampus ;
    }
    public String getNamaKampus()
    {
        return namaKampus ;
    }
    public void setAlamatKampus(String alamatKampus )
    {
        this.alamatKampus= alamatKampus ;
    }
    
    public String getAlamatKampus()
    {
        return alamatKampus ;
    }
    public String showBiaya()
    {
        return "Total Harga "+getBiaya()+ "\n Untuk Peminjaman Selama " +getLamaPeminjam() + "Hari";
    }
    @Override
    public double getBiaya() {
        return 45000*lamaPinjam ;
    }
  

    
   
    
}
