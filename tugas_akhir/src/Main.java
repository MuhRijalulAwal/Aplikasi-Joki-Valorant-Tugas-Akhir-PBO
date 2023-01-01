import java.util.Objects;
import java.util.Scanner;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.io.FileNotFoundException;
import java.util.Formatter;

public class Main {
    public static void main(String[] args) {
        String rank_awal, rank_tujuan, server, jenis_proses, jenis_agent, kode_voucher, no_wa;
        char[] password;
        char[] username;
        int metode_bayar;
        int pilih = 0;
        String pilihan = null;

        Scanner scan = new Scanner(System.in);
        Orderan ord = new Orderan();
        Nota nta = new Nota();
        Rincian_Orderan rord = new Rincian_Orderan();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalTime localTime = LocalTime.now();

        //MASUK HOME
        do {
            System.out.println("1. BUAT ORDER");
            System.out.println("2. CEK PESANAN");
            System.out.print("PILIH : ");
            pilih = scan.nextInt();
        }while (pilih != 1 && pilih != 2);

        //BUAT ORDER
        if (pilih == 1) {
            do {
                ord.tampilkan();
                System.out.println("BUAT ORDERAN ~~~~~~~~~~~~~~~~");
                System.out.println("-----------------------------------------------------------");
                System.out.print("Pilih Rank Awal (cth: Iron 1) *gunakan spasi : ");
                rank_awal = scan.nextLine();
                nta.setRank_awal(rank_awal);
                System.out.print("Pilih Rank Tujuan (cth: Iron 2) *gunakan spasi : ");
                rank_tujuan = scan.nextLine();
                nta.setRank_tujuan(rank_tujuan);
                System.out.println("Server : ASIA");
                System.out.println("-----------------------------------------------------------");
                System.out.println("METODE PEMBAYARAN");
                System.out.println("1. (QRIS) DANA,OVO,GOPAY,SHOPEEPAY");
                System.out.println("2. BNI");
                System.out.println("3. BRI");
                System.out.println("4. MANDIRI");
                System.out.print("Pilih Metode Pembayaran : ");
                metode_bayar = scan.nextInt();
                nta.setMetode_bayar(metode_bayar);
                System.out.println("\n");
                System.out.println("KETERANGAN TAMBAHAN ~~~~~~~~~~~~~~~~");
                System.out.println("-----------------------------------------------------------");
                System.out.println("PROSES");
                System.out.println("1. Normal (3-7 hari)");
                System.out.println("2. Cepat (2-3 hari)");
                System.out.println("3. Kilat (1 hari)");
                System.out.print("Pilih Kecepatan Proses :");
                jenis_proses = scan.next();
                nta.setJenis_proses(jenis_proses);
                System.out.println("AGENT");
                System.out.print("TV Agent (req agent) *jika tidak ada, ketik no: ");
                jenis_agent = scan.next();
                nta.setJenis_agent(jenis_agent);

                //NOTA
                System.out.println("\n");
                nta.hitung_subtotal();
                nta.hitung_diskon();
                nta.hitung_tvproses();
                nta.hitung_tvagent();
                nta.hitung_total();
                nta.total();
                System.out.println("1. Lanjut Checkout ");
                System.out.println("2. Kembali");
                System.out.println("3. Keluar");
                System.out.print("PILIHAN : ");
                pilih = scan.nextInt();
            } while (pilih == 2);

            //RINCIAN_ORDERAN
            if (pilih == 1) {
                rord.tampilkan();
                do {
                    System.out.print("Masukkan Username : ");
                    username = scan.next().toCharArray();
                    rord.setUsername(username);
                    System.out.print("Masukkan Password : ");
                    password = scan.next().toCharArray();
                    rord.setPassword(password);
                    System.out.print("Masukkan No.Whatsapp : ");
                    no_wa = scan.next();
                    rord.setNo_wa(no_wa);
                    rord.tampilkan_data();
                    System.out.println("Apakah Data Sudah Benar ?");
                    System.out.println("Ketik 'y' jika benar");
                    System.out.println("Ketik 'n' jika salah");
                    System.out.print("KETIK : ");
                    pilihan = scan.next();
                } while (Objects.equals(pilihan, "n"));
            } else if (pilih == 3) {
                System.out.println("Keluar Program");
            }
             //METODE PEMBAYARAN
            if (metode_bayar == 1) {
                System.out.println("\t\t------------------------------");
                System.out.println("\t\t=\tMETODE PEMBAYARAN QRIS\t=");
                System.out.println("\t\t------------------------------");
                System.out.println("Silahkan Scan");
                System.out.println("---------------");
                System.out.println(" *GAMBAR QRIS*");
                System.out.println("---------------");
                System.out.println("Lakukan Pembayaran Maksimal 30 Menit dari Waktu di bawah");
                System.out.println(dateTimeFormatter.format(localTime));
            } else if (metode_bayar == 2) {
                System.out.println("\t\t-----------------------------");
                System.out.println("\t\t=\tMETODE PEMBAYARAN BNI\t=");
                System.out.println("\t\t-----------------------------");
                System.out.println("No.Rek = 6463050035");
                System.out.println("Atas nama : Muhammad Rijalul Awal");
                System.out.println("Lakukan Pembayaran Maksimal 30 Menit dari Waktu di bawah");
                System.out.println(dateTimeFormatter.format(localTime));
            } else if (metode_bayar == 3) {
                System.out.println("\t\t------------------------------");
                System.out.println("\t\t=\tMETODE PEMBAYARAYN BRI\t=");
                System.out.println("\t\t------------------------------");
                System.out.println("No.Rek = 70004823428");
                System.out.println("Atas nama : Muhammad Rijalul Awal");
                System.out.println("Lakukan Pembayaran Maksimal 30 Menit dari Waktu di bawah");
                System.out.println(dateTimeFormatter.format(localTime));
            } else if (metode_bayar == 4) {
                System.out.println("\t\t---------------------------------");
                System.out.println("\t\t=\tMETODE PEMBAYARAN MANDIRI\t=");
                System.out.println("\t\t---------------------------------");
                System.out.println("No.Rek = 10009374932");
                System.out.println("Atas nama : Muhammad Rijalul Awal");
                System.out.println("Lakukan Pembayaran Maksimal 30 Menit dari Waktu di bawah");
                System.out.println(dateTimeFormatter.format(localTime));
            }

            System.out.println("Jika sudah bayar, cetak Invoice");
            System.out.print("sudah/belum");
            pilihan = scan.next();
            if (pilihan == "sudah"){
                try (Formatter file = new Formatter("invoice.txt")) {

                    //Menulis data baru pada file yang bersangkutan
                    file.format("%s %n", "Android Developer");
                    file.format("%s %n", "Blogger");
                    file.format("%s %n", "Bisnis Online");

                }catch(FileNotFoundException ex){
                    //Menampilkan pesan jika file tidak ditemukan
                    System.out.println("File Tidak Ditemukan");
                }
            }
        }
    }
}