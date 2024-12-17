import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();
        String pInserita;

        String[] parole = new String[] { "mare", "sole", "pane", "ape", "rapa", "cane", "topo", "pino", "mina",
                "lava" };
        int indiceCasuale = rnd.nextInt(10);

        System.out.println("La parola è: " + parole[indiceCasuale]);
        System.out.println("Inserisci una parola che contenga la parola estratta");
        pInserita = sc.nextLine();

        if (pInserita.indexOf(parole[indiceCasuale]) != -1) {
            System.out.println("La parola è contenuta!");

        } else {
            System.out.println("La parola non è contenuta!");

        }

        sc.close();
    }
}
