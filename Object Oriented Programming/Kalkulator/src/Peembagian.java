public class Peembagian extends Campuran{
    int R;
    int S;

    public Peembagian(int r, int s) {
        this.R = r;
        this.S = s;
    }

    @Override
    public void hitungPembagian() {
        super.hitungPembagian();
        System.out.println("hasil pembagian adalah :" + (this.R/this.S));
    }
}
