public class Truck implements Vehicle {
    public final int TEKERLEK_SAYISI = 6;
    public final int MAXIMUM_HIZ = 140;
    public final boolean GUVENLI_MI = true;

    private int hiz;
    private int yas;
    private int yükKapasitesi;
    

    public Truck() {
        this.hiz = 0;
        this.yas = 0;
        this.yükKapasitesi = 0;
    }

    public Truck(int yükKapasitesi) {
        this.hiz = 0;
        this.yas = 0;
        this.yükKapasitesi = yükKapasitesi;
    }

    // set methodu = yük kapasitesi private olduğu için dişaridan bir değer atarken burayi kullaniriz

    public void setYukKapasitesi(int yükKapasitesi) {
        this.yükKapasitesi = yükKapasitesi;
    }

    @Override
    public void hiziArtir(int miktar) {
         hiz += miktar;
    }

    @Override
    public void hiziAzalt(int miktar) {
        hiz -= miktar;
    }

    @Override
    public int mevcutHiz() {
        return hiz;
    }

    @Override
    public String ozellikleriBastir() {
        return "Tir hiz: " + this.hiz + " km/s"
        +", yas: " + this.yas + " yil " + ", yükKapasitesi: " + this.yükKapasitesi + " ton";
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
}
