package modul2;
import modul2.bangun2d.BelahKetupat;
import modul2.bangun3d.*;

import java.util.Scanner;
public class LKBangun3D extends Main{
    private double Volume;

    public double getVolume() {
        return Volume;
    }

    public void setVolume(double volume) {
        Volume = volume;
    }
    public void infoBangun(){
        char opr = 'Y';
        do{
            Scanner input = new Scanner(System.in);
            System.out.println("==== Selamat Datang di Program Bangun Ruang Dimensi ====");
            System.out.println("==== Silahkan Pilih Bangun Ruang 3 Dimensi ====");
            System.out.println("1. Balok");
            System.out.println("2. Bola");
            System.out.println("3. Kerucut");
            System.out.println("4. Kubus");
            System.out.println("5. Tabung");
            System.out.println("Pilih Menu");
            int pilih = input.nextInt();

            switch (pilih){
                case 1:
                    Balok a = new Balok();
                    a.Display();
                    break;
                case 2:
                    Bola b = new Bola();
                    b.Display();
                    break;
                case 3:
                    Kerucut c = new Kerucut();
                    c.Display();
                    break;
                case 4:
                    Kubus d = new Kubus();
                    d.Display();
                    break;
                case 5:
                    Tabung e = new Tabung();
                    e.Display();
                    break;
                case 6:
                    System.out.println("SELESAI BROHH!");
                    System.exit(0);

                default:
                    System.out.println("Maaf Inputan anda salah!");
                    System.out.println("Apakah anda ingin mengulang Y/N");
                    opr = input.next().charAt(opr);
            }
        }while (opr == 'y' || opr == 'Y');

    }
    public void hitungVolume(){

    }

}
