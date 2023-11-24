package modul2;
import modul2.bangun2d.*;

import java.util.Scanner;
public class LKBangun2D extends Main{
    private double Luas;

    public double getLuas() {
        return Luas;
    }

    public void setLuas(double luas) {
        Luas = luas;
    }
    private double keliling;

    public double getKeliling() {
        return keliling;
    }

    public void setKeliling(double keliling) {
        this.keliling = keliling;
    }
    public void infoBangun(){
        char opr = 'Y';
        do{
            Scanner input = new Scanner(System.in);
            System.out.println("==== Selamat Datang di Program Bangun Ruang Dimensi ====");
            System.out.println("==== Silahkan Pilih Bangun Ruang 2 Dimensi ====");
            System.out.println("1. Belah Ketupat");
            System.out.println("2. Jajar Genjang");
            System.out.println("3. Lingkaran");
            System.out.println("4. Persegi");
            System.out.println("5. Persegi Panjang:");
            System.out.println("6. Segitiga");
            System.out.println("Pilih Menu");
            int pilih = input.nextInt();

            switch (pilih){
                case 1:
                    BelahKetupat a = new BelahKetupat();
                    a.Display();
                    break;
                case 2:
                    JajarGenjang b = new JajarGenjang();
                    b.Display();
                    break;
                case 3:
                    Lingkaran c = new Lingkaran();
                    c.Display();
                    break;
                case 4:
                    Persegi d = new Persegi();
                    d.Display();
                    break;
                case 5:
                    PersegiPanjang e = new PersegiPanjang();
                    e.Display();
                    break;
                case 6:
                    Segitiga f = new Segitiga();
                    f.Display();
                    break;
                case 7:
                    System.out.println("SELESAII BROHH!");
                    System.exit(0);

                default:
                    System.out.println("Maaf Inputan anda salah!");
                    System.out.println("Apakah anda ingin mengulang Y/N");
                    opr = input.next().charAt(opr);
            }
        }while (opr == 'y' || opr == 'Y');

    }
    public void hitungKeliling(){

    }public void  hitungLuas(){


    }

}
