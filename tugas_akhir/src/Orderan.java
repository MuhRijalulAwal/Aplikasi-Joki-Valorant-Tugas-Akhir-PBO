import java.util.Scanner;
public class Orderan implements Home{
    Scanner scan = new Scanner(System.in);

    public String rank_awal, rank_tujuan, server, jenis_proses, jenis_agent, kode_voucher;
    public int metode_bayar;

    public String getRank_awal() {
        return rank_awal;
    }

    public void setRank_awal(String rank_awal) {
        this.rank_awal = rank_awal;
    }

    public String getRank_tujuan() {
        return rank_tujuan;
    }

    public void setRank_tujuan(String rank_tujuan) {
        this.rank_tujuan = rank_tujuan;
    }

    public String getServer() {
        return server;
    }

    public void setServer(String server) {
        this.server = server;
    }

    public String getJenis_proses() {
        return jenis_proses;
    }

    public void setJenis_proses(String jenis_proses) {
        this.jenis_proses = jenis_proses;
    }

    public String getJenis_agent() {
        return jenis_agent;
    }

    public void setJenis_agent(String jenis_agent) {
        this.jenis_agent = jenis_agent;
    }

    public String getKode_voucher() {
        return kode_voucher;
    }

    public void setKode_voucher(String kode_voucher) {
        this.kode_voucher = kode_voucher;
    }

    public int getMetode_bayar() {
        return metode_bayar;
    }

    public void setMetode_bayar(int metode_bayar) {
        this.metode_bayar = metode_bayar;
    }


    public Orderan() {
        this.rank_awal=rank_awal;
        this.rank_tujuan=rank_tujuan;
        this.server=server;
        this.jenis_agent=jenis_agent;
        this.jenis_proses=jenis_proses;
        this.kode_voucher=kode_voucher;
        this.metode_bayar=metode_bayar;
    }

    public void tampilkan(){
        System.out.println("\t\t-------------------------");
        System.out.println("\t\t=\tTAMPILAN ORDERAN\t=");
        System.out.println("\t\t-------------------------");
    }
}
