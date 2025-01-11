import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ElementoMultimediale[] elementi= new ElementoMultimediale[5];

        for (int i = 0; i < elementi.length; i++) {
            System.out.println("Inserisci tipo di elemento (1 = Audio, 2 = Video, 3 = Immagine): ");
            int tipo = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Inserisci titolo: ");
            String titolo = scanner.nextLine();

            if (tipo == 1) {
                System.out.println("Inserisci durata (numero di riproduzioni): ");
                int durata = scanner.nextInt();
                System.out.println("Inserisci volume (numero di punti esclamativi): ");
                int volume = scanner.nextInt();
                elementi[i] = new Audio(titolo, durata, volume);
            } else if (tipo == 2) {
                System.out.println("Inserisci durata (numero di riproduzioni): ");
                int durata = scanner.nextInt();
                System.out.println("Inserisci volume: ");
                int volume = scanner.nextInt();
                System.out.println("Inserisci luminosità: ");
                int luminosita = scanner.nextInt();
                elementi[i] = new Video(titolo, durata, volume, luminosita);
            } else if (tipo == 3) {
                System.out.println("Inserisci luminosità: ");
                int luminosita = scanner.nextInt();
                elementi[i] = new Immagine(titolo, luminosita);
            }
        }


        int scelta;
        do {
            System.out.println("Scegli un elemento da eseguire (1-5 per elemento, 0 per uscire): ");
            scelta = scanner.nextInt();

            if (scelta >= 1 && scelta <= 5) {
                ElementoMultimediale elemento = elementi[scelta - 1];

                if (elemento instanceof Audio) {
                    ((Audio) elemento).play();
                } else if (elemento instanceof Video) {
                    ((Video) elemento).play();
                } else if (elemento instanceof Immagine) {
                    ((Immagine) elemento).show();
                }
            }
        } while (scelta != 0);
        scanner.close();
    }





    }
