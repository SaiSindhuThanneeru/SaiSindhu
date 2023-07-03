package phrasers;

import java.util.concurrent.Phaser;

public class PhraseExMain {
    public static void main(String[] args) {
        Phaser p = new Phaser();
        p.register();
        int currentPhase;
        new PhraseEx(p, 142);
        new PhraseEx(p, 169);
        //waiting for threads to complete phase 0
        currentPhase = p.getPhase();

        p.arriveAndDeregister();

        System.out.println("Phase " + currentPhase
                + " Completed");
        System.out.println("Phase Zero Ended");

        // waiting for threads to complete phase 1
        currentPhase = p.getPhase();
        p.arriveAndAwaitAdvance();
        System.out.println("Phase " + currentPhase
                + " Completed");
        System.out.println("Phase One Ended");
        //waiting for threads to complete phase 2
        currentPhase = p.getPhase();
        p.arriveAndAwaitAdvance();
        System.out.println("Phase " + currentPhase
                + " Completed");
        System.out.println("Phase Two Ended");

        // Deregistering the main thread.
        p.arriveAndDeregister();
        if (p.isTerminated()) {
            System.out.println("Phaser is terminated");
        }
    }
}
