public class Berat extends Total {
    double berat;

    public Berat(double berat) {
        this.berat = berat;
    }

    @Override
    public void hitungBeratBarang() {
        super.hitungBeratBarang();
        System.out.println("Berat barang adalah :" + this.berat + "kg");
    }
}
