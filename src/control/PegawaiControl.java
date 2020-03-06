/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;
import model.Pegawai;
import Dao.Dao_RentalMotor;
import java.util.List;
/**
 *
 * @author ACER
 */
public class PegawaiControl {
    private Dao_RentalMotor pgwDAO= new Dao_RentalMotor() ;
    
    
    public void tambahAdmin(Pegawai A)
    {
      
        pgwDAO.makeConnection();
        pgwDAO.tambahAdmin(A);
        pgwDAO.closeConnection();
      

    }
    public void editAdmin(Pegawai A, String namaP)
    {
        pgwDAO.makeConnection();
        pgwDAO.editAdmin(A, namaP);
        pgwDAO.closeConnection();
        
    }
    
    
    public Pegawai searchAdmin(String nomorPegawai)
    {
        Pegawai adm=null;
        pgwDAO.makeConnection();
        adm=pgwDAO.searchAdmin(nomorPegawai);
        pgwDAO.closeConnection();
        return adm;
    
    }
    
      public void hapusAdmin(String namaPegawai)
    {
       pgwDAO.makeConnection();
       pgwDAO.hapusAdmin(namaPegawai);
       pgwDAO.closeConnection();
    }
    
    
    public Pegawai getAdmin()
    {
        Pegawai a=null;
        pgwDAO.makeConnection();
        a=pgwDAO.getAdmin();
        pgwDAO.closeConnection();
        return a;
    }
     public List<Pegawai> tampilDataPegawai()
    {
        pgwDAO.makeConnection();
        List<Pegawai> p =pgwDAO.TampilPegawai();
        pgwDAO.closeConnection();
        return p;

    }
    
}
