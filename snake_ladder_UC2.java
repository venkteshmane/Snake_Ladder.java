package snakeladder;
import java.util.Random;
public class snake_ladder_UC2 {

	public static void main(String[] args) {
		   int playerPosition = 0;
	       System.out.println("Welcome to Snake Ladder Program");

	//Player Position Start With Zero
	       System.out.println("Player Position:" + playerPosition);
	//Roll Dice
	       Random rand = new Random();
	       int dice = rand.nextInt((6)+1);
	       System.out.println("Roll Dice: " + dice);
	    }
	}