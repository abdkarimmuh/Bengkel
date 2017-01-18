/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bengkel;

import bengkel.input.InputPelanggan;
import bengkel.output.OutputPelanggan;
import java.io.IOException;
import static java.lang.System.exit;
import java.util.Scanner;

/**
 *
 * @author setakarim
 */
public class MainMenu {
    
    
    About about = new About();
    Scanner in = new Scanner(System.in);
    InputPelanggan inPelanggan = new InputPelanggan();
    OutputPelanggan outPelanggan = new OutputPelanggan();
    
    public void getMenu() {    
        
        int menu;
        
        do {
            System.out.println("==============================");
            System.out.println("=         Menu Utama         =");
            System.out.println("==============================");
            System.out.println("1. Input Pengunjung");
            System.out.println("2. Lihat Data");
            System.out.println("3. Backup");
            System.out.println("4. Tentang");
            System.out.println("5. Keluar");
            System.out.println("=============================");
            System.out.print("Pilih Menu : ");
            try {
                menu = Integer.valueOf(in.nextLine());
            } catch (Exception e) {
                System.err.println("Harus angka");
                this.getMenu();
                break;
            }
            switch (menu) {
                case 1:
                    inPelanggan.inputData();
                    break;
                case 2:
                    outPelanggan.showData();
                    break;
                case 3:
                    //masuk class lihatdata
                    break;
                case 4:
                    about.getAbout();
                    break;
                case 5:
                    System.out.println("KELUAR");
                    exit(0);
                    break;
                default:
                    System.out.println("Masukan angka 1-4");
            }
        } while (menu != 5);
    }
}
