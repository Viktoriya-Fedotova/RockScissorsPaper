package com.name.myproject;

import java.io.IOException;

public class GameRunner {
    public static void main(String[] args) throws IOException {
        GameLogic go = new GameLogic();
        Field f = new Field();

        go.showMenu();
        char playerVariant = go.getInput(); //в переменной playerVariant сохраняется рез-т работы метода getInput()
        go.validateInput(playerVariant); // в метод validateInput() передается значение переменной playerVariant (choice)
        char pcVariant = go.generationPCVariants(); //в переменно pcVariant сох-ся рез-т работы метода generationPCVariants()
        f.updateField1(playerVariant); // в метод updateField1() передается значение переменной playerVariant (choice)
        f.updateField2(pcVariant);
        String result = go.checkWinner(playerVariant, pcVariant);
        go.output(result);

    }
}
