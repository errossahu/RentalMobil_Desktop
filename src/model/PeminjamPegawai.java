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
public class PeminjamPegawai extends Peminjam implements hitungBiayaSewa {
    
    public  String namaKantor ;
    public  String alamatKantor ;
    public double biaya ;
    public PeminjamPegawai(String namaPeminjam, String nomorKtp, String alamat, int lamaPinjam,String namaKantor, String alamatKantor , double biaya ) {
        super(namaPeminjam, nomorKtp, alamat, lamaPinjam);
        this.alamatKantor=alamatKantor;
        this.namaKantor=namaKantor ;
        this.biaya= biaya ;
    } 
    
    public void setNamaKantor (String namaKantor)
    {
        this.namaKantor=namaKantor ;
    }
    public void setAlamatKantor(String alamatKantor)
    {
        this.alamatKantor=alamatKantor ;
    }
    public String getNamaKantor ()
    {
        return namaKantor ;
    }
    public String getAlamatKantor ()
    {
        return alamatKantor ;
    }
 public String showBiaya()
    {
        return "Total Harga "+getBiaya()+ "\n Untuk Peminjaman Selama " +getLamaPeminjam() + "Hari";
    }

    @Override
    public double getBiaya() {
        return 50000*lamaPinjam ;
    }
 

    
    
    
    
    
    
    
}
