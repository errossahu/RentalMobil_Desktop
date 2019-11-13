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
public class loginAdminException extends Exception {
    
    public String message()
    {
        return "User Name Salah ";
    }
    public String sandiMessage()
    {
        return "Kata Sandi Salah";
    }
    
}
