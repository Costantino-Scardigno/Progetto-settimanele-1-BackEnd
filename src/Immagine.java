public class Immagine  extends ElementoMultimediale implements Luminosità {
    public Immagine(String titolo, int luminosita) {
        super(titolo);
        luminositaComune = luminosita;
    }

    public void aumentaLuminosita() {
        luminositaComune++;
    }

    public void diminuisciLuminosita() {
        if (luminositaComune > 1) {
            luminositaComune--;
        }
    }
    public void show() {
        System.out.println(titolo + " " + "*".repeat(luminositaComune));
    }


}
