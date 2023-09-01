public class Penjumlahan extends Campuran {
    int X;
    int Y;

    public Penjumlahan(int x, int y) {
        this.X = x;
        this.Y = y;
    }

    @Override
    public void hitungPenjumlahan() {
        super.hitungPenjumlahan();
        System.out.println("hasil penjumlahan adalah : " + (this.X + this.Y));
    }
}
