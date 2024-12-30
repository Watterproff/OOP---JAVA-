package projekccit;
import java.util.Scanner;
public class RoomReservationrev2 {
        private String nama;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
        
    public static void main(String[] args) {
       
        int tipekamar;
        int berapamalam;
        String chekin;
        String chekout;
        int umur;
        String nomorhp;
        String noktp;
        int breakfast = 0;
        String bedChoice = "";
        double totalHarga = 0;
        

        System.out.println("Selamat datang di Musang Hotel & Resort");
        System.out.println("Silahkan reservasi kamar Anda menginap");
        System.out.println("------------------------------------------");
        System.out.println("Masukkan berapa malam menginap:");
        Scanner r = new Scanner(System.in);
        berapamalam = r.nextInt();
        System.out.println("Masukkan tanggal check-in (format: DD/MM/YY):");
        chekin = DateFormat(r.next());
        System.out.println("Masukkan tanggal check-out (format: DD/MM/YY):");
        chekout = DateFormat(r.next());
        System.out.println("Masukkan ID number:");
        noktp = r.next();
        System.out.println("------------------------------------------");
        System.out.println("Masukkan tipe kamar:");
        System.out.println("1. Regular (Rp 850,000)");
        System.out.println("2. Deluxe (Rp 1,250,000)");
        System.out.println("3. Premium (Rp 2,500,000)");
        System.out.println("4. President Suite (Rp 6,700,000)");
        tipekamar = r.nextInt();

        switch (tipekamar) {
            case 1:
                totalHarga = 850000 * berapamalam;
                System.out.println("Apakah Anda ingin memesan sarapan? (1. Ya / 2. Tidak)");
                int breakfastOption = r.nextInt();
                if (breakfastOption == 1) {
                    breakfast = 50000;
                }
                System.out.println("Pilih jenis tempat tidur (1. King size / 2. Twin size)");
                int bedOption = r.nextInt();
                if (bedOption == 1) {
                    bedChoice = "King size bed";
                } else if (bedOption == 2) {
                    bedChoice = "Twin size bed";
                }
                break;
            case 2:
                totalHarga = 1250000 * berapamalam;
                System.out.println("Apakah Anda ingin memesan sarapan? (1. Ya / 2. Tidak)");
                breakfastOption = r.nextInt();
                if (breakfastOption == 1) {
                    breakfast = 50000;
                }
                System.out.println("Pilih jenis tempat tidur (1. King size / 2. Twin size)");
                bedOption = r.nextInt();
                if (bedOption == 1) {
                    bedChoice = "King size bed";
                } else if (bedOption == 2) {
                    bedChoice = "Twin size bed";
                }
                break;
            case 3:
                totalHarga = 2500000 * berapamalam;
                break;
            case 4:
                totalHarga = 6700000 * berapamalam;
                break;
            default:
                System.out.println("Tipe tidak tersedia");
                System.exit(0);
        }

        totalHarga += breakfast;

        System.out.println("Silahkan isi data diri");
        System.out.println("Masukkan nama:");
        RoomReservationrev2 obj = new RoomReservationrev2();
        
        obj.setNama(r.next());
        System.out.println("Masukkan umur:");
        umur = r.nextInt();
        System.out.println("Masukkan nomor handphone (format: 000000000000):");
        nomorhp = PhoneNumber(r.next());

        System.out.println("------------------------------------------");
        System.out.println("Detail Reservasi:");
        System.out.println("Nama: " + obj.getNama());
        System.out.println("Nomor Telepon: " + nomorhp);
        System.out.println("Tipe Kamar: " + getTipeKamarString(tipekamar));
        if (tipekamar == 1 || tipekamar == 2) {
            System.out.println("Jenis Tempat Tidur: " + bedChoice);
            System.out.println("Sarapan: " + (breakfast > 0 ? "Ya" : "Tidak"));
        }
        System.out.println("Durasi Menginap: " + berapamalam + " malam");
        System.out.println("Check-in: " + chekin);
        System.out.println("Check-out: " + chekout);
        System.out.println("KTP Number: " + noktp);
        System.out.println("Total Harga: Rp " + totalHarga);
    }

    public static String DateFormat(String inputDate) {
        if (inputDate.matches("\\d{2}/\\d{2}/\\d{2}")) {
            return inputDate;
        } else {
            System.out.println("Format tanggal salah. Harap masukkan tanggal dengan format DD/MM/YY.");
            System.exit(0);
        }
        return null;
    }

    public static String PhoneNumber(String phoneNumber) {
        if (phoneNumber.matches("\\d{12}")) {
            return phoneNumber;
        } else {
            System.out.println("Format nomor handphone salah. Harap masukkan nomor dengan format 000000000000.");
            System.exit(0);
        }
        return null;
    }

    public static String getTipeKamarString(int tipe) {
        switch (tipe) {
            case 1:
                return "Regular";
            case 2:
                return "Deluxe";
            case 3:
                return "Premium";
            case 4:
                return "President Suite";
            default:
                return "Tipe tidak tersedia";
        }
    }
}