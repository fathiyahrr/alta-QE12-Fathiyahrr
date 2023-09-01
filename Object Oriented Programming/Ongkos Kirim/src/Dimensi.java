public class Dimensi extends Total{
    double panjang;
    double lebar;
    double tinggi;

    public Dimensi(double panjang, double lebar, double tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    @Override
    public void hitungDimensiBarang() {
        super.hitungDimensiBarang();
        System.out.println("Ukuran dimensi barang adalah:" + (panjang*lebar*tinggi) +"cm3");
    }
}
