/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import Dao.Dao_RentalMotor;
import java.util.List;
import model.PeminjamPegawai;

/**
 *
 * @author ACER
 */
public class PeminjamPegawaiControl {
    
   private Dao_RentalMotor DAO = new Dao_RentalMotor();
   
   public List<PeminjamPegawai> tampilPeminjamPegawai()
   {
       DAO.makeConnection();
       List<PeminjamPegawai> p = DAO.TampilPeminjamPegawai();
       DAO.closeConnection();
       return p;
   }
   public void tambahPeminjamPegawai(PeminjamPegawai pw)
   {
       DAO.makeConnection();
       DAO.tambahPeminjamPegawai(pw);
       DAO.closeConnection();
       
   }
   public void editPeminjamPegawai(PeminjamPegawai pm , String noKtp)
   {
       DAO.makeConnection();
       DAO.editPeminjamPegawai(pm, noKtp);
       DAO.closeConnection();
   }
    public List<PeminjamPegawai> tampilPeminjam()
   {
       DAO.makeConnection();
       List<PeminjamPegawai> p =DAO.TampilPeminjamPegawai();
       DAO.closeConnection();
       return p;
   }
    
    public void deletePeminjam(String noKtp)
    {
        DAO.makeConnection();
        DAO.hapusPeminjamPegawai(noKtp);
        DAO.closeConnection();
    }
}
