/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import Dao.Dao_RentalMotor;
import java.util.List;
import model.PeminjamMahasiswa;

/**
 *
 * @author ACER
 */
public class PeminjamMahasiswaControl {
    
    private Dao_RentalMotor MDAO = new Dao_RentalMotor();
    
    
    
    public void addPeminjamMahasiwa(PeminjamMahasiswa pm)
    {
        MDAO.makeConnection();
        MDAO.tambahPeminjaMahasiswa(pm);
        MDAO.closeConnection();
    }
    public void editPeminjamMahasiswa(PeminjamMahasiswa pm , String noKtp)
    {
        MDAO.makeConnection();
        MDAO.editPeminjamMahasiswa(pm, noKtp);
        MDAO.closeConnection();
    }
      public List<PeminjamMahasiswa> tampilPeminjam()
   {
       MDAO.makeConnection();
       List<PeminjamMahasiswa> p = MDAO.TampilPeminjamMahasiwa();
       MDAO.closeConnection();
       return p;
   }
    public void deletePeminjam(String noKtp)
    {
        MDAO.makeConnection();
        MDAO.hapusPeminjamMahasiswa(noKtp);
        MDAO.closeConnection();
    }
}
