import java.util.Arrays;
import java.util.Scanner;
public class AplWarteg {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//      Array untuk untuk menyimpan menu dan harga
        String[] menu = {"Nasi","Ayam goreng","Ikan bawal","Perkedel","Tahu kecap",
                "Ayam kecap","Oreg","Telor dadar","Telor ceplok","Sayur Asem","Teh manis"};
        int[] harga = {3000,7000,6000,2000,4000,8000,3000,5000,5000,3000,3000};
        int[] jumlah = new int[menu.length];

//      loop untuk menampilkan menu dan harga
        System.out.println("============================");
        System.out.println("SELAMAT DATANG DI WARTEG JRS");
        System.out.println("============================");
        System.out.println("MENU");
        for (int i=0; i < menu.length; i++) {
            System.out.println((i + 1) + "." + menu[i] + " - " + "Rp" + harga[i]);
        }
        System.out.println("0. Selesai");

//      proses input pilihan
        int pilihan;

        while(true) {
           System.out.print("Pilih nomor menu (0 untuk selesai) : ");
           pilihan = scanner.nextInt();

           if (pilihan >= 1 && pilihan <= menu.length) {
               System.out.print("Mau berapa porsi " + menu[pilihan - 1] + ": ");
               int porsi = scanner.nextInt();
               jumlah[pilihan - 1] += porsi;
           } else if (pilihan == 0) {
               break;
           } else {
               System.out.println("tidak ada di menu");
           }
       }
       //System.out.println(Arrays.toString(jumlah));

        //menghitung total pembayaran
        int total = 0;
        System.out.println("==================");
        System.out.println("RINCIAN PEMBAYARAN");
        System.out.println("==================");
        for (int i=0; i < menu.length; i++) {
            if (jumlah[i] > 0){
                int substotal = jumlah[i] * harga[i];
                System.out.println(jumlah[i] + " Porsi " + menu[i] + " = Rp" + substotal);
                //cara menjumlahkan substotal
                total +=substotal;
            }
        }
        System.out.println("==================");
        System.out.println("TOTAL = " + " Rp" + total);
        System.out.println("==================");
        scanner.close();
    }
}
