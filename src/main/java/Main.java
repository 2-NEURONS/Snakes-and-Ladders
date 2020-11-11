import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static int currentPosition;


    public static void main(String[] args)
    {
        final int numberOfLines = 10;
        int count = 0;

        Object[] grid = new Object[101];

        GRID: for(int position = 0; position<grid.length; position ++)
        {
            SWITCH: switch (position)
            {
                case 4 :
                    grid[position]="ladder";
                    break;
                case 11 :
                    grid[position]="ladder";
                    break;
                case  30:
                    grid[position]="ladder";
                    break;
                case 44 :
                    grid[position]="ladder";
                    break;
                case 56:
                    grid[position]="ladder";
                    break;
                case 72 :
                    grid[position]="ladder";
                    break;
                case 86 :
                    grid[position]="ladder";
                    break;
                case 20:
                    grid[position]="snake";
                    break;
                case 43:
                    grid[position]="snake";
                    break;
                case 58:
                    grid[position]="snake";
                    break;
                case 69:
                    grid[position]="snake";
                    break;
                case 84:
                    grid[position]="snake";
                    break;
                case 87:
                    grid[position]="snake";
                    break;
                case 99:
                    grid[position]="snake";
                    break;
                default: grid[position]= position;

            } //end of switch

        } // END OF GRID
        rollDice(grid);
    }
    public static void  rollDice(Object[] object)
    {

        System.out.println("Insert a number between 1 - 6:  ");
        Scanner diceRoll = new Scanner(System.in);
        int roll = diceRoll.nextInt();

        if(object[roll] == "ladder")
        {
            currentPosition +=roll;
            System.out.println(object[currentPosition]);

        }
        else
            System.out.println("Negative");


    }//rollDice
}
