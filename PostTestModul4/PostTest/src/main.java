import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        pelanggan duitKu = new pelanggan();
        Scanner in = new Scanner(System.in);

        System.out.println("Nama : ");
        duitKu.nama = in.nextLine();
        System.out.println("Nomor Telepon : ");
        duitKu.nomorTelepon = in.nextInt();
        System.out.println("Saldo anda : ");
        duitKu.saldo = in.nextDouble();
        
        duitKu.pengisianDana(duitKu.saldo);

        System.out.println("Total Tagihan : ");
        duitKu.tagihan = in.nextInt();

        duitKu.pelunasanTagihan(duitKu.total, duitKu.tagihan);
    }
}
