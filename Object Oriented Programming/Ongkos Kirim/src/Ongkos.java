public class Ongkos extends Total {
    double ongkosKirim;

    public Ongkos(double ongkosKirim) {
        this.ongkosKirim = ongkosKirim;
    }

    @Override
    public void hitungOngkos() {
        super.hitungOngkos();
        System.out.println("Total ongkos kirim adalah : Rp."+ ongkosKirim*5000);
    }
}
