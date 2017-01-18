/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.util.LinkedList;

/**
 *
 * @author setakarim
 */
public class SaveData {
    LinkedList nama = new LinkedList();
    LinkedList tanggal = new LinkedList();
    LinkedList harga = new LinkedList();

    public LinkedList getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama.addFirst(nama);
    }

    public LinkedList getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal.addFirst(tanggal);
    }

    public LinkedList getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga.addFirst(harga);
    }
}
