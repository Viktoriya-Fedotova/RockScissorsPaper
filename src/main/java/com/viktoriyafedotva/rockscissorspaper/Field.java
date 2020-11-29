package main.java.com.viktoriyafedotva.rockscissorspaper;

public class Field {
    private  Variants playerChoice;
    private  Variants pcChoice;

    void updateField1(Variants playerChoice) {
        this.playerChoice = playerChoice;
    }

    void updateField2(Variants pcChoice) {
        this.pcChoice = pcChoice;
    }

    public Variants getFirstUserChoice() {
        return this.playerChoice;
    }

    public Variants getSecondUserChoice() {
        return this.pcChoice;
    }

    public void showField() {
        System.out.println("Player 1: " + playerChoice);
        System.out.println("Player 2: " + pcChoice);
    }

}
