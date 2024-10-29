package se.lexicon.util;

public class AccountNumberSequencer {
    private static int sequencer = 1000;

    // implement a method that generates the next account number
    public static int nextId(){
        return ++sequencer;
    }
}
