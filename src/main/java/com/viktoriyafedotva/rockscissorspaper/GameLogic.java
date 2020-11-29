package main.java.com.viktoriyafedotva.rockscissorspaper;

import javax.print.DocFlavor;
import java.util.Random;
import java.util.Scanner;

public class GameLogic {

    final static String str1 = "Your choice is wrong!";
    final static String str2 = "Please, choose again.";
    final static String str3 = "Generation PC variant!";

    private final Field field = new Field();
    private final Scanner scanner = new Scanner(System.in);

    private void showMenu() {
        System.out.println("Choose your variant: ");
        System.out.println("         1.ROCK; ");
        System.out.println("         2.SCISSORS; ");
        System.out.println("         3.PAPER; ");
    }

    private Integer getInput() {
        return scanner.nextInt();
    }

    private boolean validateInput(Integer input) {
        if (input < 1 || input > 3) {
            System.out.println(str1);
            System.out.println(str2);
            return false;
        }
        return true;
    }

    private Variants generatePCChoice() {
        System.out.println(str3);
        int randomIndex = new Random().nextInt(3);
        return Variants.values()[randomIndex];
    }

    private Variants convertChoice(Integer input) {
        return Variants.values()[input];
    }

    private String checkWinner() {
        if (field.getFirstUserChoice().equals(field.getSecondUserChoice())) {
            return "draw";
        } else if ((field.getFirstUserChoice().equals(Variants.ROCK) && field.getSecondUserChoice().equals(Variants.SCISSORS)) ||
                (field.getFirstUserChoice().equals(Variants.SCISSORS) && field.getSecondUserChoice().equals(Variants.PAPER)) ||
                (field.getFirstUserChoice().equals(Variants.PAPER) && field.getSecondUserChoice().equals(Variants.ROCK))) {
            return "win";
    } return "loose";

    }

    public void start() {
        showMenu();
        Integer input = getInput();
        while (!validateInput(input)) {
            input  = getInput();
        }

        Variants userChoice = convertChoice(input);
        Variants pcChoice = generatePCChoice();
        field.updateField1(userChoice);
        field.updateField2(pcChoice);
        field.showField();
        System.out.println(checkWinner());
    }



}