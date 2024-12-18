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

        String[] parole = new String[] { "mare", "sole", "pane", "ape", "rapa", "cane", "topo", "pino", "mina",
                "lava" };

        for (int i = 1; i <= 5; i++) {

            System.out.println("\nturno " + i);

            for (int j = 1; j <= 2; j++) {

                System.out.println("\nturno utente " + j);

                int indiceCasuale = rnd.nextInt(10);

                System.out.println("La parola è: " + parole[indiceCasuale]);
                System.out.println("Inserisci una parola che contenga la parola estratta");
                pInserita = sc.nextLine();

                if (pInserita.indexOf(parole[indiceCasuale]) != -1 && !pInserita.equals(parole[indiceCasuale]) && pInserita.indexOf(" ") == -1) {
                    System.out.println("La parola è contenuta!");
                    if (j==1) {
                    rispostaCorretta1.add(pInserita);  
                    }
                    else {rispostaCorretta2.add(pInserita);}
                } else {
                    System.out.println("La parola non è contenuta!");


                }

            }

        }
        if (rispostaCorretta1.size() == rispostaCorretta2.size()) {
            System.out.println("Pareggio!");
            
        }else if (rispostaCorretta1.size() > rispostaCorretta2.size()) {
            System.out.println("Ha vinto il giocatore 1!");
            
        } else System.out.println("Ha vinto il giocatore 2!");

        sc.close();
    }
}
