import javax.swing.JOptionPane;
import java.util.Random;
import java.util.StringTokenizer;
import java.util.ArrayList;
public class HaleyIttner_YahtzeeGame {
   public static void main(String[] args) {
      Dice die1 = new Dice();
      Dice die2 = new Dice();
      Dice die3 = new Dice();
      Dice die4 = new Dice();
      Dice die5 = new Dice(); 
      StringTokenizer pasta; 
      ArrayList<Integer> cannoli = new ArrayList<Integer>();     
      
      int ans = JOptionPane.showConfirmDialog(null, "Welcome! Would you like to play some Yahtzee?","Yahtzee Game"
      , JOptionPane.YES_NO_OPTION);
      
      if(ans == 1) {
         JOptionPane.showMessageDialog(null,"Well fine then!");
         }
      else {
      
         int cracker = die1.rollDice();
         int cheese = die2.rollDice();
         int salami = die3.rollDice();
         int cream = die4.rollDice();
         int jam = die5.rollDice();
         cannoli.add(cracker);
         cannoli.add(cheese);
         cannoli.add(salami);
         cannoli.add(cream);
         cannoli.add(jam);         
            
      
         int oop = JOptionPane.showConfirmDialog(null,"Lets gets started then!" + "\n\n" + "Your first roll is: "+ "\n" + "Die 1: " + cracker + 
         "\n" + "Die 2: " + cheese + "\n" + "Die 3: " + salami + "\n" + "Die 4: " + cream + 
         "\n" + "Die 5: " + jam + "\n" + "Would you like to roll any of the dice again?");
         
         if(oop == 0) {
            String nums = JOptionPane.showInputDialog(null, "Which ones? (1-5 with spaces)"); 
            pasta = new StringTokenizer(nums);
            int count = pasta.countTokens();
            int[] change = new int[count];
            for(int x = 0; x < change.length; x++) {
               int tmp = Integer.parseInt(pasta.nextToken());
               change[x] = tmp;
            }
            for(int q = 0; q < change.length; q++) {
               int tmp = change[q];
               System.out.println("Tmp: " + tmp);
               int doof = die1.rollDice();
               System.out.println("Should equal " + doof + " after");
               System.out.println("Previous number: " + cannoli.get(tmp - 1));
               cannoli.set(tmp - 1, doof); 
               System.out.println("Now it is: " + cannoli.get(tmp - 1)); 
            }
            JOptionPane.showMessageDialog(null, "Here we go!");
            String response = "";
            int dieNumber = 1;
            for(int c = 0; c < cannoli.size(); c++) {
               response += "Die " + dieNumber + ": " + cannoli.get(c) + "\n"; 
               dieNumber++;
            }   
            JOptionPane.showMessageDialog(null, "Your new roll is: " + "\n" + response);               
         }
      }
         
      
   }
}

