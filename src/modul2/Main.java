package modul2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       char opr = 'Y';
       do{
           Scanner input = new Scanner(System.in);
           System.out.println("==== Selamat Datang di Program Bangun Ruang Dimensi ====");
           System.out.println("==== Silahkan Pilih Bangun Ruang Dimensi ====");
           System.out.println("1. Bangun Ruang 2D");
           System.out.println("2. Bangun Ruang 3D");
           System.out.println("3. Exit");
           System.out.println("Pilih Menu :");
           int pilih = input.nextInt();

           switch (pilih){
               case 1:
                   LKBangun2D lkBangun2D = new LKBangun2D();
                   lkBangun2D.infoBangun();
                   break;
               case 2:
                   LKBangun3D lkBangun3D = new LKBangun3D();
                   lkBangun3D.infoBangun();
                   break;
               case 3:
                   System.out.println("SELESAI BROHH");
                   System.exit(0);
               case 4:
                   System.out.println("Maaf Inputan Salah!");
                   System.out.println("Apakah Kamu Ingin Mengulang? Y/N");
                   opr = input.next().charAt(opr);
           }

       }while (opr == 'y' || opr == 'Y');

    }
    public void hitung2D(){
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
            System.out.println("Pilih Menu:");

            int pilih = input.nextInt();

            switch (pilih){
                case 1:
                    break;
                case 2:
                    break;
                default:
                    System.out.println("Maaf Inputan anda salah!");
                    System.out.println("Apakah anda ingin mengulang Y/N");
                    opr = input.next().charAt(opr);
            }
        }while (opr == 'y' || opr == 'Y');

    }public void hitung3D (){
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
            System.out.println("Pilih Menu:");
            int pilih = input.nextInt();

            switch (pilih){
                case 1:
                    break;
                case 2:
                    break;
                default:
                    System.out.println("Maaf Inputan anda salah!");
                    System.out.println("Apakah anda ingin mengulang Y/N");
                    opr = input.next().charAt(opr);
            }

        }while (opr == 'y' || opr == 'Y');

    }

}