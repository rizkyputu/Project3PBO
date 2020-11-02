/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gametebakangka2;
import java.util.Scanner;
/**
 *
 * @author asus
 */
public class GameTebakAngka2 {
    int a;
    int b;
    int c;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    int a = (int) (Math.random()*100);
    int c = 1 ;
    int skor = 100;
    
    System.out.println("Hai... nama saya Mr. Kypu, saya telah memilih sebuah bilangan bulat secara acak antara 0 s/d\n" +
                        "100. Silakan tebak ya!!!");
    System.out.println("Tebak Angka");
    
    do{
        System.out.println("Masukkan Angka Tebakanmu");
        Scanner tebak = new Scanner (System.in);
        int b = tebak.nextInt();
        
            if (b == a){
                System.out.println("Selamat !!! Tebakanmu BENAR ");
                if  (c<=5){
                    skor += 50;
                    System.out.println("Bonus skor +50 ");
                    }
                System.out.println("Skor kamu : "+skor);
                break;
                }
            
            else if (b < a){
                System.out.println("Yah Maaf, Angka Tebakanmu terlalu KECIL");
                skor-=2;
            }
            else if (b > a){
                System.out.println("Yah Maaf Tebakanmu terlalu BESAR");
                skor-=2;
            }   
            else {
                System.out.println("Sayang Sekali jawabannya adalah :" + a);
                break;
            } 
                c += 1;
        } while (c !=a );
    }
}