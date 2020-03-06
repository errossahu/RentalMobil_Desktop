/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exeption;

/**
 *
 * @author ACER
 */
public class dataSama extends Exception{

    public String message()
    {
        return "No Plat Sudah Terdaftar" ;
    }
    public String nomorPegawai()
    {
        return "Nomor Pegawai Sudah Terdaftar";
    }
    
}
