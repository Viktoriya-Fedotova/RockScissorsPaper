package com.name.myproject;
import static com.name.myproject.Variants.*;


public class Field {
   private Variants playerChoice;
   private Variants pcChoice;

   void updateField1(Variants playerChoice) { //метод (сеттер) для присвоения значения переменной playerChoice

       this.playerChoice = playerChoice; // которая равная переменной choice из метода getInput()
   }

   void updateField2(Variants pcChoice) { //метод (сеттер) для присвоения значения переменной pcChoice

       this.pcChoice = pcChoice;
   }

   public Variants getFirstUserChoice() {

       return this.playerChoice;
   }

   public Variants getSecondUserChoice() {

       return this.pcChoice;
   }

}
