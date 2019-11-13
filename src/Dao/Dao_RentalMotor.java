/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

/**
 *
 * @author ACER
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Pegawai;
import model.PeminjamMahasiswa ;
import model.PeminjamPegawai ;
import model.Motor ;

public class Dao_RentalMotor {
    
    
    
    public static Connection CON;
    public static final String url = "jdbc:ucanaccess://";
    public static final String path = "D:\\RentalMotor.mdb";
    
    
    public void makeConnection()
    {
        System.out.println("Opening Database. . . .");
        try
        {
            CON = DriverManager.getConnection(url + path);
            System.out.println("Success...");
        }catch (Exception e)
        {
            System.out.println("Gagall membuka Data Base . . .");
            System.out.println(e);
        }
    }
    public void closeConnection()
    {
        System.out.println("Closing database. . . .");
        try
        {
            CON.close();
            System.out.println("Success...\n");
        }catch (Exception e)
        {
            System.out.println("Gagal Menutup Database. . .");
            System.out.println(e);
        }
    }
    ////////Membuat ADMIN//////////////////
    
    public void tambahAdmin(Pegawai A)
    {
    
       String sql = "INSERT INTO Admin (namaPegawai,nomorPegawai,kataSandi)VALUES('"+A.getNamaPegawai()+"','"+A.getNomorPegawai()+ "','"+A.getKataSandi()+"')";
        
         try
        {
            Statement statement = CON.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Added" + result + "Admin\n");
            statement.close();
        }
        catch(Exception e)
        {
            System.out.println("Error adding Admin..");
            System.out.println(e);
        }
        
        
    }
    
    ////////////////Hapus PEGAWAI/////////////
    
    public void hapusAdmin (String namaPegawai)
    {
        String sql = "DELETE FROM Admin where namaPegawai = '"+namaPegawai+"'";
        System.out.println("PEGAWAI DIHAPUS..");
        
        try
        {
            Statement statement = CON.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Hapus " + result+ " Admin\n");
            statement.close();
        }
        catch(Exception e)
        {
            System.out.println("Gagal Hapus Admin..");
            System.out.println(e);
        }
    }
    
    ////////////////Cari nama Pegawai Pegawai///////////////////
    
    public Pegawai searchAdmin (String namaPegawai){
        String sql="SELECT * FROM Admin where namaPegawai='"+namaPegawai+"'";
        System.out.println("Mencari Nama Pegawai . . .");
        
        Pegawai admin = null;
        try{
            Statement statement = CON.createStatement();
            ResultSet rs=statement.executeQuery(sql);
            if(rs!=null){
                while(rs.next()){
                    admin = new Pegawai(rs.getString("namaPegawai"),rs.getString("nomorPegawai"),rs.getString("kataSandi"));                 
                }
            }
            rs.close();
            statement.close();

        }
        catch(Exception Ex){
            System.out.println("Error reading database information...\n");
            System.out.println(Ex);
        }
         return admin;
    }
    ////Ubah Pegawai///
    public void editAdmin(Pegawai A, String namaP)
    {
        String sql = "UPDATE Admin SET namaPegawai = '"+A.getNamaPegawai()+"', nomorPegawai= '"+A.getNomorPegawai()+"',"
                    
                    + "kataSandi='"+A.getKataSandi()+"' where namaPegawai = '"+namaP+"'";
        
        System.out.println("Editing Pegawai..!!");

        try
        {
            Statement statement = CON.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Edit " + result + "Admin" + namaP);
            statement.close();
        }
        catch(Exception e)
        {
            System.out.println("Error editing Admin..");
            System.out.println(e);
        }
    }
    
    /////////////////////GET ADMIN UNTUK EDIT/////////////////////////
    public Pegawai getAdmin (){
         String sql="SELECT * FROM Admin";
        System.out.println("Searching Nama Pengguna . . .");
        
        Pegawai admin = null;
        try{
            Statement statement = CON.createStatement();
            ResultSet rs=statement.executeQuery(sql);
            if(rs!=null){
                while(rs.next()){
                admin = new Pegawai(rs.getString("namaPegawai"),rs.getString("nomorPegawai"),
                rs.getString("kataSandi"));                 
                }
            }
            rs.close();
            statement.close();

        }
        catch(Exception Ex){
            System.out.println("Error reading database information...\n");
            System.out.println(Ex);
        }
         return admin;
    }
    
    /////////////TAMPIL PEGAWAI //////////////
      public List<Pegawai> TampilPegawai()
    {
        String sql = "select * from Admin";
        System.out.println("Daftar Pegawai. . .");

        List<Pegawai> list = new ArrayList<>();

        try
        {
            Statement statement = CON.createStatement();
            ResultSet rs = statement.executeQuery(sql);

            if(rs != null)
            {
                while(rs.next())
                {
                    Pegawai P = new Pegawai(rs.getString("namaPegawai"),rs.getString("nomorPegawai"),rs.getString("kataSandi")); 
                    list.add(P);
                }
            }
            rs.close();
            statement.close();
        }

        catch(Exception e)
        {
            System.out.println("Gagal Membaca Database...\n");
            System.out.println(e);
        }

        return list;
    }
    
    
    
    
    
    
    
    ////////// Menu Tambah Motor /////////    
    public void tambahMotor (Motor M ) 
    {
        
        String sql = "insert into Motor (nomorKendaraan ,Merek,tahunPembuatan)values ('"+M.getNomorKendaraan()+"','"+M.getMerek()+"','"+M.gettahunPembuatan()+"')";
        
        System.out.println("Menambahkan  Motor.....");
        
        try
        {
            Statement statement = CON.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Added" + result + "Motor\n");
            statement.close();
        }
        catch(Exception e)
        {
            System.out.println("Tidak Dapat Menambahkan Motor.....");
            System.out.println(e);
        }
        
    }
    
    
   
    /////Menu edit Motor /////////////////
    public void editMotor(Motor M, String nomor)
    {

        
        

            String sql = "UPDATE Motor SET nomorKendaraan = '"+M.getNomorKendaraan()+"',"
                    +" Merek= '"+M.getMerek()+"',"
                    +" tahunPembuatan ='"+M.gettahunPembuatan()+"'"
                    +" where  nomorKendaraan= '"+nomor+"'";
            try
            {
                    
                Statement s= CON.createStatement() ;
                int Result = s.executeUpdate(sql);
                System.out.println("Edit"+Result+"");
                s.close();
            }catch (Exception e)
            {
                System.out.println("Eroor Edit Motor");
                System.out.println(e);
            }
                    
    
    
    }
 
 //////Get Motor ///////   
 public Motor getMotor (){
         String sql="SELECT * FROM Motor";
        System.out.println("Searching Nomor Kendaraan . . .");
        
       Motor motor = null ;
        try{
            Statement statement = CON.createStatement();
            ResultSet rs=statement.executeQuery(sql);
            if(rs!=null){
                while(rs.next()){
                motor = new Motor(rs.getString("nomorKendaraan"),rs.getString("Merek"),
                Integer.parseInt(rs.getString("tahunPembuatan"))  );                 
                }
            }
            rs.close();
            statement.close();

        }
        catch(Exception Ex){
            System.out.println("Error reading database information...\n");
            System.out.println(Ex);
        }
         return motor;
    }
    
       /////////////////Hapus Motor /////////////
    
    
    public void hapusMotor (String nomorKendaraan)
    {
        String sql = "DELETE FROM Motor where nomorKendaraan = '"+nomorKendaraan+"'";
        System.out.println("Motor DIHAPUS..");
        
        try
        {
            Statement statement = CON.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Hapus " + result+ " Motor\n");
            statement.close();
        }
        catch(Exception e)
        {
            System.out.println("Gagal Hapus Motor..");
            System.out.println(e);
        }
    }
    
    
    
    
    ///////////Search Motor ////////////
    public Motor searchMotor (String nomorKendaraan){
        String sql="SELECT * FROM Motor where nomorKendaraan= '"+nomorKendaraan+"'";
        System.out.println("Mencari Nomor Plat Kendaraan  . . .");
        
        Motor motor = null;
        try{
            Statement statement = CON.createStatement();
            ResultSet rs=statement.executeQuery(sql);
            if(rs!=null){
                while(rs.next()){
                    motor = new Motor(rs.getString("nomorKendaraan")
                            , rs.getString("Merek"), Integer.parseInt(rs.getString("tahunPembuatan")));                 
                }
            }
            rs.close();
            statement.close();

        }
        catch(Exception Ex){
            System.out.println("Error reading database information...\n");
            System.out.println(Ex);
        }
         return motor;
    }
    
    /////menu Tampil Motor/////////////////
    
    
    public List<Motor> TampilMotor()
    {
        String sql = "select * from Motor";
        System.out.println("Daftar Motor. . .");

        List<Motor> list = new ArrayList<>();

        try
        {
            Statement statement = CON.createStatement();
            ResultSet rs = statement.executeQuery(sql);

            if(rs != null)
            {
                while(rs.next())
                {
                    Motor M = new Motor(rs.getString("nomorKendaraan"),rs.getString("Merek"),Integer.parseInt(rs.getString("tahunPembuatan"))); 
                    list.add(M);
                }
            }
            rs.close();
            statement.close();
        }

        catch(Exception e)
        {
            System.out.println("Gagal Membaca Database...\n");
            System.out.println(e);
        }

        return list;
    }
    
   
    /////Tambah Peminjam Mahasiswa/////
    
    public void tambahPeminjaMahasiswa(PeminjamMahasiswa pm)
    {
//        //Admin (namaPegawai,nomorPegawai,kataSandi)VALUES('"+A.getNamaPegawai()+"','"+A.getNomorPegawai()+ "','"+A.getKataSandi()+"')";
        
        String sql = "Insert INTO PeminjamMahasiswa(nama,noKtp,alamat,namaKampus,alamatKampus,lamaPinjam,biaya) VALUES('"+pm.getNamaPeminjam()+
                "','"+pm.getNomorKtp()+"','"+pm.getAlamat()+"','"+pm.getAlamatKampus()+"','"+pm.getAlamatKampus()+"','"+pm.getLamaPeminjam()+"','"+pm.getBiaya()+"')" ;
        try
        {
            Statement s = CON.createStatement();
            int R = s.executeUpdate(sql);
            System.out.println("Added Peminjam"+R+"\n");
            s.close();
            
        }catch(Exception e)
        {
            System.out.println("Error Adding Database");
            System.out.println(e);
        }
        
    }

    
    
    
     
            

    
    
}
