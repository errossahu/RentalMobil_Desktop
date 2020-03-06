/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;
import model.Pegawai;
import  Dao.Dao_RentalMotor;
import control.PegawaiControl;
import exeption.InputException;
import exeption.dataSama;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
/**
 *
 * @author ACER
 */
public class Pendaftaran extends javax.swing.JFrame {

    
    Pegawai admin;
    PegawaiControl adminC;
    
    public Pendaftaran() {
        
        this.setTitle("REGISTRASI PEGAWAI");
        adminC = new PegawaiControl() ;
        initComponents();
    }
    public class SandiException extends Exception
    {
        public String message()
        {
            return "Sandi Tidak Sama" ;
        }
    }
    public void SandiEXception() throws SandiException
    {
        
        if(!kataSandi.getText().equalsIgnoreCase(kataSandi1.getText()))
        {
            throw new SandiException();
        }
    }
    public void InputException() throws InputException
    {
        if(namaPegawai.getText().length()<1 || txtnomorPegawai.getText().length()<1|| kataSandi.getText().length()<1)
        {
              throw new InputException();
            
        }
       
    }
    public void cekNomor() throws dataSama
    {
      admin  = adminC.searchAdmin(txtnomorPegawai.getText());
      if(admin!=null)
      {
       throw new   dataSama();
      }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtnomorPegawai = new javax.swing.JTextField();
        namaPegawai = new javax.swing.JTextField();
        kataSandi = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnDaftar = new javax.swing.JButton();
        kataSandi1 = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 255, 102));
        getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        jPanel1.setBackground(new java.awt.Color(0, 255, 204));
        jPanel1.setForeground(new java.awt.Color(204, 51, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(32767, 32767));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Stencil", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 0, 153));
        jLabel1.setText("PENDAFTARAN  pegawAI");
        jLabel1.setPreferredSize(new java.awt.Dimension(110, 100));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(407, 46, 756, 61));

        txtnomorPegawai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnomorPegawaiActionPerformed(evt);
            }
        });
        jPanel1.add(txtnomorPegawai, new org.netbeans.lib.awtextra.AbsoluteConstraints(567, 233, 488, 30));

        namaPegawai.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        namaPegawai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namaPegawaiActionPerformed(evt);
            }
        });
        jPanel1.add(namaPegawai, new org.netbeans.lib.awtextra.AbsoluteConstraints(567, 183, 488, 30));
        jPanel1.add(kataSandi, new org.netbeans.lib.awtextra.AbsoluteConstraints(567, 284, 488, 31));

        jLabel3.setFont(new java.awt.Font("Kozuka Mincho Pr6N L", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Kata Sandi                       :");
        jLabel3.setPreferredSize(new java.awt.Dimension(110, 100));
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 283, 255, 30));

        jLabel4.setFont(new java.awt.Font("Kozuka Mincho Pr6N L", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Nama Pegawai                :");
        jLabel4.setPreferredSize(new java.awt.Dimension(110, 100));
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 181, 255, 30));

        jLabel5.setFont(new java.awt.Font("Kozuka Mincho Pr6N L", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Nomor Pegawai              :");
        jLabel5.setPreferredSize(new java.awt.Dimension(110, 100));
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 233, 255, 30));

        btnDaftar.setBackground(new java.awt.Color(255, 0, 102));
        btnDaftar.setFont(new java.awt.Font("Dubai Medium", 1, 18)); // NOI18N
        btnDaftar.setText("DAFTAR ");
        btnDaftar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDaftarActionPerformed(evt);
            }
        });
        jPanel1.add(btnDaftar, new org.netbeans.lib.awtextra.AbsoluteConstraints(374, 515, 351, 68));

        kataSandi1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kataSandi1ActionPerformed(evt);
            }
        });
        jPanel1.add(kataSandi1, new org.netbeans.lib.awtextra.AbsoluteConstraints(567, 334, 488, 31));

        jLabel6.setFont(new java.awt.Font("Kozuka Mincho Pr6N L", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Konfir Sandi                    :");
        jLabel6.setPreferredSize(new java.awt.Dimension(110, 100));
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 335, 255, 30));

        btnLogin.setBackground(new java.awt.Color(0, 51, 255));
        btnLogin.setFont(new java.awt.Font("Dubai Medium", 1, 18)); // NOI18N
        btnLogin.setText("LOGIN");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        jPanel1.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(374, 594, 351, 68));

        getContentPane().add(jPanel1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:
//        JLabel jDialog = new JLabel();
        Login lo = new Login();

        this.setVisible(false);
//        jDialog.add(new JLabel("Please wait..."));
//        jDialog.setMinimumSize(new Dimension(150, 50));

        lo.setVisible(true);
    }//GEN-LAST:event_btnLoginActionPerformed

    private void kataSandi1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kataSandi1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kataSandi1ActionPerformed

    private void btnDaftarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDaftarActionPerformed

        try
        {
            SandiEXception();
            InputException ();
            cekNomor();
            //            SandiEXception();
            admin = new Pegawai(namaPegawai.getText(), txtnomorPegawai.getText(), kataSandi.getText());
             
//            if(!kataSandi.getText().equalsIgnoreCase(kataSandi1.getText()))
//            {
//                JOptionPane.showMessageDialog(this, "PASSWORD TIDAK SAMA...");
//            }
//            else
//            {
                adminC.tambahAdmin(admin);
                Login login = new Login();
                this.setVisible(false);
                login.setVisible(true);
//            }
        }catch(InputException e){
            JOptionPane.showMessageDialog(this, e.message());
            //        }catch(SandiException e){
            //            if(txtSandi.getPassword().length<8 || txtSandi2.getPassword().length<8)
            //            JOptionPane.showMessageDialog(this, e.karakter());
            //            else
            //            JOptionPane.showMessageDialog(this, e.tidakSama());
        }
        catch(dataSama d)
        {
            JOptionPane.showMessageDialog(this, d.nomorPegawai());
        }
        catch(SandiException e)
        {
            JOptionPane.showMessageDialog(this, e.message());
        }
    }//GEN-LAST:event_btnDaftarActionPerformed

    private void namaPegawaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namaPegawaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namaPegawaiActionPerformed

    private void txtnomorPegawaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnomorPegawaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnomorPegawaiActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
      
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(Pendaftaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Pendaftaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Pendaftaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Pendaftaran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Pendaftaran p = new Pendaftaran();
                p.setVisible(true);
//                p.setExtendedState(JFrame.MAXIMIZED_BOTH); 
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDaftar;
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField kataSandi;
    private javax.swing.JPasswordField kataSandi1;
    private javax.swing.JTextField namaPegawai;
    private javax.swing.JTextField txtnomorPegawai;
    // End of variables declaration//GEN-END:variables
}
