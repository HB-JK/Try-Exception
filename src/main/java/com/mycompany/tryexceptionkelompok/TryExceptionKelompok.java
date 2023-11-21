/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tryexceptionkelompok;

/**
 *
 * @author User
 */
public class TryExceptionKelompok {

    public static void main(String[] args) {
        new TryExceptionKelompok().showFileSingleCatch();
    }
    
    public void buyItem(){
        Barang barang = new Barang("K002", "Lenovo v14-ADA", "Gudang A", 1000000.0, 1200000.0);
        barang.beli(2);
    }
    
    public void showFileSingleCatch(){
        CheckFileSingleCatch checkFile = new CheckFileSingleCatch();
        checkFile.bacaFIle("CobaCari.pdf");
    }
}
