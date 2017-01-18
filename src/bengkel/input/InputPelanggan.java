/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bengkel.input;

import bengkel.MainMenu;
import data.DataBarang;
import data.DataPembeli;
import data.SaveData;
import java.util.Scanner;

/**
 *
 * @author setakarim
 */
public class InputPelanggan {

    DataPembeli pembeli = new DataPembeli();
    DataBarang barang = new DataBarang();
    SaveData saveData = new SaveData();
    MainMenu menuMain = new MainMenu();

    private String nama, tanggal;
    Scanner in = new Scanner(System.in);

    public void inputData() {

        pembeli.setHarga(0);

        System.out.println("");

        System.out.print("Nama Pelanggan : ");
        nama = in.nextLine();

        System.out.print("Tanggal : ");
        tanggal = in.nextLine();

        this.pembeli.setNama(nama);
        this.pembeli.setTanggal(tanggal);

        menuLayanan();

    }

    public void menuLayanan() {

        int menu;
        do {
            System.out.println("==============================");
            System.out.println("=       Menu Pelayanan       =");
            System.out.println("==============================");
            System.out.println("1. Service");
            System.out.println("2. Sparepart");
            System.out.println("3. Kembali");
            System.out.println("=============================");
            System.out.print("Pilih Menu : ");

            try {
                menu = Integer.valueOf(in.nextLine());
            } catch (Exception e) {
                System.err.println("Harus angka");
                menuLayanan();
                break;
            }
            switch (menu) {
                case 1:
                    menuService();
                    break;
                case 2:
                    menuSparepart();
                    break;
                case 3:
                    //apakah anda yakin dengan inputan ini. klo ya disave, klo ga lanngsung balik ke menu utama
                    menuMain.getMenu();
                    break;
                default:
                    System.out.println("Masukan angka 1-3");
            }

        } while (menu != 3);
    }

    public void menuService() {
        
        int menu, hari;
        int hargaDasar = 50000;
        int hargaPerHari = 10000;
        
        do {
            
            System.out.println("==============================");
            System.out.println("=        Menu Service        =");
            System.out.println("==============================");
            System.out.println("1. On Same Day");
            System.out.println("2. Ditinggal");
            System.out.println("3. Kembali");
            System.out.println("=============================");
            System.out.print("Pilih Menu : ");
            try {
                menu = Integer.valueOf(in.nextLine());
            } catch (Exception e) {
                System.err.println("Harus angka");
                menuService();
                break;
            }
            switch (menu) {
                case 1:
                    //harga dasar service masuk ke penyimpanan sementara dan balik ke class input layanan
                    pembeli.setHarga(pembeli.getHarga() + hargaDasar);
                    getFinalInput();
                    break;
                case 2:
                    //tanya berapa hari. lalu harga dasar service ditambah harga per hari masuk ke penyimpanan sementara dan balik ke class input data
                    System.out.println("Masukkan Jumlah Hari : ");
                    hari = in.nextInt();
                    pembeli.setHarga(((hargaPerHari * (hari - 1)) + hargaDasar) + pembeli.getHarga());
                    getFinalInput();
                    break;
                case 3:
                    menuMain.getMenu();
                    break;
                default:
                    System.out.println("Masukan angka 1-3");
            }
        } while (menu != 3);
    }

    public void menuSparepart() {

        String pilihan;
        
        showSparepart();

        do {    
            System.out.println("Apakan anda ingin memesan lagi ? (y/n)");
            System.out.print("=> ");
            pilihan = in.nextLine();
            pilihan = in.nextLine();

            if (pilihan.equalsIgnoreCase("y")) {
                menuSparepart();
            } else if (pilihan.equalsIgnoreCase("n")) {
                getFinalInput();
            } else {
                System.out.println("Maaf Inputan anda tidak dikenali");
            }
        } while (!pilihan.equalsIgnoreCase("n"));

    }

    public void showSparepart() {
        
        int menu = 0, banyak = 0;

        System.out.println("Kode |\tNama\t\t|\tHarga");
        System.out.println("========================================");

        for (int i = 0; i < 5; i++) {
            System.out.println("  " + (i + 1) + "  |\t" + barang.getNamaBarang(i) + "\t|\t" + barang.getHargaBarang(i));
        }

        System.out.println("========================================");

        System.out.print("Masukan kode: ");
        try {
            menu = Integer.valueOf(in.nextLine());
        } catch (Exception e) {
            System.err.println("Harus angka");
            menuSparepart();

        }
        switch (menu) {
            case 1:
                System.out.print("Masukkan Jumlah Barang : ");
                banyak = in.nextInt();
                pembeli.setHarga((barang.getHargaBarang(0) * banyak) + pembeli.getHarga());

                break;
            case 2:
                System.out.print("Masukkan Jumlah Barang : ");
                banyak = in.nextInt();
                pembeli.setHarga((barang.getHargaBarang(1) * banyak) + pembeli.getHarga());

                break;
            case 3:
                System.out.print("Masukkan Jumlah Barang : ");
                banyak = in.nextInt();
                pembeli.setHarga((barang.getHargaBarang(2) * banyak) + pembeli.getHarga());

                break;
            case 4:
                System.out.print("Masukkan Jumlah Barang : ");
                banyak = in.nextInt();
                pembeli.setHarga((barang.getHargaBarang(3) * banyak) + pembeli.getHarga());

                break;
            case 5:
                System.out.print("Masukkan Jumlah Barang : ");
                banyak = in.nextInt();
                pembeli.setHarga((barang.getHargaBarang(4) * banyak) + pembeli.getHarga());

                break;
            case 6:
                inputData();
                break;
            default:
                System.out.println("Masukan angka 1-6");
        }
    }

    public void getFinalInput() {
        
        int pilihan = 0;

        System.out.println("\n===========================");
        System.out.println("Nama Pelanggan : " + pembeli.getNama());
        System.out.println("Tanggal : " + pembeli.getTanggal());
        System.out.println("Total Harga Belanja : " + pembeli.getHarga());
        System.out.println("\n===========================");

        System.out.println("\n1. Simpan \n2. Tulis Ulang \n3. Kembali");
        System.out.print("=> ");

        try {
            pilihan = Integer.valueOf(in.nextLine());
        } catch (Exception e) {
            System.err.println("Harus angka");
            getFinalInput();
        }

        switch (pilihan) {
            case 1:
                saveData.setNama(pembeli.getNama());
                saveData.setTanggal(pembeli.getTanggal());
                saveData.setHarga(pembeli.getHarga());
                System.out.println("Data berhasil disimpan");
                System.out.println(saveData.getNama());
                System.out.println(saveData.getNama().size());
                menuMain.getMenu();
                break;
            case 2:
                inputData();
                break;
            case 3:
                menuMain.getMenu();
                break;
            default:
                System.out.println("Pilihan antara 1 sampai 3");
                break;
        }
    }
}