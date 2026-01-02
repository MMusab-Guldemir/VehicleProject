import java.security.PublicKey;

import javax.swing.plaf.basic.BasicScrollPaneUI.ViewportChangeHandler;

public class Car implements Vehicle{

    public final int TEKERLEK_SAYISI = 4; // Değişmeyen sabit değerler için final kullanılır
    public final int MAXIMIM_HIZ = 240;
    public final boolean GUVENLI_MI = true;

    int hiz;
    int yas;
    int kapiSayisi;

    public Car(){
        this.hiz = 0;
        this.yas = 0;
        this.kapiSayisi = 4;
    }

    public Car(int kapiSayisi){
        this.hiz = 0;
        this.yas = 0;
        this.kapiSayisi = kapiSayisi;
    }

    @Override
    public void hiziArtir(int miktar){
        hiz += miktar;
    }

    @Override
    public void hiziAzalt(int miktar){
        hiz -= miktar;
    }

    @Override
    public int mevcutHiz(){
        return hiz;
    }

    @Override
    public String ozellikleriBastir(){
        return "Araba hiz: " + this.hiz + " km/s" +
         ", yas: " + this.yas + " yil " + ", kapiSayisi: " + this.kapiSayisi + " kapi";
    }

     @Override
     public int tekerlekSayisi(){
        return TEKERLEK_SAYISI;
     }

     @Override
     public int maximumHiz(){
        return MAXIMIM_HIZ;
     }
     
     @Override 
     public boolean guvenliMi(){
        return GUVENLI_MI;
     }

     @Override public void yaslandir(){
        yas++;
     }
}