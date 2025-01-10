public class Video extends ElementoMultimediale implements Riproducibile, Luminosità {
    private int durata;


    public Video(String titolo,int durata, int volume, int luminosità){
        super(titolo);
        volumeComune = volume;
        this.durata=durata;
        luminositaComune=luminosità;

    }
    public void alzaVolume() {
        volumeComune++;
    }

    public void abbassaVolume() {
        if (volumeComune > 1) {
            volumeComune--;
        }
    }

    public void aumentaLuminosita() {
        luminositaComune++;
    }
    public  void diminuisciLuminosita() {
        if (luminositaComune > 1) {
            luminositaComune--;
        }
    }


    public void play() {
        for (int i=0; i<durata; i++){
            System.out.println(titolo + " " + "!".repeat(volumeComune) + " " + "*".repeat(luminositaComune));
        }
    }
}
