

public class InstrumentsTest {
    public static void main(String[] args) {
        Instruments piano = new Instruments();
        piano.display();
        Instruments guitar = new Instruments("Guitar",340);
        guitar.display();

        Instruments drum = new Instruments ();
        drum.setName("Drum");
        drum.setPrice(300);
        drum.display();
    }
}
