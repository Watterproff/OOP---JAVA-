package projekccit;

import java.util.Scanner;

public class spareservation2 {

    public void spa () {

        Scanner r = new Scanner(System.in);
        String namapelanggn = "";
        String tanggalreservasi = "";
        String tukangpijat = "";
        String paketlaytanan = "";
        double totalharga = 0;
        int nokamar = 0;
        String tipetamu = "";
        String tipekamar = "";
        String namaPaketLayanan = "";
        String genderPemijat = "";
        String waktubooking = "";

        System.out.println("apakah ini tamu hotel: (y/n) ");
        tipetamu = r.next();
        if (tipetamu.equals("y")) {
            System.out.println("masukan no kamar anda");
            nokamar = r.nextInt();
            System.out.println("masukan nama pelangan");
            namapelanggn = r.next();
            System.out.println("masukan tipe kamar anda");
            System.out.println("1. Regular");
            System.out.println("2. Deluxe");
            System.out.println("3. Premium");
            System.out.println("4. President Suite");
            int tipekamarInput = r.nextInt();

            switch (tipekamarInput) {
                case 1:
                    tipekamar = "reguler";
                    break;
                case 2:
                    tipekamar = "deluxe";
                    break;
                case 3:
                    tipekamar = "premium";
                    break;
                case 4:
                    tipekamar = "president suite";
                    System.out.println("apakah anda ingin dipijit dikamar");
                    tukangpijat = r.next();
                    if (tukangpijat.equals("y")) {
                        System.out.println("tukang pijat akan ke kamar anda pada jam reservasi");
                    } else {
                        System.out.println("ada harus ke lokasi  pijat pada jam reservasi di lt.7");
                    }
                    break;
                default:
                    System.out.println("kamar tidak valid");
            }

            System.out.println("--------------------------------------------------------");
            System.out.println("masukan gender pemijit: (lk/P) ");
            genderPemijat = r.next();
            if (tukangpijat.equals("lk")) {
                genderPemijat = "laki laki";
            } else if (tukangpijat.equalsIgnoreCase("p")) {
                genderPemijat = "perempuan";
            }
            System.out.println("masukan paket layanan");
            System.out.println("1. Royal Touch Package (120 Minutes) IDR 645.0");
            System.out.println("2. Luxury Package (105 Minutes) IDR 410.0");
            System.out.println("3. Comfort Package Reflexy (115 Minutes) IDR 315.0");
            System.out.println("4. Normal Package Reflexy (75 Minutes) IDR 255.0");
            int paketlaytananInput = r.nextInt();

            switch (paketlaytananInput) {
                case 1:
                    namaPaketLayanan = "Royal Touch Package";
                    System.out.println("silahkan masukan jam reservasi spa: (format: 00.00)");
                    waktubooking = r.next();
                    
                    totalharga = 645.000;
                    break;
                case 2:
                    namaPaketLayanan = "Luxury Package";
                    System.out.println("silahkan masukan jam reservasi spa: (format: 00.00)");
                    waktubooking = r.next();
                    totalharga = 410.000;
                    break;
                case 3:
                    namaPaketLayanan = "Comfort Package Reflexy";
                    System.out.println("silahkan masukan jam reservasi spa: (format: 00.00)");
                    waktubooking = r.next();
                    totalharga = 315.000;
                    break;
                case 4:
                    namaPaketLayanan = "Normal Package Reflexy";
                    System.out.println("silahkan masukan jam reservasi spa: (format: 00.00)");
                    waktubooking = r.next();
                    totalharga = 255.000;
                    break;
                default:
                    System.out.println("paket tidak valid");
                    break;
            }
        } else {
            System.out.println("anda bukan tamu hotel");
            System.out.println("masukan nama pelanggan: ");
            namapelanggn = r.next();
            System.out.println("masukan gender pemijit: (lk/P) ");
            genderPemijat = r.next();
            if (tukangpijat.equals("lk")) {
                genderPemijat = "laki laki";
            } else if (tukangpijat.equalsIgnoreCase("p")) {
                genderPemijat = "perempuan";
            }
            System.out.println("--------------------------------------------------------");
            System.out.println("masukan paket layanan");
            System.out.println("1. Royal Touch Package (120 Minutes) IDR 645.0");
            System.out.println("2. Luxury Package (105 Minutes) IDR 410.0");
            System.out.println("3. Comfort Package Reflexy (115 Minutes) IDR 315.0");
            System.out.println("4. Normal Package Reflexy (75 Minutes) IDR 255.0");
            int paketlaytananInput = r.nextInt();

            switch (paketlaytananInput) {
                case 1:
                    namaPaketLayanan = "Royal Touch Package";
                    System.out.println("masukan tanggal reservasi (min H-1)");
                    tanggalreservasi = r.next();
                    System.out.println("silahkan masukan jam reservasi spa: (format: 00.00)");
                    waktubooking = r.next();
                    totalharga = 645.000;
                    break;
                case 2:
                    namaPaketLayanan = "Luxury Package";
                    System.out.println("masukan tanggal reservasi (min H-1)");
                    tanggalreservasi = r.next();
                    System.out.println("silahkan masukan jam reservasi spa: (format: 00.00)");
                    waktubooking = r.next();
                    totalharga = 410.000;
                    break;
                case 3:
                    namaPaketLayanan = "Comfort Package Reflexy";
                    System.out.println("masukan tanggal reservasi (min H-1)");
                    tanggalreservasi = r.next();
                    System.out.println("silahkan masukan jam reservasi spa: (format: 00.00)");
                    waktubooking = r.next();
                    totalharga = 315.000;
                    break;
                case 4:
                    namaPaketLayanan = "Normal Package Reflexy";
                    System.out.println("masukan tanggal reservasi (min H-1)");
                    tanggalreservasi = r.next();
                    System.out.println("silahkan masukan jam reservasi spa: (format: 00.00)");
                    waktubooking = r.next();
                    totalharga = 255.000;
                    break;
                default:
                    System.out.println("paket tidak valid");
                    break;
            }
            
        }

        System.out.println("_--------------------------------------------");
        System.out.println("tipe tamu: " + tipetamu);
        System.out.println("no kamar tamu: " + nokamar);
        System.out.println("nama pelanggan: " + namapelanggn );
        System.out.println("tipe kamar tamu: " + tipekamar);
        System.out.println("paket layanan anda: " + namaPaketLayanan);
        System.out.println("gender pemijit anda: " + genderPemijat);
        System.out.println("tanggal reservasi: " + tanggalreservasi);
        System.out.println("jam anda servasi: " + waktubooking);
        System.out.println("total harga pijat anda: IDR " + totalharga);

    }

}
