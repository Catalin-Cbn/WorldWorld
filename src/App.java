import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();
        String pInserita;
        ArrayList<String> rispostaCorretta1 = new ArrayList<>();
        ArrayList<String> rispostaCorretta2 = new ArrayList<>();
        long tempo1 = 0;
        long tempo2 = 0;

        String[] parole = new String[] { "mare", "sole", "pane", "ape", "rapa", "cane", "topo", "pino", "mina",
                "lava" };

        for (int i = 1; i <= 5; i++) {

            System.out.println("\nturno " + i);

            for (int j = 1; j <= 2; j++) {

                System.out.println("\nturno utente " + j);

                int indiceCasuale = rnd.nextInt(10);

                System.out.println("La parola è: " + parole[indiceCasuale]);
                System.out.println("Inserisci una parola che contenga la parola estratta");
                long t = System.currentTimeMillis();
                pInserita = sc.nextLine();
                long tempoF = System.currentTimeMillis() - t;

                System.out.println("è passato: " + tempoF / 1000f + " secondi");

                if (j == 1) {
                    tempo1 = tempo1 + tempoF;
                } else
                    tempo2 = tempo2 + tempoF;

                if (pInserita.indexOf(parole[indiceCasuale]) != -1 && !pInserita.equals(parole[indiceCasuale])&& pInserita.indexOf(" ") == -1) {

                    if (tempoF > 10 * 1000) {
                        System.out.println("tempo limite superato ");
                    } else {
                        System.out.println("La parola è contenuta!");
                        if (j == 1) {
                            rispostaCorretta1.add(pInserita);
                        } else {
                            rispostaCorretta2.add(pInserita);
                        }

                    }
                } else {
                    System.out.println("La parola non è contenuta!");

                }

            }

        }
        if (rispostaCorretta1.size() == rispostaCorretta2.size()) {

            System.out.println("\ngli utenti hanno pareggiato con le parole, vediamo il tempo ");
            System.out.println("\ntempo utente 1: " + tempo1 / 1000f + " secondi");
            System.out.println("\ntempo utente 2: " + tempo2 /1000f + " secondi");

            if (tempo1 > tempo2) {
                System.out.println("ha vinto l'utente 2 ");
            } else if (tempo1 < tempo2) {
                System.out.println("ha vinto l'utente 1 ");
            } else {
                System.out.println("la partita si è conclusa in pareggio ");
            }

        } else if (rispostaCorretta1.size() > rispostaCorretta2.size()) {
            System.out.println("Ha vinto il giocatore 1!");

        } else
            System.out.println("Ha vinto il giocatore 2!");

        sc.close();
    }
}
