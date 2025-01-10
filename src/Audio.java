public class Audio extends ElementoMultimediale implements Riproducibile {
    private int durata;

    public Audio(String titolo,int durata,int volume){
        super(titolo);
        volumeComune=volume;
        this.durata=durata;
    }
    public  void alzaVolume() {
        volumeComune++;
    }
    public  void abbassaVolume(){
        if (volumeComune>1) {
            volumeComune--;
        }
    }
    public void play() {
        for (int i=0; i<durata; i++){
            System.out.println(titolo+ " "+ "!".repeat(volumeComune));
        }
    }
}
