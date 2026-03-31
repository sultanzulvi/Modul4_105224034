public class MesinKopi {
    float bijiKopi;
    float air;
    float susu;

    public void IsiUlangBahan(float bijiKopi, float air, float susu){
    this.bijiKopi = bijiKopi;
    this.air = air;
    this.susu = susu;

    System.out.println("Biji Kopi : " + bijiKopi + " Gram");
    System.out.println("Air : " + air + "Mililiter");
    System.out.println("Susu : " + susu + "Mililiter");
    }

    public boolean cekKetersediaanCappucino(){
        if (bijiKopi == 15.0 && air == 50.0 && susu == 100.0){
            return true;
        }
        else {
            return false;
        }
    }

    MesinKopi(){
        this.bijiKopi = 0;
        this.air = 0;
        this.susu = 0;
    } //No. 4
}
