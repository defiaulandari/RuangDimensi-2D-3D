package modul2.bangun2d;
import modul2.LKBangun2D;
import java.util.Scanner;
public class JajarGenjang extends LKBangun2D {
    Scanner input =new Scanner(System.in);
    double hasil;
    private double a, t, m;

    public Scanner getInput() {
        return input;
    }

    public void setInput(Scanner input) {
        this.input = input;
    }

    public double getHasil() {
        return hasil;
    }

    public void setHasil(double hasil) {
        this.hasil = hasil;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getT() {
        return t;
    }

    public void setT(double t) {
        this.t = t;
    }

    public double getM() {
        return m;
    }

    public void setM(double m) {
        this.m = m;
    }

    @Override
    public void hitungKeliling() {
        super.hitungKeliling();
        System.out.println("Masukkan Alas: ");
        a = input.nextByte();
        System.out.println("Masukkan Miring: ");
        m = input.nextByte();
        System.out.println("Hasil Keliling Jajar Genjang");
        hasil = 2 * (a + m);
        System.out.println("Alas: " +a+ " Miring: " +m);
        System.out.println("Hasil Keliling Jajar Genjang :" + hasil);
    }

    @Override
    public void hitungLuas() {
        super.hitungLuas();
        super.hitungLuas();
        System.out.println("Masukkan Alas: ");
        a = input.nextByte();
        System.out.println("Masukkan Tinggi: ");
        t = input.nextByte();
        System.out.println("Hasil Luas Jajar Genjang");
        hasil = a * t;
        System.out.println("Alas: " +a+ " Tinggi: " +t);
        System.out.println("Hasil Luas Jajar Genjang :" + hasil);
    }
    public void Display(){
        System.out.println("==== Pilih Hitung Bangun Ruang ====");
        System.out.println("1. Hitung Keliling");
        System.out.println("2. Hitung Luas");
        System.out.println("3. Exit");
        System.out.println("Pilih Menu :");
        int pilih = input.nextInt();

        if(pilih == 1){
            hitungKeliling();
        }else if (pilih == 2){
            hitungLuas();
        }else if (pilih == 3){
            System.exit(0);
        }else{
            System.out.println("Maaf! Inputan salah");
        }

    }
}
