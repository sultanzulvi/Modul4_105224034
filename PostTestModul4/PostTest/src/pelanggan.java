public class pelanggan {
        String nama;
        int nomorTelepon;
        double saldo = 0;
        double total = 0;
        double tagihan;

        public void pengisianDana(double saldo){
            if(saldo < 10000){
                System.out.println("Miskin!!");
            }else{
                this.total += saldo;
                System.out.println("Saldo anda : " + saldo);
            }
        }

        public void pelunasanTagihan(double total, double jumlahTagihan){
            if(saldo < jumlahTagihan){
                System.out.println("Saldo anda tidak cukup!!");
            }else{
                System.out.println("Jumlah Tagihan sebesar : " + jumlahTagihan);
                System.out.println("Saldo anda sekarang : " + (saldo-jumlahTagihan));
            }
        }
    }

