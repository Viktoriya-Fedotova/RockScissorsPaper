package com.name.myproject;
import java.io.IOException;

public class GameLogic {

    private char choice;
    private char choicePC;

    void showMenu() {
        System.out.println("Choose your variant: ");
        System.out.println("        1. ROCK; ");
        System.out.println("        2. SCISSORS; ");
        System.out.println("        3. PAPER; ");
    }

    char getInput()
    throws IOException {
        choice = (char) System.in.read(); //переменной присваивается значение, введенное из консоли
        return choice; // значение переменной choice возвращается как результат работы метода getInput()
    }

    void validateInput(char variant) throws IOException {
        while (variant < '1' | variant > '3') { //цикл, отсеивающий неверные варианты выбора игрока
            System.out.print("Your choice is wrong!");
            System.out.println("Please, choose again.");
            showMenu(); //запуск метода для показа меню
            getInput(); //запуск метода для повторного выбора игрока
        }

        System.out.println("Player choice is " + variant);
    }

    char generationPCVariants() {
      System.out.println("Generation PC variant!");
      char[] index = {'1', '2', '3'}; // массив хранящий выбор ПК типа char
      int randomIndex = (int) (Math.random() * 2); //рандомный выбор индекса из массива от 0 до 2
      choicePC = index[randomIndex]; //переменной choicePC присваивается рандомное значение из массива
      System.out.println("PC choice is " + choicePC);
      return choicePC; //переменная choicePC возвращается как результат работы метода generationPCVariants()
    }

    String checkWinner(char var1, char var2) {
       // System.out.println(choicePC);
       if ( var1 == var2) {
           return "draw";
       } else if ((var1 == '1' && var2 == '2') || (var1 == '2' && var2 == '3') ||
                (var1 == '3' && var2 == '1')) {
           return "win";
       }  else
         //  System.out.println(choicePC);
           /*if ((choice == '2' && (char) choicePC == '1') || (choice == '3' && (char) choicePC == '2') ||
                (choice == '1' && (char) choicePC == '3')) */{
           return "loose";
       }
    }

    void output(String result) {
        if ("draw".equals(result))
            System.out.println("Dead heat.");
        else if ("win".equals(result))
            System.out.println("Congratulation. You win!");
        else if ("loose".equals(result))
            System.out.println("PC is winner!");
    }
}
