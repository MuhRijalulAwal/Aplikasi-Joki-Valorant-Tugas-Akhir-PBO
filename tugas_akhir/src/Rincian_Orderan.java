import java.util.Arrays;

public class Rincian_Orderan implements Home{
    char[] username;
    char[] password;
    String no_wa;

    public char[] getUsername() {
        return username;
    }

    public void setUsername(char[] username) {
        this.username = username;
    }

    public char[] getPassword() {
        return password;
    }

    public void setPassword(char[] password) {
        this.password = password;
    }

    public String getNo_wa() {
        return no_wa;
    }

    public void setNo_wa(String no_wa) {
        this.no_wa = no_wa;
    }

    public Rincian_Orderan(){
        this.username=username;
        this.password=password;
        this.no_wa=no_wa;
    }

    public void tampilkan(){
        System.out.println("\t\t---------------------------------");
        System.out.println("\t\t=\tTAMPILAN RINCIAN ORDERAN\t=");
        System.out.println("\t\t---------------------------------");
    }

    public void tampilkan_data(){
        System.out.println("-REKAP DATA-");
        System.out.println("Username\t:"+ Arrays.toString(username));
        System.out.println("Password\t:"+ Arrays.toString(password));
        System.out.println("No.Whatsapp\t:"+no_wa);
    }
}
