# Esercizio: Word in word

Scrivere un programma Java che simula un gioco tra due giocatori, secondo queste regole:  

*   Il gioco si svolge a turni 
*   In ogni turno viene estratta casualmente una parola da un elenco predefinito di 10 parole (es: "mare", "sole", "pane", ecc.)
*   Il giocatore corrente deve inserire una parola che contiene la parola estratta (es: se la parola estratta è "sole", il giocatore può inserire "insolente")
*   Se la risposta inserita dall'utente non contiene la parola estratta, la risposta viene scartata
*   Ogni giocatore ha a disposizione al massimo 10 secondi per inserire la sua risposta, che altrimenti verrà scartata
*   Il gioco termina dopo 5 turni 
*   Al termine del gioco viene visualizzato per ogni giocatore, l'elenco delle risposte corrette
*   Vince il giocatore che ha inserito più parole corrette. In caso di parità, vince il giocatore che ha impiegato meno tempo in totale

L'esercizio deve essere svolto in più passi:

**passo 1**: estrarre una parola in maniera casuale, visualizzarla all'utente e chiedere di inserire la sua risposta. Mostrare se la risposta è esatta o errata (utilizzare la funzione `indexOf` delle stringhe)

Esempio:

```java
    String parola1="sole";
    String parola2="insolente";
    String parola3="sola";
    //indexOf restistuisce la posizione della parola1 all'interno di parola2, oppure -1 se non è contenuta
    if (parola2.indexOf(parola1))   //in questo caso l'if è vero
        System.out.println("è contenuta");  
    else
        System.out.println("non è contenuta");

    if (parola2.indexOf(parola3))   //in questo caso l'if è false
        System.out.println("è contenuta");  
    else
        System.out.println("non è contenuta");
```

**passo 2**: mostrare il turno e il giocatore corrente. Per ogni turno devono giocare entrambi i giocatori. Ripetere per 5 turni

**passo 3**: memorizzare in due arraylist diverse le risposte **corrette** dei due giocatori

**passo 4**: al termine della partita visualizzare l'eventuale vincitore, contando solo il numero di risposte corrette (non il tempo impiegato)  
  
**passo 5**: calcolare il tempo impiegato da un giocatore per dare la risposta. Utilizzare l' istruzione System.currentTimeMillis come nel seguente esempio:

```java
long inizioTempoMillisecondi = System.currentTimeMillis();
// Fai qualcosa...
long fineTempoMillisecondi = System.currentTimeMillis();
long secondiTrascorsi = (fineTempoMillisecondi - inizioTempoMillisecondi) / 1000;
System.out.println("Secondi trascorsi: " + secondiTrascorsi);   
```