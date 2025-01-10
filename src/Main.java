//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Audio audio= new Audio("Mr simpatia",2,5);
        Video video= new Video("FORESTA 4K",3,5,2);
        System.out.println("Riproduzione Audio:");
        audio.play();
        System.out.println("Riproduzione video:");
        video.play();
        audio.alzaVolume();
        audio.play();
        video.play();



    }
}