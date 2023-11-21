/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tryexceptionkelompok;
import java.util.Arrays;
/**
 *
 * @author User
 */
public class CheckFileSingleCatch {
    private String[] files = {"File1.pdf", "CobaCari.pdf", " AkuTakTahu"};
    
    public void bacaFIle(String namaFile){
        try{
            if(!Arrays.asList(files).contains(namaFile)){
                throw new MyException("File tidak ditemukan di list");
            }
            
            System.out.println("File bernama " + namaFile + " telah ditemukan");
        }catch(MyException e){
            System.out.println(e.getMessage());
        }
    }
}
