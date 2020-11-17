package com.name.myproject;

public class Field {
   private char playerChoice;
   private int pcChoice;

   void updateField1(char playerChoice) { //метод (сеттер) для присвоения значения переменной playerChoice
      this.playerChoice = playerChoice; // которая равная переменной choice из метода getInput()
   }

   void updateField2(char pcChoice) { //метод (сеттер) для присвоения значения переменной pcChoice
      this.pcChoice = pcChoice;
     // System.out.println("Your choice is " + playerChoice);
   }

}
