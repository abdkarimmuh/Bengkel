/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bengkel;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author setakarim
 */
public class About {
    
    public void getAbout(){
        
        System.out.println("Tentang kami");
        System.out.println("Proyek ini dibuat untuk memenuhi tugas pemograman berorientasi objek");
        System.out.println("Dibuat oleh :");
        System.out.println("1.Muhammad Abdul Karim(0110215053)");
        System.out.println("2.Hasnah Mujahidah Amatullah(0110115007)");
        System.out.println("3.Afifah Sausan(0110115016)");
        System.out.println("4.Muhammad Luqni Baehaqi(0110115024)");
        System.out.println("5.Muhammad Aslam Pangestu Idham(0110215002)");
        System.out.println("6.Muhammad Jaifer Rama Putra(0110215042)");
        System.out.println("Press any key to return to menu...");
        
        try {
            System.in.read();//pause console
        } catch (IOException ex) {
            Logger.getLogger(About.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
