/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tryexceptionkelompok;

/**
 *
 * @author User
 */
public class Barang {
    private String kodeBarang;
    private String namaBarang;
    private String gudang;
    private double hargaBeli;
    private double hargaJual;
    
    public Barang(String kodeBarang, String namaBarang, String gudang, double hargaBeli, double hargaJual){
        this.kodeBarang = kodeBarang;
        this.namaBarang = namaBarang;
        this.gudang = gudang;
        this.hargaBeli = hargaBeli;
        this.hargaJual = hargaJual;
    }
    
    public void beli(int jumlahBarang){
        try{
            if(jumlahBarang < 1 || hargaJual < 0){
                throw new MyException("Gagal dalam melakukan belanja");
            }
            
            System.out.println(
                    "Anda berhasil belanja " + namaBarang +
                    " dengan jumlah " + jumlahBarang +
                    " seharga " + (jumlahBarang * hargaJual)
            );
        }catch(MyException e){
            System.out.println(e.getMessage());
        }
    }
}
