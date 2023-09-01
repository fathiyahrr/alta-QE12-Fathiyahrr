public class Pengurangan extends Campuran{
    int A;
    int B;

    public Pengurangan(int a, int b) {
        this.A = a;
        this.B = b;
    }

    @Override
    public void hitungPengurangn() {
        super.hitungPengurangn();
        System.out.println("hasil pengurangan adalah :" + (this.A - this.B));
    }
}
