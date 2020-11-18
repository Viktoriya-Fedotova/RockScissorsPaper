package com.name.myproject;
import static com.name.myproject.Variants.*;


public class Field {
   private char playerChoice;
   private char pcChoice;

   final static char ROCK = '1';
   final static char SCISSORS = '2';
   final static char PAPER = '3';

   void updateField1(char playerChoice) { //метод (сеттер) для присвоения значения переменной playerChoice
      this.playerChoice = playerChoice; // которая равная переменной choice из метода getInput()
   }

   void updateField2(char pcChoice) { //метод (сеттер) для присвоения значения переменной pcChoice
      this.pcChoice = pcChoice;
   }

}
