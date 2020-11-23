package com.name.myproject;
import com.sun.xml.internal.fastinfoset.util.ValueArray;

import java.io.IOException;

public class GameLogic {

    private char choice;
    private char choicePC;
    private char playerVariant;
  //  private char pcVariant;
    Variants var1;
    Variants var2;

   private void showMenu() {
        System.out.println("Choose your variant: ");
        System.out.println("        1. ROCK; ");
        System.out.println("        2. SCISSORS; ");
        System.out.println("        3. PAPER; ");
    }

    private char getInput() {
       try {
           choice = (char) System.in.read(); //переменной присваивается значение, введенное из консоли
       } catch (IOException e) {
           System.out.println(e.getMessage());
       }
        return choice; // значение переменной choice возвращается как результат работы метода getInput()
    }

    private void validateInput(char variant) {
        while (variant < '1' | variant > '3') { //цикл, отсеивающий неверные варианты выбора игрока
            System.out.print("Your choice is wrong!");
            System.out.println("Please, choose again.");
            showMenu(); //запуск метода для показа меню
            getInput(); //запуск метода для повторного выбора игрока
        }
        System.out.println("Player choice is " + variant);

    }

    private char generationPCVariants() {
      System.out.println("Generation PC variant!");
      char[] index = {'1', '2', '3'}; // массив хранящий выбор ПК типа char
      int randomIndex = (int) (Math.random() * 2); //рандомный выбор индекса из массива от 0 до 2
      choicePC = index[randomIndex]; //переменной choicePC присваивается рандомное значение из массива
      System.out.println("PC choice is " + choicePC);
      return choicePC; //переменная choicePC возвращается как результат работы метода generationPCVariants()
    }

    private Variants convertChoice(char userChoice) {

        if (userChoice == '1')
            return Variants.ROCK;
        else if (userChoice == '2')
            return Variants.SCISSORS;
        else
        return Variants.PAPER;
    }

    Field condition = new Field();

    String checkWinner() {
       if ( var1.equals(var2)) {
           return "draw";
       } else if ((var1.equals(Variants.ROCK) && var2.equals(Variants.SCISSORS)) ||
                 (var1.equals(Variants.SCISSORS) && var2.equals(Variants.PAPER)) ||
                 (var1.equals(Variants.PAPER) && var2.equals(Variants.ROCK))) {
           return "win";
       }  else
           return "loose";
    }

    private void output(String result) {
        if (result.equals("draw")) {
            System.out.println("Dead heat.");
        } else if (result.equals("win")) {
            System.out.println("Congratulation. You win!");
        } else if (result.equals("loose"))
            System.out.println("PC is winner!");
    }

    public void logic() {
        showMenu();
        playerVariant = getInput();
        validateInput(playerVariant);
        convertChoice(choice);
        //generationPCVariants();
        //convertChoice(generationPCVariants());
        condition.updateField1(convertChoice(choice));
        condition.updateField2(convertChoice(generationPCVariants()));
        var1 = condition.getFirstUserChoice();
        var2 = condition.getSecondUserChoice();
        checkWinner();
        output(checkWinner());
    }
}
