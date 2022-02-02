package snakeladder;
import java.util.Random;

public class snake_ladder_UC5 {

	public static final int NO_PLAY = 1;
    public static final int LADDER = 2;
    public static final int SNAKE = 3;
    public static final int POSITION_CHECK = 0;
    public static final int WIN_POSITION = 100;

  public static void main(String[] args) {
      int playerPosition = 0;
      int position = 0;
      System.out.println("Welcome to Snake Ladder Program");

//Player Position Start With Zero
      System.out.println("Player Position:" + playerPosition);
//Roll Dice
       Random rand = new Random();
       int dice = 0;
       while (true)
       {
            dice = rand.nextInt((6)+1);
              if(dice != 0) break;

       }
       System.out.println("Number of dice: " + dice);
       while(position < WIN_POSITION){
       Random op = new Random();
       int option = 0;
       while (true)
       {
       option = op.nextInt(4);
       if(option !=0) break;
       }
       System.out.println("**OPTIONS**\nOption 1 : No Play\nOption 2 : Ladder \nOption 3 : Snake ");
       System.out.println("Options : " + option);
       System.out.println("Number of dice: " + dice);
       System.out.println("Roll Dice: " + dice);

//Repeat till the Player get winning point           

            switch (option) {
                   case NO_PLAY:
                        System.out.println("Player stays in the same position : " + position);
                        break;
                    case LADDER:
                        position += dice;
                        if ((position > POSITION_CHECK) && (position < WIN_POSITION)) {
                        System.out.println("Player moves ahead by : " + position);
                        }
                        else  if(position == WIN_POSITION)
                                System.out.println("player Reached win position: " + position);
                        break;
                    case SNAKE:
                        position -= dice;
                        if (((position - dice) > POSITION_CHECK) && (position < 99)) {
                        System.out.println("Player moves behind by : " + position);
                        }
                        break;
                    default:
                        System.out.println("game running");
                    break;
             }
          }
       }
   }