import java.util.*;
#public class Snake {
    public static void main(String[] darsh) {

        int Player_1 = 0;
        int Player_2 = 0;
        boolean is_Player = true;
        final int No_Play = 1;
        final int Ladder = 2;
        final int snake = 3;
        int DieRolls = 0;

        Random random = new Random();

        while(Player_1 < 100 && Player_2 < 100)
        {
            int Dice = random.nextInt(6) + 1;
            DieRolls += 1;
            int Options = random.nextInt(3) + 1;

            switch (Options)
            {
                case No_Play:
                    break;

                case Ladder:
                    if(is_Player)
                    {
                        if(Player_1 + Dice <= 100)
                        {
                            Player_1 += Dice;
                            is_Player = false;

                        }
                    }else if (Player_2 + Dice <= 100)
                    {
                        Player_2 +=Dice;
                        is_Player = true;

                    }
                    break;
                case snake:
                    if(is_Player) {
                        if (Player_1 - Dice >= 0) {
                            Player_1 -= Dice;

                        } else {
                            Player_1 = 0;
                        }
                    }else if (Player_2 - Dice >= 0)
                    {
                        Player_2 -= Dice;
                    }else
                    {
                        Player_2 = 0;
                        break;
                    }
                    is_Player = !is_Player;
                    System.out.println("Current positions of player1 and player2 are: "+Player_1+"and "+Player_2);
            }

        }
        System.out.println("Number of times die has rolled: "+DieRolls);
        if (Player_1 == 100){
            System.out.println("Player1 has WON!");
        }else {
            System.out.println("Player2 has WON!");
        }

    }
}

