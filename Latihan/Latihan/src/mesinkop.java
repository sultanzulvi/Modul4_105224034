public class mesinkop {
    public static void main(String[] args){
        MesinKopi mesinLobby = new MesinKopi(); //No. 1
        mesinLobby.IsiUlangBahan(10,20,30); //No. 2
        mesinLobby.cekKetersediaanCappucino();
        System.out.println("Cek : " + mesinLobby.cekKetersediaanCappucino());
    } 
}
