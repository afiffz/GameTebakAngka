/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gametebakangka;

/**
 *
 * @author afiff
 */
import java.util.Random;
import java.util.Scanner;

public class GameTebakAngka {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random a = new Random();
        Scanner input = new Scanner (System.in);
        int jawaban = a.nextInt(100) + 1;
        int tebakan;
        int score = 100;
        int percobaan = 0;
        boolean benar = false;
        
        while (benar == false) {
            System.out.println("-- -- GAME TEBAK ANGKA -- --");
            System.out.println("Silahkan tebak angka dari 1-100 : ");
            tebakan = input.nextInt();
            
            if (score == 0) {
                System.out.println("Yahh kesempatan kamu udah abis :(");
                break;
            }
            if (tebakan > jawaban) {
                System.out.println("Tebakanmu terlalu BESAR, Yokk tebak lagi!");
                percobaan++;
                score -=2;
            }
            if (tebakan < jawaban) {
                System.out.println("Tebakanmu terlalu KECIL, Yokk tebak lagi!");
                percobaan++;
                score -=2;
            }
            if (tebakan == jawaban) {
                System.out.println("Asikk tebakanmu benarr :) ");
                benar = true;
                percobaan++;
            }   
        }
        System.out.println("Score kamu : "+score);
        if (percobaan <= 5) {
            if (score != 0) {
                score += 50;
                System.out.println("Kamu dapet bonus 50 point");
                System.out.println("Total score kamu : "+score);
            }
        }

        System.out.println("Kamu udah nebak "+percobaan+" kali");
    }
    
}
