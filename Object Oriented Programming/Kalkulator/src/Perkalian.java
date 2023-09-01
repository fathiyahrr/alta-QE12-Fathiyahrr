public class Perkalian extends Campuran{
    int C;
    int D;

    public Perkalian(int c, int d) {
        this.C = c;
        this.D = d;
    }

    @Override
    public void hitungPerkalian() {
        super.hitungPerkalian();
        System.out.println("hasil perkalian adalah :" + (this.C*this.D));
    }
}
