/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import Dao.Dao_RentalMotor;
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
}
