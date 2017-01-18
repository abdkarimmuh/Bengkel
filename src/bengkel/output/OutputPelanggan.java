/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bengkel.output;

import data.SaveData;

/**
 *
 * @author setakarim
 */
public class OutputPelanggan {

    SaveData data = new SaveData();
    int a = 1;

    public void showData() {
        int a = 1;

        int sizeNama = data.getNama().size();
        System.out.println(sizeNama);

        System.out.println();
        System.out.println("No |\tNama Pembeli\t|\tTanggal\t|\tHarga");
        System.out.println("========================================");

        /*while (nama.hasNext() && tanggal.hasNext() && harga.hasNext()){
            String n = nama.get();
            String t = tanggal.next();
            int h = harga.next();
            
            System.out.println(" "+a+" |\t"+n+"\t|\t"+t+"\t|\t"+h);
            
            a++;
        }*/
        if (sizeNama == 0) {
            System.out.println("Data Masih Kosong");
        }

        for (int i = 0; i < sizeNama; i++) {

            System.out.println(" " + a + " |\t"
                    + data.getNama().indexOf(i) + "\t|\t"
                    + data.getTanggal().indexOf(i) + "\t|\t"
                    + data.getHarga().indexOf(i));
            a++;
        }
        
        System.out.println("========================================\n");
    }
}
