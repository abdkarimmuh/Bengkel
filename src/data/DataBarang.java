/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/**
 *
 * @author setakarim
 */
public class DataBarang {
    String namaBarang[] = {"Oli Motor","Kampas Rem","Rantai Motor","Kabel Gas","Ban Luar"};
    int hargaBarang[] = {50000, 30000, 65000, 20000, 70000};

    public String getNamaBarang(int i) {
        return namaBarang[i];
    }

    public int getHargaBarang(int i) {
        return hargaBarang[i];
    }
    
    
}
