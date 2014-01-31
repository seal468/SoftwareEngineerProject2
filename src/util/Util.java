package util;

import java.util.Random;

public class Util {
	private int randomNumber = 0;


public int DieRoll() {
	
	Random randomNumberGenerator = new Random();
	randomNumber = randomNumberGenerator.nextInt(6)+1;
	log("thats a random number: " + randomNumber);
	
	
	return randomNumber;
} //end of class DieRoll

public void Board() {
	
	System.out.println("13--+---+---+---+---18 BAR 19--+---+---+---+---24 OFF");
	System.out.println("X5 | | | O3 | O5 | | | | X2");
	System.out.println("");
	System.out.println("O5 | | | X3 | X5 | | | | O2");
	System.out.println("12--+---+---+---+---07 BAR 06--+---+---+---+---01 OFF");
	
}

private static void log(String aMessage){
    System.out.println(aMessage);
  }

} //end of class Board