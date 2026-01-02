public class Motorcycle implements Vehicle {
    public final int TEKERLEK_SAYISI = 2;
    public final int MAXIMUM_HIZ = 125;
    public final boolean GUVENLI_MI = false;

    int hiz;
    int yas;
    int cc;

    @Override
    public void hiziArtir(int miktar) {
       this.hiz += miktar;
    }

    @Override
    public void hiziAzalt(int miktar) {
        this.hiz -= miktar;
    }

    @Override
    public int mevcutHiz() {
        return this.hiz;
    }


    @Override
    public String ozellikleriBastir() {
        return "Motor hiz: " + this.hiz + " km/s"
        +", yas: " + this.yas + " yil " + ", cc: " + this.cc + " cc";
    }

    @Override
    public int tekerlekSayisi() {
        return TEKERLEK_SAYISI;
    }

    @Override
    public int maximumHiz() {
        return MAXIMUM_HIZ;
    }

    @Override
    public boolean guvenliMi() {
        return GUVENLI_MI;
    }

    @Override
    public void yaslandir() {
        yas++;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }
    
}
