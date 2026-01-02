import java.lang.classfile.attribute.ModulePackagesAttribute;

public class main {
    
    public static void main(String[] args) {
        Car araba = new Car();
        Motorcycle motor = new Motorcycle();
        Truck tir = new Truck();
        tir.setYukKapasitesi(200);

        araba.hiziArtir(50);
        motor.hiziArtir(30);
        tir.hiziArtir(70);
        motor.yaslandir();

        motor.setCc(125);

        System.out.println(araba.ozellikleriBastir());
        System.out.println(motor.ozellikleriBastir());
        System.out.println(tir.ozellikleriBastir());
    }
}
