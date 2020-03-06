/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import Dao.Dao_RentalMotor;
import java.util.List;

import model.Motor;

/**
 *
 * @author ACER
 */
public class MotorControl {
 
    private Dao_RentalMotor MotorDAO= new Dao_RentalMotor();
    
    
    public void tambahMotor(Motor m)
    {
        MotorDAO.makeConnection();
        MotorDAO.tambahMotor(m);
        MotorDAO.closeConnection();
        
    }
    public void editMotor(Motor m , String nomorKendaraan)
    {
        MotorDAO.makeConnection();
        MotorDAO.editMotor(m, nomorKendaraan);
        MotorDAO.closeConnection();
    }
    public void hapusMotor( String nomorKendaraan)
    {
        MotorDAO.makeConnection();
        MotorDAO.hapusMotor(nomorKendaraan);
        MotorDAO.closeConnection();
    }
    public Motor searchMotor(String nomorKendaraan)
    {
        Motor mtr=null;
        MotorDAO.makeConnection();
        mtr= MotorDAO.searchMotor(nomorKendaraan);
        MotorDAO.closeConnection();
        return mtr;
    
    }
    public Motor getMotor()
    {
        Motor m=null;
        MotorDAO.makeConnection();
        m=MotorDAO.getMotor();
        MotorDAO.closeConnection();
        return m;
    }
     
    public List<Motor> tampilDataMotor()
    {
        MotorDAO.makeConnection();
        List<Motor> M =MotorDAO.TampilMotor();
        MotorDAO.closeConnection();
        return M;

    }
    
    
}
