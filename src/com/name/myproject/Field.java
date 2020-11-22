package com.name.myproject;
import static com.name.myproject.Variants.*;


public class Field {
   private Variants playerChoice;
   private Variants pcChoice;
   private Variants firstUserChoice;
   private Variants secondUserChoice;

   Variants rock = Variants.ROCK;
   Variants scissors = Variants.SCISSORS;
   Variants paper = Variants.PAPER;

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



 /*  public char getUserChoice() {
       return playerChoice;
   }

   public char getPcChoice() {
       return pcChoice;
   }

*/
}
